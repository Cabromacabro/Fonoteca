package Proyecto.Controlador;

import Proyecto.modelo.Conexion;
import Proyecto.modelo.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Oscar Pedraza <Oscar.Pedraza at Saturno.org>
 */
public class FonotecaList {

    public static ArrayList<FonotecaE> getFonoteca() throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT idFonoteca,nombre from fonoteca";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet resultado = ps.executeQuery();

        ArrayList<FonotecaE> data = new ArrayList<FonotecaE>();

        while (resultado.next()) {
            //System.out.println(resultado.getInt(1));
            //System.out.println(resultado.getString(2));
            data.add(new FonotecaE(resultado.getInt(1), resultado.getString(2)));
        }

        con.close();

        //System.out.println(data.toString());
        return data;
    }

    public static void main(String[] args) throws SQLException {
        getFonoteca();
    }
}
