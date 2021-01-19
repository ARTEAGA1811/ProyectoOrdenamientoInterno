/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoordenamientointerno;

import java.util.Arrays;
import java.util.Random;


public class MenuPrincipal extends javax.swing.JFrame {

    public static int vector [] = new int[8];

    
    //GETTER AND SETTER
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    
    
    
    
    public MenuPrincipal() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipos = new javax.swing.ButtonGroup();
        btnGroupPivote = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBurbuja = new javax.swing.JTable();
        btnOrdenar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresoArreglo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtnQuicksort = new javax.swing.JRadioButton();
        rbtnBurbuja = new javax.swing.JRadioButton();
        rbtnSeleccion = new javax.swing.JRadioButton();
        rbtnInsercion = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        tableBurbuja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "[0]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "Datos"
            }
        ));
        tableBurbuja.setRowHeight(30);
        jScrollPane1.setViewportView(tableBurbuja);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(218, 245, 215));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOrdenar.setBackground(new java.awt.Color(218, 245, 215));
        btnOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 102));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(242, 251, 252));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Ingresa el Arreglo");

        txtIngresoArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoArregloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese 8 valores separados por una coma");

        jButton1.setBackground(new java.awt.Color(240, 249, 250));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Rellenar con valores aleatorios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(242, 251, 252));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Metodos de Ordenacion Interna");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIngresoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(242, 251, 252));

        rbtnQuicksort.setBackground(new java.awt.Color(218, 245, 215));
        btnGroupTipos.add(rbtnQuicksort);
        rbtnQuicksort.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnQuicksort.setText("Quicksort");
        rbtnQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnQuicksortActionPerformed(evt);
            }
        });

        rbtnBurbuja.setBackground(new java.awt.Color(245, 215, 215));
        btnGroupTipos.add(rbtnBurbuja);
        rbtnBurbuja.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnBurbuja.setSelected(true);
        rbtnBurbuja.setText("Burbuja");
        rbtnBurbuja.setPreferredSize(new java.awt.Dimension(75, 23));
        rbtnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBurbujaActionPerformed(evt);
            }
        });

        rbtnSeleccion.setBackground(new java.awt.Color(245, 228, 215));
        btnGroupTipos.add(rbtnSeleccion);
        rbtnSeleccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnSeleccion.setText("Selección");
        rbtnSeleccion.setPreferredSize(new java.awt.Dimension(75, 23));
        rbtnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSeleccionActionPerformed(evt);
            }
        });

        rbtnInsercion.setBackground(new java.awt.Color(245, 245, 215));
        btnGroupTipos.add(rbtnInsercion);
        rbtnInsercion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnInsercion.setText("Inserción");
        rbtnInsercion.setPreferredSize(new java.awt.Dimension(75, 23));
        rbtnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInsercionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Escoja el método por el cual se ordenará el arreglo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnBurbuja, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(rbtnSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnInsercion, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(rbtnQuicksort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnQuicksort, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void rbtnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBurbujaActionPerformed
        // TODO add your handling code here:
        rbtnAlatorio.setEnabled(false);
        rbtnInicio.setEnabled(false);
        rbtnCentro.setEnabled(false);
        rbtnFinal.setEnabled(false);
    }//GEN-LAST:event_rbtnBurbujaActionPerformed

    private void rbtnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSeleccionActionPerformed
        // TODO add your handling code here:
        rbtnAlatorio.setEnabled(false);
        rbtnInicio.setEnabled(false);
        rbtnCentro.setEnabled(false);
        rbtnFinal.setEnabled(false);
    }//GEN-LAST:event_rbtnSeleccionActionPerformed

    private void rbtnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInsercionActionPerformed
        // TODO add your handling code here:
        rbtnAlatorio.setEnabled(false);
        rbtnInicio.setEnabled(false);
        rbtnCentro.setEnabled(false);
        rbtnFinal.setEnabled(false);
    }//GEN-LAST:event_rbtnInsercionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: ****************************METODO RELLENAR CON VALORES ALEATORIOS
        String vectorRandom = "";
        String numAux = "";
        Random aleatorio = new Random(System.currentTimeMillis());
        for(int i = 0; i < 8; i++){
            int intAleatorio = aleatorio.nextInt(50);
            numAux = Integer.toString(intAleatorio);
            vectorRandom+=numAux;
            if(i != 7){
            vectorRandom+=",";
            }
            
        }
        txtIngresoArreglo.setText(vectorRandom);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:  **************************METODO ORDENAR
        
        
        //Se convierte la informacion a un vector int
        String texto = (txtIngresoArreglo.getText());
        String vectorDestring [] = texto.split(",", 8);
       
        
        for(int i =0; i<vectorDestring.length; i++){
            int a = Integer.parseInt(vectorDestring[i]);
            vector[i] = a;
        }
  
        this.setVisible(false);
        if(rbtnBurbuja.isSelected()){
            
            GUIOrdenamientoBurbuja guiBurbuja = new GUIOrdenamientoBurbuja();
            guiBurbuja.setVisible(true);     
            
        }
        if(rbtnSeleccion.isSelected()){
            
        }
        
  
        
        
        
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void txtIngresoArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoArregloActionPerformed

    private void rbtnQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnQuicksortActionPerformed
        // TODO add your handling code here:
        rbtnAlatorio.setEnabled(true);
        rbtnInicio.setEnabled(true);
        rbtnCentro.setEnabled(true);
        rbtnFinal.setEnabled(true);

    }//GEN-LAST:event_rbtnQuicksortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupPivote;
    private javax.swing.ButtonGroup btnGroupTipos;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnBurbuja;
    private javax.swing.JRadioButton rbtnInsercion;
    private javax.swing.JRadioButton rbtnQuicksort;
    private javax.swing.JRadioButton rbtnSeleccion;
    private javax.swing.JTable tableBurbuja;
    private javax.swing.JTextField txtIngresoArreglo;
    // End of variables declaration//GEN-END:variables
}
