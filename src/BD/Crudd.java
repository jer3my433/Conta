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
            System.out.println("Error " + ex.getMessage());
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
            System.out.println("Error " + ex.getMessage());
        }
        return modelo;
    }

    public void ActualizarDatos(int cod, String correlativo, String fecha, String cuenta, int deudor, int acreedor) {
        String sql = "UPDATE jornalizacion SET Correlativo=?, Fecha=?, Cuenta=?, Deudor=?, Acreedor=? WHERE Codigo=?";
        try {
            Connection con = dbConexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correlativo);
            ps.setString(2, fecha);
            ps.setString(3, cuenta);
            ps.setInt(4, deudor);
            ps.setInt(5, acreedor);
            ps.setInt(6, cod);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void EliminarDatos(int codigo) {
        String sql = "DELETE FROM jornalizacion WHERE Codigo=?";
        try {
            Connection con = dbConexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void EliminarTodo() {
        String sql = "DELETE FROM jornalizacion";
        try {
            Connection con = dbConexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public DefaultTableModel LeerCuentas2() {
    String[] titulos = {"No.", "Cuenta", "Activo", "Pasivo", "Perdida", "Ganancia", "Debe", "Haber"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);
    
    String query = "SELECT * FROM `clasificación de cuentas de sociedades` text";

    try {
        Connection con = dbConexion.conectar();
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

       Object[] fila = new Object[8];
        while (rs.next()) {
            fila[0] = rs.getString(1); 
            fila[1] = rs.getString(2); 
            fila[2] = rs.getString(3); 
            fila[3] = rs.getString(4); 
            fila[4] = rs.getString(5); 
            fila[5] = rs.getString(6); 
            fila[6] = rs.getString(7); 
            fila[7] = rs.getString(8); 
            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        System.out.println("Error al cargar banco de cuentas: " + ex.getMessage());
    }
    return modelo;
}
}
