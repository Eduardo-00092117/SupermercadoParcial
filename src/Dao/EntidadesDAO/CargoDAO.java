/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.EntidadesDAO;

import Entidades.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class CargoDAO extends BaseDao<Cargo> {

    public CargoDAO() {
        tabla = new DatosTabla(
                "Cargo", "idCargo", new String[]{"cargo", "descripcion", "acceso"}
        );
    }

    @Override
    Cargo mapaObjeto(ResultSet resultSet) {
        Cargo cargo = new Cargo();
        try {
            cargo.setIdCargo(resultSet.getInt(tabla.PRIMARY_KEY));
            cargo.setNombreCargo(resultSet.getString(tabla.fields[0]));
            cargo.setDescripcionCargo(resultSet.getString(tabla.fields[1]));
            cargo.setAccesso(resultSet.getBoolean(tabla.fields[2]));
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return cargo;
    }

    @Override
    PreparedStatement getSelectStatement(Connection con, Cargo find, String by) {
        String query = "SELECT * FROM " + tabla.TABLE_NAME + " WHERE " + by + " = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(query);
            if (by.equals(tabla.PRIMARY_KEY)) {
                preparedStatement.setInt(1, find.getIdCargo());
            } else if (by.equals(tabla.fields[0])) {
                preparedStatement.setString(1, find.getNombreCargo());
            } else if (by.equals(tabla.fields[1])) {
                preparedStatement.setString(1, find.getDescripcionCargo());
            } else if (by.equals(tabla.fields[1])) {
                preparedStatement.setBoolean(1, find.isAccesso());
            }
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    PreparedStatement getInsertStatement(Connection con, Cargo _new) {
        return null;
    }

    @Override
    PreparedStatement getUpdateStatement(Connection con, Cargo _new) {
        return null;
    }

    @Override
    PreparedStatement getDeleteStatement(Connection con, Cargo deleteObject) {
        return null;
    }

    public List<Cargo> findByIdCategoriaMarca(Cargo catMa) {
        return findBy(catMa, tabla.PRIMARY_KEY);
    }

    public List<Cargo> findByNombreCategoriaMarca(Cargo catMa) {
        return findBy(catMa, tabla.fields[0]);
    }

    public List<Cargo> findByDescripcionCategoriaMarca(Cargo catMa) {
        return findBy(catMa, tabla.fields[1]);
    }
}
