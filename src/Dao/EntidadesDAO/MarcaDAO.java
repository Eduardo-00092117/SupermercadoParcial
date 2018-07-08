/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Roberto
 */
public class MarcaDAO extends BaseDao<Marca>{
    public MarcaDAO(){
        tabla = new DatosTabla("Marca","idMarca",
                new String[]{"nombre_empresa","nombre_marca","descripcion","FK_idProveedor"}
        );
    }
        
    @Override
    public Marca mapaObjeto(ResultSet resultSet) {
        Marca marca = new Marca();
        try{
            marca.setIdMarca(resultSet.getInt(tabla.PRIMARY_KEY));
            marca.setNombreEmpresa(resultSet.getString(tabla.fields[0]));
            marca.setNombreMarca(resultSet.getString(tabla.fields[1]));
            marca.setDescripcionMarca(resultSet.getString(tabla.fields[2]));
            marca.setFk_idProveedor(resultSet.getInt(tabla.fields[3]));
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return marca;
    }

    @Override
    public PreparedStatement getSelectStatement(Connection con, Marca find, String by) {
        String query = "SELECT * FROM "+tabla.TABLE_NAME+" WHERE "+by+"=?";//TENER CUIDADO CON EL WHERE
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(query);
            if(by.equals(tabla.PRIMARY_KEY)){
                preparedStatement.setInt(1, find.getIdMarca());
            }
            else if(by.equals(tabla.fields[0])){
                preparedStatement.setString(1,"%"+find.getNombreEmpresa()+"%");
            }
            else if(by.equals(tabla.fields[1])){
                preparedStatement.setString(1,"%"+find.getNombreMarca()+"%");
            }
            else if(by.equals(tabla.fields[2])){
                preparedStatement.setString(1, "%"+find.getDescripcionMarca()+"%");
            }
            else if(by.equals(tabla.fields[3])){
                preparedStatement.setInt(1, find.getFk_idProveedor());
            }
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getInsertStatement(Connection con, Marca _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement=con.prepareStatement(
            "INSERT INTO "+ tabla.TABLE_NAME+"("+tabla.fields[0]+","+tabla.fields[1]+","+tabla.fields[2]+","+tabla.fields[3]+")"
                    +" VALUES (?,?,?,?)");
            preparedStatement.setString(1, _new.getNombreEmpresa());
            preparedStatement.setString(2, _new.getNombreMarca());
            preparedStatement.setString(3, _new.getDescripcionMarca());
            preparedStatement.setInt(4, _new.getFk_idProveedor());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getUpdateStatement(Connection con, Marca _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(
            "UPDATE "+tabla.TABLE_NAME+" SET "+tabla.fields[0]+" = ?,"+tabla.fields[1]+" = ?, "+tabla.fields[2]+" = ?, "+tabla.fields[3]
                    +" = ? WHERE "+tabla.PRIMARY_KEY+" = ?"
                    
            );
                 preparedStatement.setString(1, _new.getNombreEmpresa());
                preparedStatement.setString(2, _new.getNombreMarca());
                preparedStatement.setString(3, _new.getDescripcionMarca());
                preparedStatement.setInt(4, _new.getFk_idProveedor());
                preparedStatement.setInt(5, _new.getIdMarca());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getDeleteStatement(Connection con, Marca deleteObject) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(
            "DELETE FROM "+tabla.TABLE_NAME+" WHERE "+ tabla.PRIMARY_KEY+" = ?"
            );
            preparedStatement.setInt(1, deleteObject.getIdMarca());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
            return preparedStatement;
    }
    public List<Marca> findByIdMarca(Marca marca){
        return findBy(marca,tabla.PRIMARY_KEY);
    }
    public List<Marca> findByNombreEmpresa(Marca marca){
        return findBy(marca,tabla.fields[0]);
    }
    public List<Marca> findByNombreMarca(Marca marca){
        return findBy(marca,tabla.fields[1]);
    }
    public List<Marca> findByDescripcion(Marca marca){
        return findBy(marca,tabla.fields[2]);
    }
    public List<Marca> findByFKidProveedor(Marca marca){
        return findBy(marca,tabla.fields[3]);
    }
}
