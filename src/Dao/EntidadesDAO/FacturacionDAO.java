/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Facturacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class FacturacionDAO extends BaseDao<Facturacion>{

    public FacturacionDAO(){
        tabla = new DatosTabla(
                "Facturacion","idFactura", new String[]{
                "fecha_facturacion","hora_facturacion","FK_idEmpleado"}
        );
    }
    @Override
    Facturacion mapaObjeto(ResultSet resultSet) {
        Facturacion fact = new Facturacion();
        try{
            fact.setIdFactura(resultSet.getInt(tabla.PRIMARY_KEY));
            fact.setFechaFactura(resultSet.getString(tabla.fields[0]));
            fact.setHoraFactura(resultSet.getString(tabla.fields[1]));
           fact.setFk_idEmpleado(resultSet.getInt(tabla.fields[2]));
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return fact;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, Facturacion find, String by) {
        String query = "SELECT * FROM "+tabla.TABLE_NAME+" WHERE "+by+" = ?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(query);
            if(by.equals(tabla.PRIMARY_KEY)){
                preparedStatement.setInt(1, find.getIdFactura());
            }
            else if(by.equals(tabla.fields[0])){
                preparedStatement.setString(1,"%"+find.getFechaFactura()+"%");
            }
            else if(by.equals(tabla.fields[1])){
                preparedStatement.setString(1,"%"+find.getHoraFactura()+"%");
            }
        }
        catch (SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, Facturacion _new) {
         PreparedStatement preparedStatement = null;
         try{
              preparedStatement=con.prepareStatement(
            "INSERT INTO "+ tabla.TABLE_NAME+" (CONVERT (date, GETDATE()),"+tabla.fields[1]+","+tabla.fields[2]
                    +" VALUES (?,?,?)");
            preparedStatement.setString(1, _new.getFechaFactura());
            preparedStatement.setString(2, _new.getHoraFactura());
            preparedStatement.setInt(3, _new.getFk_idEmpleado());
         }
         catch(SQLException error){
             error.printStackTrace();
         }
         return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Facturacion _new) {
         PreparedStatement preparedStatement = null;
         try{
              preparedStatement = con.prepareStatement(
            "UPDATE"+tabla.TABLE_NAME+" SET "+tabla.fields[0]+" = ?,"+tabla.fields[1]+" =?, "+tabla.fields[2]
                    +"= ? WHERE "+tabla.PRIMARY_KEY+"=?"    
            );
             preparedStatement.setString(1, _new.getFechaFactura());
             preparedStatement.setString(2, _new.getHoraFactura());
             preparedStatement.setInt(3, _new.getFk_idEmpleado()); 
         }
         catch(SQLException error){
             error.printStackTrace();
         }
         return preparedStatement;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, Facturacion deleteObject) {
                PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(
            "DELETE FROM "+tabla.TABLE_NAME+" WHERE "+ tabla.PRIMARY_KEY+"=?"
            );
            preparedStatement.setInt(1, deleteObject.getIdFactura());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
            return preparedStatement;
    }
    public List<Facturacion> findByIdFactura(Facturacion factura){
        return findBy(factura,tabla.PRIMARY_KEY);
    }
    public List<Facturacion> findByFechaFacturacion(Facturacion factura){
        return findBy(factura,tabla.fields[0]);
    }
    public List<Facturacion> findByHoraFacturacion(Facturacion factura){
        return findBy(factura, tabla.fields[1]);
    }
    public List<Facturacion> findByFKidEmpleado(Facturacion factura){
        return findBy(factura,tabla.fields[2]);
    }
}
