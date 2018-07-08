/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Cargo;
import Entidades.EstadoEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class EstadoEmpleadoDAO extends BaseDao<EstadoEmpleado> {

    public EstadoEmpleadoDAO() {
        tabla = new DatosTabla(
                "EstadoEmpleado", "idEstadoEmpleado", new String[]{"estado"}
        );
    }

    @Override
    EstadoEmpleado mapaObjeto(ResultSet resultSet) {
        EstadoEmpleado estado = new EstadoEmpleado();
        try {
            estado.setIdEstado(resultSet.getInt(tabla.PRIMARY_KEY));
            estado.setEstado(resultSet.getString(tabla.fields[0]));
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return estado;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, EstadoEmpleado find, String by) {
        String query = "SELECT * FROM " + tabla.TABLE_NAME + " WHERE " + by + " = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(query);
            if (by.equals(tabla.PRIMARY_KEY)) {
                preparedStatement.setInt(1, find.getIdEstado());
            } else if (by.equals(tabla.fields[0])) {
                preparedStatement.setString(1, find.getEstado());
            }
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, EstadoEmpleado _new) {
        return null;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, EstadoEmpleado _new) {
        return null;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, EstadoEmpleado deleteObject) {
        return null;
    }

    public List<EstadoEmpleado> findByIdCategoriaMarca(EstadoEmpleado catMa) {
        return findBy(catMa, tabla.PRIMARY_KEY);
    }

    public List<EstadoEmpleado> findByNombreCategoriaMarca(EstadoEmpleado catMa) {
        return findBy(catMa, tabla.fields[0]);
    }
}
