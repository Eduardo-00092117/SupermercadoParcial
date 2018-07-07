/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Usuario;
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
public class UsuarioDAO extends BaseDao<Usuario> { //<Proveedor> es el tipo de variable, en este caso es de tipo la clase Proveedor

    public static int tipoUsuario;
    
    public UsuarioDAO() {
        tabla = new DatosTabla(
                /*Se crear un campo de tipo jugador, el cual almacena la tabla, 
                el PK y los demas campos de la tabla*/
                "Usuario", "idUsuario", new String[]{"usuario", "pass", "FK_idEmpleado"}
        );
    }

    @Override
    public Usuario mapaObjeto(ResultSet resultSet) {
        Usuario user = new Usuario();
        try {
            user.setIdUsuario(resultSet.getInt(tabla.PRIMARY_KEY));
            user.setUsuario(resultSet.getString(tabla.fields[0]));
            user.setPass(resultSet.getString(tabla.fields[1]));
            user.setFK_idEmpleado(resultSet.getInt(tabla.fields[2]));
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return user;
    }

    @Override
    public PreparedStatement getSelectStatement(Connection con, Usuario find, String by) {
        String query = "SELECT * FROM " + tabla.TABLE_NAME + " WHERE " + by + " = ? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(query);
            if (by.equals(tabla.PRIMARY_KEY)) {
                preparedStatement.setInt(1, find.getIdUsuario());
            } else if (by.equals(tabla.fields[0])) {
                preparedStatement.setString(1, find.getUsuario());
            } else if (by.equals(tabla.fields[1])) {
                preparedStatement.setString(1, find.getPass());
            } else if (by.equals(tabla.fields[2])) {
                preparedStatement.setInt(1, find.getFK_idEmpleado());
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getInsertStatement(Connection con, Usuario _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "INSERT INTO " + tabla.TABLE_NAME
                    + "(" + tabla.fields[0] + "," + tabla.fields[1] + "," + tabla.fields[2] + ", " + tabla.fields[3] + ", " + tabla.fields[4] + ", " + tabla.fields[5]
                    + ", " + tabla.fields[6] + ", " + tabla.fields[7] + ", " + tabla.fields[8] + ")"
                    + " VALUES(?,?,?,?,?,?,?,?,?)");

            /*preparedStatement.setString(1, _new.getNombreEmpleado());
            preparedStatement.setString(2, _new.getApellidoEmpleado());
            preparedStatement.setString(3, _new.getFechaEmpleado());
            preparedStatement.setString(4, _new.getDuiEmpleado());
            preparedStatement.setString(5, _new.getNitEmpleado());
            preparedStatement.setString(6, _new.getCorreoEmpleado());
            preparedStatement.setDouble(7, _new.getSueldoEmpleado());
            preparedStatement.setInt(8, _new.getFk_idEstado());
            preparedStatement.setInt(9, _new.getFk_idCargo());*/

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Usuario _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "UPDATE " + tabla.TABLE_NAME
                    + " SET " + tabla.fields[0] + " = ?, " + tabla.fields[1] + " = ?, " + tabla.fields[2] + " = ? "
                            + " WHERE " + tabla.PRIMARY_KEY + " = ?");

            preparedStatement.setString(1, _new.getUsuario());
            preparedStatement.setString(2, _new.getPass());
            preparedStatement.setInt(3, _new.getFK_idEmpleado());
            preparedStatement.setInt(4, _new.getIdUsuario());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getDeleteStatement(Connection con, Usuario deleteObject) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("DELETE FROM " + tabla.TABLE_NAME + " WHERE " + tabla.PRIMARY_KEY + " = ?");
            //preparedStatement.setInt(1, deleteObject.getIdEmpleado());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    /*public List<Empleado> findByIdProveedor(Empleado estudiante) {
        return findBy(estudiante, tabla.PRIMARY_KEY);
    }

    public List<Empleado> findByNombreEmpresa(Empleado estudiante) {
        return findBy(estudiante, tabla.fields[0]);
    }

    public List<Empleado> findByNombreEncargado(Empleado estudiante) {
        return findBy(estudiante, tabla.fields[1]);
    }

    public List<Empleado> findByDuiEncargado(Empleado estudiante) {
        return findBy(estudiante, tabla.fields[2]);
    }

    public List<Empleado> findByTelefonoEncargado(Empleado estudiante) {
        return findBy(estudiante, tabla.fields[3]);
    }

    public List<Empleado> findByUrlEncargado(Empleado estudiante) {
        return findBy(estudiante, tabla.fields[4]);
    }*/
}
