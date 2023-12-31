/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author avoch
 */
public class ConsultasPorRubro extends javax.swing.JInternalFrame {
   
    private DefaultTableModel modelo=new DefaultTableModel();
    private DefaultComboBoxModel tabc=new DefaultComboBoxModel();
    
   
    public ConsultasPorRubro() {
        initComponents();
        armarCabecera();
        armarCategoria();
        verProduct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jcRubr = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Productos por Rubro");

        jcRubr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRubrActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija rubro:");

        jtTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcRubr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcRubr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcRubrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRubrActionPerformed
        borrarEscritura();
        ordenar();
    }//GEN-LAST:event_jcRubrActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasPorRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasPorRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasPorRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasPorRubro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasPorRubro().setVisible(true);
            }
        });
    }
    private void armarCabecera(){
    modelo.addColumn("Código");
    modelo.addColumn("Descripción");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    jtTabla.setModel(modelo);
    
    };


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> jcRubr;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    private void verProduct(){
        for(Producto agrubro: Menu_General.lista){
            modelo.addRow(new Object[]{
                agrubro.getCodigo(),
                agrubro.getDescripcion(),
                agrubro.getPrecio(),
                agrubro.getStock()
            });
        }
    }
    private void armarCategoria(){
        tabc.addElement("Seleccionar");
        tabc.addElement("Comestible");
        tabc.addElement("Limpieza");
        tabc.addElement("Perfumería");
        jcRubr.setModel(tabc);
    }
    
    private void borrarEscritura(){
        int b=jtTabla.getRowCount()-1;
        for(;b>=0;b--){
            modelo.removeRow(b);
        }
    }
    
    private void ordenar(){
        for(Producto verPro: Menu_General.lista){
            if (verPro.getRubro().equalsIgnoreCase((String)jcRubr.getSelectedItem())) {
                modelo.addRow(new Object[]{
                verPro.getCodigo(),
                verPro.getDescripcion(),
                verPro.getPrecio(),
                verPro.getStock()
                });
            }else if(jcRubr.getSelectedItem()== "Seleccionar "){
                borrarEscritura();
                verProduct();
            }
        }
    }
}