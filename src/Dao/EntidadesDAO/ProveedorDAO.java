/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 * Aqui ya esta optimizado. Esta es la primer clase BASE que tomamos . Lo demas
 * se repite
 */
public class ProveedorDAO extends BaseDao<Proveedor> { //<Proveedor> es el tipo de variable, en este caso es de tipo la clase Proveedor

    public ProveedorDAO() {
        tabla = new DatosTabla(
                /*Se crear un campo de tipo jugador, el cual almacena la tabla, 
                el PK y los demas campos de la tabla*/
                "Proveedor", "idProveedor", new String[]{"nombre_empresa", "nombre_encargado", "dui", "telefono", "url"}
        );
    }

    @Override
    public Proveedor mapaObjeto(ResultSet resultSet) {
        Proveedor pro = new Proveedor();
        try {
            pro.setIdProveedor(resultSet.getInt(tabla.PRIMARY_KEY));
            pro.setNombreEmpresa(resultSet.getString(tabla.fields[0]));
            pro.setNombreEncargado(resultSet.getString(tabla.fields[1]));
            pro.setDuiEncargado(resultSet.getString(tabla.fields[2]));
            pro.setTelefonoEncargado(resultSet.getString(tabla.fields[3]));
            pro.setUrlEncargado(resultSet.getString(tabla.fields[4]));
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return pro;
    }

    @Override
    public PreparedStatement getSelectStatement(Connection con, Proveedor find, String by) {
        String query = "SELECT * FROM " + tabla.TABLE_NAME + " WHERE " + by + " = ? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(query);
            if (by.equals(tabla.PRIMARY_KEY)) {
                preparedStatement.setInt(1, find.getIdProveedor());
            } else if (by.equals(tabla.fields[0])) {
                preparedStatement.setString(1, find.getNombreEmpresa());
            } else if (by.equals(tabla.fields[1])) {
                preparedStatement.setString(1, find.getNombreEncargado());
            } else if (by.equals(tabla.fields[2])) {
                preparedStatement.setString(1, find.getDuiEncargado());
            } else if (by.equals(tabla.fields[3])) {
                preparedStatement.setString(1, find.getTelefonoEncargado());
            } else if (by.equals(tabla.fields[4])) {
                preparedStatement.setString(1, find.getUrlEncargado());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getInsertStatement(Connection con, Proveedor _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "INSERT INTO " + tabla.TABLE_NAME
                    + "(" + tabla.fields[0] + "," + tabla.fields[1] + "," + tabla.fields[2] + ", " + tabla.fields[3] + ", " + tabla.fields[4] + ")"
                    + " VALUES(?,?,?,?,?)");

            preparedStatement.setString(1, _new.getNombreEmpresa());
            preparedStatement.setString(2, _new.getNombreEncargado());
            preparedStatement.setString(3, _new.getDuiEncargado());
            preparedStatement.setString(4, _new.getTelefonoEncargado());
            preparedStatement.setString(5, _new.getUrlEncargado());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Proveedor _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "UPDATE " + tabla.TABLE_NAME
                    + " SET " + tabla.fields[0] + " = ?, " + tabla.fields[1] + " = ?, " + tabla.fields[2] + " = ?, "
                    + tabla.fields[3] + " = ?, " + tabla.fields[4] + " = ? WHERE " + tabla.PRIMARY_KEY + " = ?");

            preparedStatement.setString(1, _new.getNombreEmpresa());
            preparedStatement.setString(2, _new.getNombreEncargado());
            preparedStatement.setString(3, _new.getDuiEncargado());
            preparedStatement.setString(4, _new.getTelefonoEncargado());
            preparedStatement.setString(5, _new.getUrlEncargado());
            preparedStatement.setInt(6, _new.getIdProveedor());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getDeleteStatement(Connection con, Proveedor deleteObject) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("DELETE FROM " + tabla.TABLE_NAME + " WHERE " + tabla.PRIMARY_KEY + " = ?");
            preparedStatement.setInt(1, deleteObject.getIdProveedor());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    /*public List<Proveedor> findByIdProveedor(Proveedor estudiante) {
        return findBy(estudiante, tabla.PRIMARY_KEY);
    }

    public List<Proveedor> findByNombreEmpresa(Proveedor estudiante) {
        return findBy(estudiante, tabla.fields[0]);
    }

    public List<Proveedor> findByNombreEncargado(Proveedor estudiante) {
        return findBy(estudiante, tabla.fields[1]);
    }

    public List<Proveedor> findByDuiEncargado(Proveedor estudiante) {
        return findBy(estudiante, tabla.fields[2]);
    }

    public List<Proveedor> findByTelefonoEncargado(Proveedor estudiante) {
        return findBy(estudiante, tabla.fields[3]);
    }

    public List<Proveedor> findByUrlEncargado(Proveedor estudiante) {
        return findBy(estudiante, tabla.fields[4]);
    }*/
}
