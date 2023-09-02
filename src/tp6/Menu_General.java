/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp6;

import java.util.TreeSet;

/**
 *
 * @author Mateo
 */
public class Menu_General extends javax.swing.JFrame {
public static TreeSet<Producto> lista=new TreeSet<>();
    /**
     * Creates new form NewJFrame
     */
    public Menu_General() {
        initComponents();
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmProducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmRubro = new javax.swing.JMenuItem();
        jmNombre = new javax.swing.JMenuItem();
        jmPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jMenu3.setText("Administracion");

        jmProducto.setText("Productos");
        jmProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductoActionPerformed(evt);
            }
        });
        jMenu3.add(jmProducto);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Consultas");

        jmRubro.setText("Por Rubro");
        jmRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRubroActionPerformed(evt);
            }
        });
        jMenu4.add(jmRubro);

        jmNombre.setText("Por Nombre");
        jmNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNombreActionPerformed(evt);
            }
        });
        jMenu4.add(jmNombre);

        jmPrecio.setText("Por Precio");
        jmPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrecioActionPerformed(evt);
            }
        });
        jMenu4.add(jmPrecio);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ProductoInternalFrame cpr=new ProductoInternalFrame();
        cpr.setVisible(true);
        escritorio.add(cpr);
        escritorio.moveToFront(cpr);
        
    }//GEN-LAST:event_jmProductoActionPerformed

    private void jmPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrecioActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       ConsultPorPrecio cpn=new ConsultPorPrecio();
       cpn.setVisible(true);
       escritorio.add(cpn);
       escritorio.moveToFront(cpn);
    }//GEN-LAST:event_jmPrecioActionPerformed

    private void jmRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultasPorRubro modelo=new ConsultasPorRubro();
        modelo.setVisible(true);
        escritorio.add(modelo);
        escritorio.moveToFront(modelo);      
    }//GEN-LAST:event_jmRubroActionPerformed

    private void jmNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultPorNombre modelo = new ConsultPorNombre();
        modelo.setVisible(true);
        escritorio.add(modelo);
        escritorio.moveToFront(modelo);
    }//GEN-LAST:event_jmNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_General().setVisible(true);
            }
        });
    }
    
    public void cargarProductos(){
        lista.add(new Producto(1, "Rollos De Cocina Check 20,7x20cm 3u", 558.88, 12, "Limpieza"));
        lista.add(new Producto(2, "Limpiador De Baño Mr Músculo En Crema Citrus 450ml", 514.50, 12, "Limpieza"));
        lista.add(new Producto(3, "Canasta Líquida Para Inodoro Glade Brisa De Las Cumbres Repuesto 50ml", 626.85, 12, "Limpieza"));
        lista.add(new Producto(10, "Aceite De Girasol Natura 1,5 Lt ", 610.53, 20, "Comestible"));
        lista.add(new Producto(11, "Mayonesa Natura 500 Cc", 360, 12, "Comestible"));
        lista.add(new Producto(12, "Azucar Check Comun Tipo A 1kg ", 699, 12, "Comestible"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmNombre;
    private javax.swing.JMenuItem jmPrecio;
    private javax.swing.JMenuItem jmProducto;
    private javax.swing.JMenuItem jmRubro;
    // End of variables declaration//GEN-END:variables
}
