/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class ProductoDAO extends BaseDao<Producto> {

    public ProductoDAO(){
        tabla = new DatosTabla(
        "Producto","idProducto", new String[]{"nombre_producto","cantidad_producto","precio_compra","precio_venta","fecha_ingreso",
        "fecha_caducidad","descripcion producto","FK_idMarca","FK_idCategoriaProducto"}
        );
    }
    @Override
    Producto mapaObjeto(ResultSet resultSet) {
        //Creo el tipo objeto o sea la INSTANCIA
        Producto producto = new Producto();
        try{
            producto.setIdProducto(resultSet.getInt(tabla.PRIMARY_KEY));
            producto.setNombreProducto(resultSet.getString(tabla.fields[0]));
            producto.setCantidadProducto(resultSet.getInt(tabla.fields[1]));
            producto.setPrecioCompra(resultSet.getInt(tabla.fields[2]));
            producto.setPrecioVenta(resultSet.getInt(tabla.fields[3]));
            producto.setFechaIngresoProducto(resultSet.getString(tabla.fields[4]));
            producto.setFechaCaducidadProducto(resultSet.getString(tabla.fields[5]));
            producto.setDescripcionProducto(resultSet.getString(tabla.fields[6]));
            producto.setFK_idMarca(resultSet.getInt(tabla.fields[7]));
            producto.setFK_idCategoriaProducto(resultSet.getInt(tabla.fields[8]));
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return producto;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, Producto find, String by) {
       String query = "SELECT * FROM "+tabla.TABLE_NAME+"WHERE"+by+"=?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(query);
            if(by.equals(tabla.PRIMARY_KEY)){
                preparedStatement.setInt(1, find.getIdProducto());
            }
            else if(by.equals(tabla.fields[0])){
                preparedStatement.setString(1, "%"+find.getNombreProducto()+"%");
            }
            
            else if(by.equals(tabla.fields[1])){
                preparedStatement.setInt(1, find.getCantidadProducto());
            }
            else if(by.equals(tabla.fields[2])){
                preparedStatement.setDouble(1, find.getPrecioCompra());
            }
            
            else if(by.equals(tabla.fields[3])){
                preparedStatement.setDouble(1, find.getPrecioVenta());
            }
            
            else if(by.equals(tabla.fields[4])){
                preparedStatement.setString(1, "%"+find.getFechaIngresoProducto()+"%");
            }
            
            else if(by.equals(tabla.fields[5])){
                preparedStatement.setString(1, "%"+find.getFechaCaducidadProducto()+"%");
            }
            else if(by.equals(tabla.fields[6])){
                preparedStatement.setString(1, "%"+find.getDescripcionProducto()+"%");
            }
            else if(by.equals(tabla.fields[7])){
                preparedStatement.setInt(1, find.getFK_idMarca());
            }
            else if(by.equals(tabla.fields[8])){
                preparedStatement.setInt(1, find.getFK_idCategoriaProducto());
            }

        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, Producto _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement=con.prepareStatement(
            "INSERT INTO"+ tabla.TABLE_NAME+"("+tabla.fields[0]+","+tabla.fields[1]+","+tabla.fields[2]+","+tabla.fields[3]
                    +","+tabla.fields[4]+","+tabla.fields[5]+","+tabla.fields[6]+","+tabla.fields[7]+","+tabla.fields[8]+")"
                    +"VALUES(?,?,?,?,?,?,?,?,?)"  
            );
            preparedStatement.setString(1, _new.getNombreProducto());
            preparedStatement.setInt(2, _new.getCantidadProducto());
            preparedStatement.setDouble(3, _new.getPrecioCompra());
            preparedStatement.setDouble(4, _new.getPrecioVenta());
            preparedStatement.setString(5, _new.getFechaIngresoProducto());
            preparedStatement.setString(6, _new.getFechaCaducidadProducto());
            preparedStatement.setString(7, _new.getDescripcionProducto());
            preparedStatement.setInt(8, _new.getFK_idMarca());
            preparedStatement.setInt(9, _new.getFK_idCategoriaProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Producto _new) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement=con.prepareStatement(
                    "UPDATE"+tabla.TABLE_NAME+"SET"+tabla.fields[0]+"=?"+tabla.fields[1]+"=?"+tabla.fields[2]+"=?"+tabla.fields[3]
            +"=?"+tabla.fields[4]+"=?"+tabla.fields[5]+"=?"+tabla.fields[6]+"=?"+tabla.fields[7]+"=?"+tabla.fields[8]+"=?"
                            +tabla.fields[9]+"=? WHERE"+tabla.PRIMARY_KEY   + "=?"
            );
            preparedStatement.setString(1, _new.getNombreProducto());
            preparedStatement.setInt(2, _new.getCantidadProducto());
            preparedStatement.setDouble(3, _new.getPrecioCompra());
            preparedStatement.setDouble(4, _new.getPrecioVenta());
            preparedStatement.setString(5, _new.getFechaIngresoProducto());
            preparedStatement.setString(6, _new.getFechaCaducidadProducto());
            preparedStatement.setString(7, _new.getDescripcionProducto());
            preparedStatement.setInt(8, _new.getFK_idMarca());
            preparedStatement.setInt(9, _new.getFK_idCategoriaProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, Producto deleteObject) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = con.prepareStatement(
                    "DELETE FROM"+tabla.TABLE_NAME+"WHERE"+tabla.PRIMARY_KEY+"=?");
            preparedStatement.setInt(1, deleteObject.getIdProducto());
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        return preparedStatement;
    }
    
    public List<Producto> findByIdProducto(Producto producto){
        return findBy(producto,tabla.PRIMARY_KEY);
    }
    public List<Producto> findByNombreProducto(Producto producto){
        return findBy(producto,tabla.fields[0]);
    }
    public List<Producto> findByCantidadProducto(Producto producto){
        return findBy(producto,tabla.fields[1]);
    }
    public List<Producto> findByPrecioCompra(Producto producto){
        return findBy(producto,tabla.fields[2]);
    }
    public List<Producto> findByPrecioVenta(Producto producto){
        return findBy(producto,tabla.fields[3]);
    }
    public List<Producto> findByFechaIngreso(Producto producto){
        return findBy(producto,tabla.fields[4]);
    }
    public List<Producto> findByFechaCaducidad(Producto producto){
        return findBy(producto,tabla.fields[5]);
    }
    public List<Producto> findByDescripcionProducto(Producto producto){
        return findBy(producto,tabla.fields[6]);
    }
    public List<Producto> findByFKidMarca(Producto producto){
        return findBy(producto,tabla.fields[7]);
    }    
    public List<Producto> findByFKidCategoriaProducto(Producto producto){
        return findBy(producto,tabla.fields[8]);
    }
}
