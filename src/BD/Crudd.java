package BD;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Crudd {

    public void InsertarDatos(int codigo, String correlativo, String fecha, String cuenta, int deudor, int acreedor) {
        String query = "insert into jornalizacion (Codigo, Correlativo, Fecha, Cuenta, Deudor, Acreedor) values (?,?,?,?,?,?)";
        try {
            Connection con = dbConexion.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, codigo);
            ps.setString(2, correlativo);
            ps.setString(3, fecha);
            ps.setString(4, cuenta);
            ps.setInt(5, deudor);
            ps.setInt(6, acreedor);

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }

    public DefaultTableModel LeerDatos() {
        String[] titulos = {"Codigo", "Correlativo", "Fecha", "Cuenta", "Deudor", "Acreedor"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String query = "select * from jornalizacion";

        try {
            Connection con = dbConexion.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Object[] fila = new Object[6];
            while (rs.next()) {
                fila[0] = rs.getInt("Codigo");
                fila[1] = rs.getString("Correlativo");
                fila[2] = rs.getString("Fecha");
                fila[3] = rs.getString("Cuenta");
                fila[4] = rs.getInt("Deudor");
                fila[5] = rs.getInt("Acreedor");
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return modelo;
    }

}
