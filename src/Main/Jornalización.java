package Main;

import BD.Crudd;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class Jornalización extends javax.swing.JPanel {

    String us;

    public Jornalización(String user) {
        initComponents();
        this.us = user;
        TablaUsuario.getTableHeader().setFont(new Font("TW Cent MT", Font.BOLD, 12));
        BordesVentanas(15, jScrollPane1, jPanel2, jPanel3, jPanel4, Agregar, Modificar, Guardar, Eliminar, Resultado, ResultadoDebe, ResultadoHaber);
        EventQueue.invokeLater(() -> {
            TextoCodigo.requestFocusInWindow();
        });
        mostrar();
        cargarCuentasEnCombo();
        configurarBuscadorCombo();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cuentas = new javax.swing.JComboBox<>();
        TextoCorrelativo = new javax.swing.JFormattedTextField();
        TextoFecha = new javax.swing.JFormattedTextField();
        TextoDeudor = new javax.swing.JFormattedTextField();
        TextoAcreedor = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        BorrarTodo = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Resultado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ResultadoDebe = new javax.swing.JLabel();
        ResultadoHaber = new javax.swing.JLabel();
        BancCuentas = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(206, 221, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        TablaUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
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
        TablaUsuario.getTableHeader().setReorderingAllowed(false);
        TablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuarioMouseClicked(evt);
            }
        });
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

        jPanel2.setBackground(new java.awt.Color(206, 221, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Correlativo");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");

        TextoCodigo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Cuenta");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Deudor");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Acreedor");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Datos");

        Cuentas.setEditable(true);
        Cuentas.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        Cuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la cuenta" }));
        Cuentas.setToolTipText("");

        try {
            TextoCorrelativo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("P No.****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextoFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextoDeudor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("Q.**********")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TextoAcreedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("Q.**********")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextoCorrelativo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(TextoFecha)
                    .addComponent(TextoCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cuentas, 0, 163, Short.MAX_VALUE)
                    .addComponent(TextoDeudor)
                    .addComponent(TextoAcreedor))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoDeudor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextoAcreedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextoCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(206, 221, 255));
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
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Operaciones");

        jPanel1.setBackground(new java.awt.Color(206, 221, 255));

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        BorrarTodo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        BorrarTodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliminar todo" }));
        BorrarTodo.setEnabled(false);
        BorrarTodo.setOpaque(true);
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Guardar.setText("Guardar");
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Resultado.setBackground(new java.awt.Color(206, 221, 255));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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

        BancCuentas.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        BancCuentas.setText("Banco de cuentas");
        BancCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BancCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancCuentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BancCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BancCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            Crudd op = new Crudd();
            int cod = Integer.parseInt(TextoCodigo.getText().trim());
            String corre = TextoCorrelativo.getText().trim();
            String fecha = TextoFecha.getText().trim();
            String cuentaSeleccionada = "";
            if (Cuentas.getEditor().getItem() != null) {
                cuentaSeleccionada = Cuentas.getEditor().getItem().toString().trim();
            }

            if (cuentaSeleccionada.isEmpty() || cuentaSeleccionada.equals("Seleccione la cuenta")) {
                JOptionPane.showMessageDialog(this, "Indique la cuenta");
                Cuentas.requestFocus();
                return;
            }
            String cuenta = cuentaSeleccionada;
            configurarBuscadorCombo();
            String dTxt = TextoDeudor.getText().replaceAll("[^0-9]", "");
            String aTxt = TextoAcreedor.getText().replaceAll("[^0-9]", "");
            int deudor = dTxt.isEmpty() ? 0 : Integer.parseInt(dTxt);
            int acreedor = aTxt.isEmpty() ? 0 : Integer.parseInt(aTxt);

            if (op.existeRegistro(cod)) {
                op.ActualizarDatos(cod, corre, fecha, cuenta, deudor, acreedor);
            } else {
                op.InsertarDatos(cod, corre, fecha, cuenta, deudor, acreedor);
            }
            mostrar();
            nuevo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Llene los datos");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void BancCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BancCuentasActionPerformed
        BancCuentas p2 = new BancCuentas(us);
        p2.setSize(this.getWidth(), this.getHeight());
        p2.setLocation(0, 0);
        this.removeAll();
        this.add(p2, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_BancCuentasActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int filas = TablaUsuario.getRowCount();
        if (filas == 0) {
            JOptionPane.showMessageDialog(this, "No hay filas para modificar");
        } else {
            try {
                Crudd op = new Crudd();
                int cod = Integer.parseInt(TextoCodigo.getText());
                String corre = TextoCorrelativo.getText().trim();
                String fecha = TextoFecha.getText().trim();
                String cuenta = Cuentas.getSelectedItem().toString();
                String Deudor = TextoDeudor.getText().replaceAll("[^0-9]", "");
                String Acreedor = TextoAcreedor.getText().replaceAll("[^0-9]", "");
                int deudor = Deudor.isEmpty() ? 0 : Integer.parseInt(Deudor);
                int acreedor = Acreedor.isEmpty() ? 0 : Integer.parseInt(Acreedor);
                op.ActualizarDatos(cod, corre, fecha, cuenta, deudor, acreedor);
                mostrar();
                nuevo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Seleccione la fila que desea modificar");
            }
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void TablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuarioMouseClicked
        int fila = TablaUsuario.getSelectedRow();
        if (fila != -1) {
            TextoCodigo.setText(TablaUsuario.getValueAt(fila, 0).toString());
            TextoCorrelativo.setValue(TablaUsuario.getValueAt(fila, 1).toString());
            TextoFecha.setValue(TablaUsuario.getValueAt(fila, 2).toString());
            Cuentas.setSelectedItem(TablaUsuario.getValueAt(fila, 3).toString());
            TextoDeudor.setText(TablaUsuario.getValueAt(fila, 4).toString());
            TextoAcreedor.setText(TablaUsuario.getValueAt(fila, 5).toString());
            TextoCodigo.setEditable(false);
        }
    }//GEN-LAST:event_TablaUsuarioMouseClicked

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
        int filas = TablaUsuario.getRowCount();
        if (filas >= 2) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro de que deseas eliminar TODOS los registros?", "Eliminación de registro", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                Crudd objeto = new Crudd();
                objeto.EliminarTodo();
                calcularTotal();
                mostrar();
                nuevo();
            }
        } else if (filas == 0) {
            JOptionPane.showMessageDialog(this, "No hay filas para eliminar");
        }
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (TablaUsuario.getSelectedRow() >= 0) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro de que deseas eliminar este registro?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                int codigo = Integer.parseInt(TablaUsuario.getValueAt(TablaUsuario.getSelectedRow(), 0).toString());
                Crudd objeto = new Crudd();
                objeto.EliminarDatos(codigo);
                mostrar();
                nuevo();
            }
        } else if (TablaUsuario.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay filas para eliminar");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione la fila que desea eliminar");
    }//GEN-LAST:event_EliminarActionPerformed
    }
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        int[] totales = calcularTotal();
        int Debe = totales[0];
        int Haber = totales[1];
        if (Debe != Haber) {
            JOptionPane.showMessageDialog(this, "Los resultados no cuadran", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Guardado con éxito");
        }
    }//GEN-LAST:event_GuardarActionPerformed

    void mostrar() {
        Crudd objeto = new Crudd();
        TablaUsuario.setModel(objeto.LeerDatos());
        calcularTotal();
    }

    void nuevo() {
        TextoCodigo.setText("");
        TextoCorrelativo.setValue("P No.");
        TextoFecha.setValue("  /  /    ");
        Cuentas.removeAllItems();
        Cuentas.addItem("Seleccione la cuenta");
        cargarCuentasEnCombo();
        Cuentas.setSelectedIndex(0);
        TextoDeudor.setValue("Q.");
        TextoAcreedor.setValue("Q.");
        TextoCodigo.requestFocus();
        TextoCodigo.setEditable(true);
        TablaUsuario.clearSelection();
    }

    private void BordesVentanas(int radio, javax.swing.JComponent... componentes) {
        for (javax.swing.JComponent c : componentes) {
            c.putClientProperty("FlatLaf.style", "arc: " + radio);
        }
    }

    private void cargarCuentasEnCombo() {
        Crudd objeto = new Crudd();
        DefaultTableModel modelo = objeto.LeerBancCuentas();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombreCuenta = modelo.getValueAt(i, 1).toString();
            Cuentas.addItem(nombreCuenta);
        }
    }

    private void configurarBuscadorCombo() {
        JTextComponent editor = (JTextComponent) Cuentas.getEditor().getEditorComponent();
        editor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String charEscrito = editor.getText();

                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    return;
                }
                Crudd objeto = new Crudd();
                DefaultTableModel modelo = objeto.LeerBancCuentas();
                Cuentas.removeAllItems();
                boolean Coincidencias = false;
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    String nombre = modelo.getValueAt(i, 1).toString();
                    if (nombre.toLowerCase().contains(charEscrito.toLowerCase())) {
                        Cuentas.addItem(nombre);
                        Coincidencias = true;
                    }
                }
                editor.setText(charEscrito);
                if (Coincidencias) {
                    Cuentas.setPopupVisible(true);
                }
            }
        });
    }

    private int[] calcularTotal() {
        int totalDeudor = 0;
        int totalAcreedor = 0;
        if (TablaUsuario.getRowCount() >= 2) {
            BorrarTodo.setEnabled(true);
            Guardar.setEnabled(true);
        } else {
            BorrarTodo.setEnabled(false);
            Guardar.setEnabled(false);
        }

        for (int i = 0; i < TablaUsuario.getRowCount(); i++) {
            totalDeudor += Integer.parseInt(TablaUsuario.getValueAt(i, 4).toString());
            totalAcreedor += Integer.parseInt(TablaUsuario.getValueAt(i, 5).toString());

        }
        ResultadoDebe.setText(String.valueOf(totalDeudor));
        ResultadoHaber.setText(String.valueOf(totalAcreedor));

        if (TablaUsuario.getRowCount() < 2) {
            ResultadoDebe.setBackground(Color.WHITE);
            ResultadoHaber.setBackground(Color.WHITE);
        } else if (totalDeudor != totalAcreedor) {
            Color rojo = new Color(255, 150, 150);
            ResultadoDebe.setBackground(rojo);
            ResultadoHaber.setBackground(rojo);
        } else {
            ResultadoDebe.setBackground(Color.WHITE);
            ResultadoHaber.setBackground(Color.WHITE);
        }

        return new int[]{totalDeudor, totalAcreedor};
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton BancCuentas;
    private javax.swing.JComboBox<String> BorrarTodo;
    private javax.swing.JComboBox<String> Cuentas;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JPanel Resultado;
    private javax.swing.JLabel ResultadoDebe;
    private javax.swing.JLabel ResultadoHaber;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JFormattedTextField TextoAcreedor;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JFormattedTextField TextoCorrelativo;
    private javax.swing.JFormattedTextField TextoDeudor;
    private javax.swing.JFormattedTextField TextoFecha;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
