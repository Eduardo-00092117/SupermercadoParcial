/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 * Aqui ya esta optimizado. Esta es la primer clase BASE que tomamos . Lo demas
 * se repite
 */
public class EmpleadoDAO extends BaseDao<Empleado> { //<Proveedor> es el tipo de variable, en este caso es de tipo la clase Proveedor

    public EmpleadoDAO() {
        tabla = new DatosTabla(
                /*Se crear un campo de tipo jugador, el cual almacena la tabla, 
                el PK y los demas campos de la tabla*/
                "Empleado", "idEmpleado", new String[]{"nombre", "apellido", "fecha_nac", "dui", "nit", "correo", "sueldo", "FK_idEstadoEmpleado", "FK_idCargo", "acesso"}
        );
    }

    @Override
    public Empleado mapaObjeto(ResultSet resultSet) {
        Empleado emp = new Empleado();
        try {
            emp.setIdEmpleado(resultSet.getInt(tabla.PRIMARY_KEY));
            emp.setNombreEmpleado(resultSet.getString(tabla.fields[0]));
            emp.setApellidoEmpleado(resultSet.getString(tabla.fields[1]));
            emp.setFechaEmpleado(resultSet.getString(tabla.fields[2]));
            emp.setDuiEmpleado(resultSet.getString(tabla.fields[3]));
            emp.setNitEmpleado(resultSet.getString(tabla.fields[4]));
            emp.setCorreoEmpleado(resultSet.getString(tabla.fields[5]));
            emp.setSueldoEmpleado(resultSet.getDouble(tabla.fields[6]));
            emp.setFk_idEstado(resultSet.getInt(tabla.fields[7]));
            emp.setFk_idCargo(resultSet.getInt(tabla.fields[8]));
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return emp;
    }

    @Override
    public PreparedStatement getSelectStatement(Connection con, Empleado find, String by) {
        String query = "SELECT * FROM " + tabla.TABLE_NAME + " WHERE " + by + " = ? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(query);
            if (by.equals(tabla.PRIMARY_KEY)) {
                preparedStatement.setInt(1, find.getIdEmpleado());
            } else if (by.equals(tabla.fields[0])) {
                preparedStatement.setString(1, find.getNombreEmpleado());
            } else if (by.equals(tabla.fields[1])) {
                preparedStatement.setString(1, find.getApellidoEmpleado());
            } else if (by.equals(tabla.fields[2])) {
                preparedStatement.setString(1, find.getFechaEmpleado());
            } else if (by.equals(tabla.fields[3])) {
                preparedStatement.setString(1,  find.getDuiEmpleado());
            } else if (by.equals(tabla.fields[4])) {
                preparedStatement.setString(1, find.getNitEmpleado());
            } else if (by.equals(tabla.fields[5])) {
                preparedStatement.setString(1, find.getCorreoEmpleado());
            } else if (by.equals(tabla.fields[6])) {
                preparedStatement.setDouble(1, find.getSueldoEmpleado());
            } else if (by.equals(tabla.fields[7])) {
                preparedStatement.setInt(1, find.getFk_idEstado());
            } else if (by.equals(tabla.fields[8])) {
                preparedStatement.setInt(1, find.getFk_idCargo());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getInsertStatement(Connection con, Empleado _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "INSERT INTO " + tabla.TABLE_NAME
                    + "(" + tabla.fields[0] + "," + tabla.fields[1] + "," + tabla.fields[2] + ", " + tabla.fields[3] + ", " + tabla.fields[4] + ", " + tabla.fields[5]
                    + ", " + tabla.fields[6] + ", " + tabla.fields[7] + ", " + tabla.fields[8] + ")"
                    + " VALUES(?,?,?,?,?,?,?,?,?)");

            preparedStatement.setString(1, _new.getNombreEmpleado());
            preparedStatement.setString(2, _new.getApellidoEmpleado());
            preparedStatement.setString(3, _new.getFechaEmpleado());
            preparedStatement.setString(4, _new.getDuiEmpleado());
            preparedStatement.setString(5, _new.getNitEmpleado());
            preparedStatement.setString(6, _new.getCorreoEmpleado());
            preparedStatement.setDouble(7, _new.getSueldoEmpleado());
            preparedStatement.setInt(8, _new.getFk_idEstado());
            preparedStatement.setInt(9, _new.getFk_idCargo());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preparedStatement;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Empleado _new) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(
                    "UPDATE " + tabla.TABLE_NAME
                    + " SET " + tabla.fields[0] + " = ?, " + tabla.fields[1] + " = ?, " + tabla.fields[2] + " = ?, "
                    + tabla.fields[3] + " = ?, " + tabla.fields[4] + " = ?, " + tabla.fields[5] + " = ? "
                    + tabla.fields[6] + " = ?, " + tabla.fields[7] + " = ?, " + tabla.fields[8] + " = ? WHERE " + tabla.PRIMARY_KEY + " = ?");

            preparedStatement.setString(1, _new.getNombreEmpleado());
            preparedStatement.setString(2, _new.getApellidoEmpleado());
            preparedStatement.setString(3, _new.getFechaEmpleado());
            preparedStatement.setString(4, _new.getDuiEmpleado());
            preparedStatement.setString(5, _new.getNitEmpleado());
            preparedStatement.setString(6, _new.getCorreoEmpleado());
            preparedStatement.setDouble(7, _new.getSueldoEmpleado());
            preparedStatement.setInt(8, _new.getFk_idEstado());
            preparedStatement.setInt(9, _new.getFk_idCargo());
            preparedStatement.setInt(10, _new.getIdEmpleado());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    public PreparedStatement getDeleteStatement(Connection con, Empleado deleteObject) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("DELETE FROM " + tabla.TABLE_NAME + " WHERE " + tabla.PRIMARY_KEY + " = ?");
            preparedStatement.setInt(1, deleteObject.getIdEmpleado());
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
