/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Convertidor.Threads;
import Convertidor.FIFO;
import Categorias.Categoria;
import Categorias.ListaDoble;
import Convertidor.ColaSimple;
import Convertidor.LIFO;
import Imagenes.ListaCircular;
import Usuarios.ListaSimple;
import Usuarios.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Amc
 */
public class Convertidor extends javax.swing.JFrame {

    ListaSimple listaUsuarios = new ListaSimple();
    ListaDoble listaCategorias = new ListaDoble();
    ListaCircular listaImagenes = new ListaCircular();
    ColaSimple colaProcesamiento = new ColaSimple();
    Usuario usuario;
    Categoria categoria;
    Categoria[] categoriaV;

    DefaultListModel JL_modeloLista;

    public Convertidor() {
        initComponents();
        JL_modeloLista = new DefaultListModel();
        JList_Procesamiento.setModel(JL_modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_FIFO = new javax.swing.JButton();
        JCombo_Categorias = new javax.swing.JComboBox<>();
        JCombo_Usuarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList_Procesamiento = new javax.swing.JList<>();
        TB_ByN = new javax.swing.JToggleButton();
        TB_BMP_JPEG1 = new javax.swing.JToggleButton();
        TB_Copia = new javax.swing.JToggleButton();
        TB_RGBS = new javax.swing.JToggleButton();
        TB_Modificar = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        JB_Paralelo = new javax.swing.JButton();
        JB_LIFO = new javax.swing.JButton();
        JProgress = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_Area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(820, 560));
        setMinimumSize(new java.awt.Dimension(820, 560));
        setPreferredSize(new java.awt.Dimension(820, 560));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        JB_FIFO.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JB_FIFO.setText("Ejecutar en FIFO");
        JB_FIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_FIFOActionPerformed(evt);
            }
        });
        getContentPane().add(JB_FIFO);
        JB_FIFO.setBounds(550, 250, 170, 31);

        getContentPane().add(JCombo_Categorias);
        JCombo_Categorias.setBounds(400, 20, 180, 30);

        JCombo_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(JCombo_Usuarios);
        JCombo_Usuarios.setBounds(100, 20, 180, 30);

        jScrollPane1.setViewportView(JList_Procesamiento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 170, 370);

        TB_ByN.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        TB_ByN.setText("Blanco y Negro");
        getContentPane().add(TB_ByN);
        TB_ByN.setBounds(310, 300, 180, 31);

        TB_BMP_JPEG1.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        TB_BMP_JPEG1.setText("JPEG a BMP o Viceversa");
        TB_BMP_JPEG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_BMP_JPEG1ActionPerformed(evt);
            }
        });
        getContentPane().add(TB_BMP_JPEG1);
        TB_BMP_JPEG1.setBounds(310, 100, 180, 31);

        TB_Copia.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        TB_Copia.setText("Copia JPEG");
        getContentPane().add(TB_Copia);
        TB_Copia.setBounds(310, 150, 180, 31);

        TB_RGBS.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        TB_RGBS.setText("Rojo Verde Azul Sepia");
        getContentPane().add(TB_RGBS);
        TB_RGBS.setBounds(310, 200, 180, 31);

        TB_Modificar.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        TB_Modificar.setText("Modificar Imagen");
        getContentPane().add(TB_Modificar);
        TB_Modificar.setBounds(310, 250, 180, 31);

        jButton2.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 20, 150, 31);

        JB_Paralelo.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JB_Paralelo.setText("Ejecutar en Paralelo");
        JB_Paralelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ParaleloActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Paralelo);
        JB_Paralelo.setBounds(550, 150, 170, 31);

        JB_LIFO.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JB_LIFO.setText("Ejecutar en LIFO");
        JB_LIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LIFOActionPerformed(evt);
            }
        });
        getContentPane().add(JB_LIFO);
        JB_LIFO.setBounds(550, 200, 170, 31);
        getContentPane().add(JProgress);
        JProgress.setBounds(310, 350, 410, 30);

        JT_Area.setColumns(20);
        JT_Area.setRows(5);
        jScrollPane2.setViewportView(JT_Area);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 383, 410, 100);

        jLabel4.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cola de Procesamiento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 90, 220, 30);

        jLabel3.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 18, 110, 30);

        jLabel2.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 18, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo Biblioteca2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(820, 560));
        jLabel1.setMinimumSize(new java.awt.Dimension(820, 560));
        jLabel1.setPreferredSize(new java.awt.Dimension(820, 510));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_FIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_FIFOActionPerformed
        if (colaProcesamiento == null) {
            JOptionPane.showMessageDialog(null, "No hay categorias en la cola", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (colaProcesamiento.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "La cola está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int tamanio = colaProcesamiento.getSize();

            FIFO fifo = new FIFO(colaProcesamiento);
            fifo.start();
        }
    }//GEN-LAST:event_JB_FIFOActionPerformed

    private void JB_ParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ParaleloActionPerformed
        if (colaProcesamiento == null) {
            JOptionPane.showMessageDialog(null, "No hay categorias en la cola", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (colaProcesamiento.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "La cola está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int tamanio = colaProcesamiento.getSize();
            categoriaV = new Categoria[colaProcesamiento.getSize()];
            int i = 0;
            while (colaProcesamiento.getSize() != 0) {
                categoria = (Categoria) colaProcesamiento.pop();
                categoriaV[i] = categoria;
                i++;
            }

            for (int j = 0; j < tamanio; j++) {
                Threads hilo = new Threads(categoriaV[j]);
                hilo.start();
            }

        }
    }//GEN-LAST:event_JB_ParaleloActionPerformed

    private void JB_LIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LIFOActionPerformed
        if (colaProcesamiento == null) {
            JOptionPane.showMessageDialog(null, "No hay categorias en la cola", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (colaProcesamiento.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "La cola está vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int tamanio = colaProcesamiento.getSize();
            LIFO lifo = new LIFO(colaProcesamiento);
            lifo.start();
        }
    }//GEN-LAST:event_JB_LIFOActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ObtenerSerializable();
        if (listaUsuarios == null) {
            JOptionPane.showMessageDialog(null, "No hay usuarios existentes",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (listaUsuarios.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            LlenarJComboUsuarios(listaUsuarios);
        }
        JT_Area.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void JCombo_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_UsuariosActionPerformed
        JCombo_Categorias.removeAllItems();
        int numeroUsuario = JCombo_Usuarios.getSelectedIndex();
        usuario = (Usuario) listaUsuarios.get(numeroUsuario);
        if (listaUsuarios == null) {
            JOptionPane.showMessageDialog(null, "No hay categorias existentes",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (listaUsuarios.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "No hay categorias registrados",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            LlenarJComboCategorias(usuario.getListaCategorias());
            listaCategorias = usuario.getListaCategorias();
        }


    }//GEN-LAST:event_JCombo_UsuariosActionPerformed

    private void TB_BMP_JPEG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_BMP_JPEG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_BMP_JPEG1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (listaCategorias.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "Este usuario no posee categorias para agregar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JProgress.setValue(0);
            JL_modeloLista.clear();
            int numeroCategoria = JCombo_Categorias.getSelectedIndex();
            categoria = (Categoria) listaCategorias.get(numeroCategoria);
            listaImagenes = categoria.getListaImagenes();
            if (listaImagenes == null) {
                JOptionPane.showMessageDialog(null, "La categoria está vacia", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (listaImagenes.getSize() == 0) {
                JOptionPane.showMessageDialog(null, "La categoria está vacia", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                colaProcesamiento.add(categoria);
                if (listaCategorias == null) {
                    JOptionPane.showMessageDialog(null, "No hay categorias existentes",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else if (listaCategorias.getSize() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay categorias registrados",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JlistAgregar(colaProcesamiento);
                }
                JT_Area.setText("");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_FIFO;
    private javax.swing.JButton JB_LIFO;
    private javax.swing.JButton JB_Paralelo;
    private javax.swing.JComboBox<String> JCombo_Categorias;
    private javax.swing.JComboBox<String> JCombo_Usuarios;
    private javax.swing.JList<String> JList_Procesamiento;
    public static javax.swing.JProgressBar JProgress;
    public static javax.swing.JTextArea JT_Area;
    public static javax.swing.JToggleButton TB_BMP_JPEG1;
    public static javax.swing.JToggleButton TB_ByN;
    public static javax.swing.JToggleButton TB_Copia;
    public static javax.swing.JToggleButton TB_Modificar;
    public static javax.swing.JToggleButton TB_RGBS;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void ObtenerSerializable() {
        try {
            FileInputStream di = new FileInputStream("datos.txt"); // dist\\datos.txt
            ObjectInputStream lis = new ObjectInputStream(di);
            listaUsuarios = (ListaSimple) lis.readObject();
            lis.close();
            di.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LlenarJComboUsuarios(ListaSimple listaUsuarios) {
        int max = listaUsuarios.getSize();
        for (int i = 0; i < max; i++) {
            Usuario usuario = (Usuario) listaUsuarios.get(i);
            JCombo_Usuarios.addItem(usuario.getNombre());
        }
    }

    public void LlenarJComboCategorias(ListaDoble listaCategorias) {
        int max = listaCategorias.getSize();
        for (int i = 0; i < max; i++) {
            Categoria categoria = (Categoria) listaCategorias.get(i);
            JCombo_Categorias.addItem(categoria.getNombreCategoria());
        }
    }

    public void JlistAgregar(ColaSimple colaProcesamiento) {
        int max = colaProcesamiento.getSize();
        for (int i = 0; i < max; i++) {
            Categoria cat = (Categoria) colaProcesamiento.get(i);
            JL_modeloLista.addElement(cat.getNombreCategoria());
        }
    }

}
