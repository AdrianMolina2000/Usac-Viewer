/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import ClasesProporcionadas.JPEGHandler;
import Editor.JPEGtoBMPImage;
import Editor.JPEGImageCopy;
import Editor.JPEGImageHandlerBN;
import Editor.JPEGImageHandlerColors;
import Editor.JPEGImageHandlerRotator;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Amc
 */
public class Editor extends javax.swing.JFrame {

    File imagenF = null;

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JB_Buscar = new javax.swing.JButton();
        JB_Ejecutar = new javax.swing.JButton();
        TB_Modificar = new javax.swing.JToggleButton();
        TB_BMP_JPEG1 = new javax.swing.JToggleButton();
        TB_Copia = new javax.swing.JToggleButton();
        TB_ByN = new javax.swing.JToggleButton();
        TB_RGBS = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        JL_Directorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(820, 510));
        setMinimumSize(new java.awt.Dimension(820, 510));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(820, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 510));
        jPanel1.setLayout(null);

        JB_Buscar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JB_Buscar.setText("SELECCIONAR IMAGEN");
        JB_Buscar.setMaximumSize(new java.awt.Dimension(80, 30));
        JB_Buscar.setMinimumSize(new java.awt.Dimension(80, 30));
        JB_Buscar.setPreferredSize(new java.awt.Dimension(80, 30));
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(JB_Buscar);
        JB_Buscar.setBounds(510, 20, 250, 30);

        JB_Ejecutar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JB_Ejecutar.setText("EJECUTAR");
        JB_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EjecutarActionPerformed(evt);
            }
        });
        jPanel1.add(JB_Ejecutar);
        JB_Ejecutar.setBounds(20, 430, 250, 31);

        TB_Modificar.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        TB_Modificar.setText("MODIFICAR IMAGEN");
        jPanel1.add(TB_Modificar);
        TB_Modificar.setBounds(20, 310, 250, 34);

        TB_BMP_JPEG1.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        TB_BMP_JPEG1.setText("BMP a JPEG, JPEG a BMP");
        jPanel1.add(TB_BMP_JPEG1);
        TB_BMP_JPEG1.setBounds(20, 70, 250, 34);

        TB_Copia.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        TB_Copia.setText("COPIA JPEG");
        jPanel1.add(TB_Copia);
        TB_Copia.setBounds(20, 130, 250, 34);

        TB_ByN.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        TB_ByN.setText("BLANCO Y NEGRO");
        jPanel1.add(TB_ByN);
        TB_ByN.setBounds(20, 250, 250, 34);

        TB_RGBS.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        TB_RGBS.setText("ROJO VERDE AZUL SEPIA");
        jPanel1.add(TB_RGBS);
        TB_RGBS.setBounds(20, 190, 250, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s5.gif"))); // NOI18N
        jLabel2.setText(".");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 510));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 510));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 510));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 70, 450, 390);

        JL_Directorio.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        JL_Directorio.setForeground(new java.awt.Color(0, 0, 0));
        JL_Directorio.setText("Sin Imagen");
        jPanel1.add(JL_Directorio);
        JL_Directorio.setBounds(20, 10, 430, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo Biblioteca2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(820, 510));
        jLabel1.setMinimumSize(new java.awt.Dimension(820, 510));
        jLabel1.setPreferredSize(new java.awt.Dimension(820, 510));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        JFileChooser fileC = new JFileChooser();
        fileC.setDialogTitle("Obtener imagen");
        if (fileC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File file = fileC.getSelectedFile().getAbsoluteFile();
            imagenF = new File(file.getAbsolutePath());
            JL_Directorio.setText(imagenF.getAbsolutePath());
        }
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void JB_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EjecutarActionPerformed
        if (imagenF != null) {
            if (TB_BMP_JPEG1.isSelected()) {
                JPEGtoBMPImage convertir = new JPEGtoBMPImage(imagenF);
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(convertir);
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_Copia.isSelected()) {
                JPEGImageCopy convertir = new JPEGImageCopy(imagenF);
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(convertir);
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_ByN.isSelected()) {
                JPEGImageHandlerBN blancoYnegro = new JPEGImageHandlerBN(imagenF);
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(blancoYnegro);
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_RGBS.isSelected()) {
                JPEGImageHandlerColors colores = new JPEGImageHandlerColors(imagenF);
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(colores);
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }if (TB_Modificar.isSelected()) {
                JPEGImageHandlerRotator colores = new JPEGImageHandlerRotator(imagenF);
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(colores);
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe agregar una imagen",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_JB_EjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Ejecutar;
    private javax.swing.JLabel JL_Directorio;
    private javax.swing.JToggleButton TB_BMP_JPEG1;
    private javax.swing.JToggleButton TB_ByN;
    private javax.swing.JToggleButton TB_Copia;
    private javax.swing.JToggleButton TB_Modificar;
    private javax.swing.JToggleButton TB_RGBS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}