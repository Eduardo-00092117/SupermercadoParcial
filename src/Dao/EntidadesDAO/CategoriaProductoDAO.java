/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.CategoriaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class CategoriaProductoDAO extends BaseDao<CategoriaProducto>{
    public CategoriaProductoDAO(){
        tabla = new DatosTabla(
        "CategoriaProducto","idCategoriaProducto",new String[]{"nombre","descripcion "}
        );
    }
    @Override
    CategoriaProducto mapaObjeto(ResultSet resultSet) {
        CategoriaProducto catPro = new CategoriaProducto();
        try{
            catPro.setIdCategoriaProducto(resultSet.getInt(tabla.PRIMARY_KEY));
            catPro.setNombreCategoriaProducto(resultSet.getString(tabla.fields[0]));
            catPro.setDescripcionCategoriaProducto(resultSet.getString(tabla.fields[1]));
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return catPro;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, CategoriaProducto find, String by) {
        PreparedStatement preparedStatement = null;
        String query = "SELECT * FROM "+ tabla.TABLE_NAME+"WHERE"+by+"=?";
        try{
                        if(by.equals(tabla.PRIMARY_KEY)){
                preparedStatement.setInt(1, find.getIdCategoriaProducto());
            }
            else if(by.equals(tabla.fields[0])){
                preparedStatement.setString(1, "%"+find.getNombreCategoriaProducto()+"%");
            }
            else if(by.equals(tabla.fields[1])){
                preparedStatement.setString(1, "%"+find.getDescripcionCategoriaProducto()+"%");
            }
            
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, CategoriaProducto _new) {
        PreparedStatement preparedStatement = null;
        try{
             preparedStatement = con.prepareStatement(
                    "INSERT INTO"+tabla.TABLE_NAME+"("+tabla.fields[0]+","+tabla.fields[1]+"VALUES(?,?)");
            preparedStatement.setString(1, _new.getNombreCategoriaProducto());
            preparedStatement.setString(2, _new.getDescripcionCategoriaProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, CategoriaProducto _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement("UPDATE"+tabla.TABLE_NAME+"SET"+tabla.fields[0]+"=?"+tabla.fields[1]+"=?"
                    +"WHERE"+tabla.PRIMARY_KEY+"=?");
             preparedStatement.setString(1, _new.getNombreCategoriaProducto());
            preparedStatement.setString(2, _new.getDescripcionCategoriaProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, CategoriaProducto deleteObject) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement=con.prepareStatement("DELETE FROM"+tabla.TABLE_NAME+"WHERE"+tabla.PRIMARY_KEY+"=?");
            preparedStatement.setInt(1, deleteObject.getIdCategoriaProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }
    public List<CategoriaProducto> findByIdCategoriaProducto(CategoriaProducto catPro){
        return findBy(catPro,tabla.PRIMARY_KEY);
    }
    public List<CategoriaProducto> findByNombreCategoriaProducto(CategoriaProducto catPro){
        return findBy(catPro,tabla.fields[0]);
    }
    public List<CategoriaProducto> findByDescripcionCategoriaProdcuto(CategoriaProducto catPro){
        return findBy(catPro,tabla.fields[1]);
    }
}
