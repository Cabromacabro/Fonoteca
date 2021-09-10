package Proyecto.Controlador;

import Proyecto.modelo.Conexion;
import Proyecto.modelo.FonotecaE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscar Pedraza <Oscar.Pedraza at Saturno.org>
 */
public class Usuario {

    public static void registrarUsuario(String n, String u, String p, int id) throws SQLException {

        String llave = PasswordUtils.getSalt(10);
        String clave = PasswordUtils.generateSecurePassword(p, llave);
        System.out.println(llave);
        System.out.println(clave);

        Connection con = Conexion.getConexion();
        String query = "INSERT INTO usuarios (usuario, clave, llave, estado, nombre, tipo_usuario_idtipo_usuario, Fonoteca_idFonoteca)VALUES(?, ? , ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, u);
        ps.setString(2, clave);
        ps.setString(3, llave);
        ps.setInt(4, 1);
        ps.setString(5, n);
        ps.setInt(6, 2);
        ps.setInt(7, id);

        //System.out.println(ps.toString());
        ps.executeUpdate();
        //ResultSet resultado = ps.executeQuery();

        con.close();

    }

}
