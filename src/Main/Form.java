package Main;

import BD.Crudd;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JPanel {

    public Form() {
        initComponents();
        TablaUsuario.getTableHeader().setReorderingAllowed(false);
        BordesVentanas(jPanel2, 10);
        BordesVentanas(jPanel3, 10);
        BordesVentanas(jPanel4, 10);
        BordesVentanas(Agregar, 15);
        BordesVentanas(Modificar, 15);
        BordesVentanas(Nuevo, 15);
        BordesVentanas(Eliminar, 15);
        BordesVentanas(Resultado, 15);
        BordesVentanas(ResultadoDebe, 15);
        BordesVentanas(ResultadoHaber, 15);
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextoCodigo = new javax.swing.JTextField();
        TextoCorrelativo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextoCuenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextoDeudor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextoAcreedor = new javax.swing.JTextField();
        TextoFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Resultado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ResultadoDebe = new javax.swing.JLabel();
        ResultadoHaber = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Correlativo", "Cuenta", "Deudor", "Acreedor"
            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Base de datos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Correlativo");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Cuenta");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Deudor");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Acreedor");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextoCorrelativo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(TextoFecha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextoDeudor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(TextoAcreedor)
                    .addComponent(TextoCuenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TextoCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoDeudor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(TextoAcreedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Agregar.setBackground(new java.awt.Color(102, 204, 127));
        Agregar.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(127, 178, 255));
        Modificar.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Nuevo.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Operaciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Resultado.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel10.setText("Resultado:");

        ResultadoDebe.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoDebe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        ResultadoDebe.setOpaque(true);

        ResultadoHaber.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoHaber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        ResultadoHaber.setOpaque(true);

        javax.swing.GroupLayout ResultadoLayout = new javax.swing.GroupLayout(Resultado);
        Resultado.setLayout(ResultadoLayout);
        ResultadoLayout.setHorizontalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(63, 63, 63)
                .addComponent(ResultadoDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ResultadoHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ResultadoLayout.setVerticalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ResultadoHaber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResultadoDebe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap())
        );

        Finalizar.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            Crudd op = new Crudd();
            int cod = Integer.parseInt(TextoCodigo.getText());
            String corre = TextoCorrelativo.getText();
            String fecha = TextoFecha.getText();
            String cuenta = TextoCuenta.getText();
            int deudor = Integer.parseInt(TextoDeudor.getText());
            int acreedor = Integer.parseInt(TextoAcreedor.getText());

            op.InsertarDatos(cod, corre, fecha, cuenta, deudor, acreedor);
            mostrar();
            nuevo();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Llene todos los campos");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }


    }//GEN-LAST:event_AgregarActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        if (totalDeudor != totalAcreedor) {
            Color rojo = new Color(255, 150, 150);
            ResultadoDebe.setBackground(rojo);
            ResultadoHaber.setBackground(rojo);
            JOptionPane.showMessageDialog(this, "Los resultados no cuadran", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            ResultadoDebe.setBackground(Color.white);
            ResultadoHaber.setBackground(Color.white);
        }
    }//GEN-LAST:event_FinalizarActionPerformed

    void mostrar() {
        Crudd objetoCrud = new Crudd();
        TablaUsuario.setModel(objetoCrud.LeerDatos());
        calcularTotal();
    }

    void nuevo() {
        TextoCodigo.setText("");
        TextoCorrelativo.setText("");
        TextoFecha.setText("");
        TextoCuenta.setText("");
        TextoDeudor.setText("");
        TextoAcreedor.setText("");
        TextoCodigo.requestFocus();
    }

    private void BordesVentanas(javax.swing.JComponent componente, int arco) {
        componente.putClientProperty("FlatLaf.style", "arc: " + arco);

    }

    int totalDeudor = 0;
    int totalAcreedor = 0;
    private void calcularTotal() {

        int filas = TablaUsuario.getRowCount();
        for (int i = 0; i < filas; i++) {
            int valorDeudor;
            int valorAcreedor;
            valorDeudor = Integer.parseInt(TablaUsuario.getValueAt(i, 4).toString());
            valorAcreedor = Integer.parseInt(TablaUsuario.getValueAt(i, 5).toString());

            totalDeudor += valorDeudor;
            totalAcreedor += valorAcreedor;

        }
        ResultadoDebe.setText(String.valueOf(totalDeudor));
        ResultadoHaber.setText(String.valueOf(totalAcreedor));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JPanel Resultado;
    private javax.swing.JLabel ResultadoDebe;
    private javax.swing.JLabel ResultadoHaber;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JTextField TextoAcreedor;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoCorrelativo;
    private javax.swing.JTextField TextoCuenta;
    private javax.swing.JTextField TextoDeudor;
    private javax.swing.JTextField TextoFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
