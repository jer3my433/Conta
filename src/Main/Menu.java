package Main;

import desplazable.Desface;
import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {
    String usuario;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    Desface desplace;

    public Menu(String user) {
        this.usuario = user;
        initComponents();
        this.setSize(590, 610);
        this.getLayeredPane().add(MenuDesplegable, javax.swing.JLayeredPane.PALETTE_LAYER);
        MenuDesplegable.setBounds(-150, 71, 148, 642);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        MenuInicio m1 = new MenuInicio();
        Ventana.add(m1, BorderLayout.CENTER);
        desplace = new Desface();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Imagenes/menu.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "src/Imagenes/usu.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel6, "src/Imagenes/engranaje.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src/Imagenes/inicio.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuDesplegable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Ventana = new javax.swing.JPanel();
        Boton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        MenuDesplegable.setBackground(new java.awt.Color(255, 255, 255));
        MenuDesplegable.setMinimumSize(new java.awt.Dimension(148, 642));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usu.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/engranaje.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton3.setText("Estados financieros");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setText("Jornalización");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton2.setText("Diario Mayor General");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton4.setText("Balance de saldos");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout MenuDesplegableLayout = new javax.swing.GroupLayout(MenuDesplegable);
        MenuDesplegable.setLayout(MenuDesplegableLayout);
        MenuDesplegableLayout.setHorizontalGroup(
            MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDesplegableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDesplegableLayout.createSequentialGroup()
                        .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuDesplegableLayout.createSequentialGroup()
                        .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuDesplegableLayout.setVerticalGroup(
            MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDesplegableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MenuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        getContentPane().add(MenuDesplegable);
        MenuDesplegable.setBounds(0, 40, 150, 642);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        Ventana.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Ventana);
        Ventana.setBounds(-4, 40, 580, 530);

        Boton.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jLabel2.setAlignmentY(2.0F);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 151, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        jLabel4.setAlignmentY(2.0F);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonLayout = new javax.swing.GroupLayout(Boton);
        Boton.setLayout(BotonLayout);
        BotonLayout.setHorizontalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        BotonLayout.setVerticalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(Boton);
        Boton.setBounds(0, 0, 580, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (MenuDesplegable.getX() == -150) {
            desplace.desplazarDerecha(MenuDesplegable, MenuDesplegable.getX(), 0, 10, 15);
        } else if (MenuDesplegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuDesplegable, MenuDesplegable.getX(), -150, 10, 15);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Form f1 = new Form(usuario);
        Ventana.removeAll();
        Ventana.add(f1, BorderLayout.CENTER);
        Ventana.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        MenuInicio m1 = new MenuInicio();
        Ventana.removeAll();
        Ventana.add(m1, BorderLayout.CENTER);
        Ventana.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Menu("Admin").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton;
    private javax.swing.JPanel MenuDesplegable;
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
