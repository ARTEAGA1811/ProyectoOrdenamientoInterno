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
        jLabel1 = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnBurbuja = new javax.swing.JRadioButton();
        rbtnSeleccion = new javax.swing.JRadioButton();
        rbtnInsercion = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresoArreglo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbtnCentro = new javax.swing.JRadioButton();
        rbtnFinal = new javax.swing.JRadioButton();
        rbtnInicio = new javax.swing.JRadioButton();
        rbtnAlatorio = new javax.swing.JRadioButton();
        rbtnQuicksort = new javax.swing.JRadioButton();

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

        jLabel1.setText("Metodos de Ordenacion Interna");

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnGroupTipos.add(rbtnBurbuja);
        rbtnBurbuja.setSelected(true);
        rbtnBurbuja.setText("Burbuja");
        rbtnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBurbujaActionPerformed(evt);
            }
        });

        btnGroupTipos.add(rbtnSeleccion);
        rbtnSeleccion.setText("Selección");
        rbtnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSeleccionActionPerformed(evt);
            }
        });

        btnGroupTipos.add(rbtnInsercion);
        rbtnInsercion.setText("Inserción");
        rbtnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInsercionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnBurbuja)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSeleccion)
                    .addComponent(rbtnInsercion))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnBurbuja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnSeleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnInsercion)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setText("Ingresa el Arreglo");

        txtIngresoArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoArregloActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese 8 valores separados por una coma");

        jButton1.setText("Rellenar con valores aleatorios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIngresoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIngresoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnGroupPivote.add(rbtnCentro);
        rbtnCentro.setText("Centro");
        rbtnCentro.setEnabled(false);

        btnGroupPivote.add(rbtnFinal);
        rbtnFinal.setText("Final");
        rbtnFinal.setEnabled(false);

        btnGroupPivote.add(rbtnInicio);
        rbtnInicio.setText("Inicio");
        rbtnInicio.setEnabled(false);

        btnGroupPivote.add(rbtnAlatorio);
        rbtnAlatorio.setText("Aleatorio");
        rbtnAlatorio.setEnabled(false);

        btnGroupTipos.add(rbtnQuicksort);
        rbtnQuicksort.setText("Quicksort");
        rbtnQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnQuicksortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnQuicksort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnAlatorio)
                    .addComponent(rbtnInicio)
                    .addComponent(rbtnCentro)
                    .addComponent(rbtnFinal))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(rbtnAlatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnInicio)
                    .addComponent(rbtnQuicksort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnCentro)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOrdenar)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnOrdenar)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void rbtnQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnQuicksortActionPerformed
        // TODO add your handling code here:
        rbtnAlatorio.setEnabled(true);
        rbtnInicio.setEnabled(true);
        rbtnCentro.setEnabled(true);
        rbtnFinal.setEnabled(true);
        
        
        
    }//GEN-LAST:event_rbtnQuicksortActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnAlatorio;
    private javax.swing.JRadioButton rbtnBurbuja;
    private javax.swing.JRadioButton rbtnCentro;
    private javax.swing.JRadioButton rbtnFinal;
    private javax.swing.JRadioButton rbtnInicio;
    private javax.swing.JRadioButton rbtnInsercion;
    private javax.swing.JRadioButton rbtnQuicksort;
    private javax.swing.JRadioButton rbtnSeleccion;
    private javax.swing.JTable tableBurbuja;
    private javax.swing.JTextField txtIngresoArreglo;
    // End of variables declaration//GEN-END:variables
}
