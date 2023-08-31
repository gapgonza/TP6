/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp6;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class ConsultPorNombre extends javax.swing.JInternalFrame {
    private DefaultTableModel tablaNombre = new DefaultTableModel();
    /**
     * Creates new form ConsultPorNombre
     */
    public ConsultPorNombre() {
        initComponents();
        armarCabecera();
        agregarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPorNombre = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabel2.setText("Consulta por nombre");

        jtNombre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jtPorNombre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPorNombre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        borrarEscritura();
        for(Producto pro: Menu_General.lista){
            if(pro.getDescripcion().toLowerCase().startsWith(jtNombre.getText())){
                tablaNombre.addRow(new Object[]{
                    pro.getCodigo(),
                    pro.getDescripcion(),
                    pro.getPrecio(),
                    pro.getStock()
                });
            }
        }
    }//GEN-LAST:event_jtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtPorNombre;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        tablaNombre.addColumn("Codigo");
        tablaNombre.addColumn("Descripcion");
        tablaNombre.addColumn("Precio");
        tablaNombre.addColumn("Stock");
        jtPorNombre.setModel(tablaNombre);
    }
    
    private void agregarProductos(){
        for(Producto agProducto: Menu_General.lista){
            tablaNombre.addRow(new Object[]{
            agProducto.getCodigo(),
            agProducto.getDescripcion(),
            agProducto.getPrecio(),
            agProducto.getStock()
            });
        }
    }
    
    private void borrarEscritura(){
        int b=tablaNombre.getRowCount()-1;
        for(;b>=0;b--){
            tablaNombre.removeRow(b);
        }
    }
}
