/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.CategoriaMarca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class CategoriaMarcaDAO extends BaseDao<CategoriaMarca> {

    public CategoriaMarcaDAO(){
        tabla = new DatosTabla(
        "CategoriaMarca", "idCategoriaMarca", new String[]{"nombre","descripcion"}
        );
    }
    @Override
    CategoriaMarca mapaObjeto(ResultSet resultSet) {
        CategoriaMarca catMa = new CategoriaMarca();
        try{
            catMa.setIdCategoriaMarca(resultSet.getInt(tabla.PRIMARY_KEY));
            catMa.setNombreCategoriaMarca(resultSet.getString(tabla.fields[0]));
            catMa.setDescripcionCategoriaMarca(resultSet.getString(tabla.fields[1]));
        }
        catch(SQLException error){
            error.printStackTrace();
        }
       return catMa;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, CategoriaMarca find, String by) {
        String query = "SELECT * FROM "+ tabla.TABLE_NAME + "WHERE "+by+"=?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(query);
            if(by.equals(tabla.PRIMARY_KEY)){
                preparedStatement.setInt(1, find.getIdCategoriaMarca());
            }
            else if(by.equals(tabla.fields[0])){
                preparedStatement.setString(1, "%"+find.getNombreCategoriaMarca()+"%");
            }
            else if(by.equals(tabla.fields[1])){
                preparedStatement.setString(1, "%"+find.getDescripcionCategoriaMarca()+"%");
            }
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, CategoriaMarca _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(
                    "INSERT INTO"+tabla.TABLE_NAME+"("+tabla.fields[0]+","+tabla.fields[1]+"VALUES(?,?)");
            preparedStatement.setString(1, _new.getNombreCategoriaMarca());
            preparedStatement.setString(2, _new.getDescripcionCategoriaMarca());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, CategoriaMarca _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement("UPDATE"+tabla.TABLE_NAME+"SET"+tabla.fields[0]+"=?,"+tabla.fields[1]+"=?,"
                    +"WHERE"+tabla.PRIMARY_KEY+"=?");
            preparedStatement.setString(1, _new.getNombreCategoriaMarca());
            preparedStatement.setString(2, _new.getDescripcionCategoriaMarca());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, CategoriaMarca deleteObject) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement("DELETE FROM"+tabla.TABLE_NAME+"WHERE"+tabla.PRIMARY_KEY+"=?");
            preparedStatement.setInt(1, deleteObject.getIdCategoriaMarca());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }
    
    public List<CategoriaMarca> findByIdCategoriaMarca(CategoriaMarca catMa){
        return findBy(catMa,tabla.PRIMARY_KEY);
    }
    public List<CategoriaMarca> findByNombreCategoriaMarca(CategoriaMarca catMa){
        return findBy(catMa,tabla.fields[0]);
    }
    public List<CategoriaMarca> findByDescripcionCategoriaMarca(CategoriaMarca catMa){
        return findBy(catMa,tabla.fields[1]);
    }
}
