/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiegovarela;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Examen1DiegoVarela extends javax.swing.JFrame {

    /**
     * Creates new form Examen1DiegoVarela
     */
    public Examen1DiegoVarela() {
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

        tutor = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jb_clase = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jt_clase = new javax.swing.JTextField();
        Estudiante = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        jt_aprendizaje = new javax.swing.JTextField();
        jb_guardarestudiante = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_edad = new javax.swing.JTextField();
        jt_carrera = new javax.swing.JTextField();
        jt_lugar = new javax.swing.JTextField();
        jt_numero = new javax.swing.JTextField();
        jt_usuario = new javax.swing.JTextField();
        jt_contraseña = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel9.setText("Agregar clases:");

        jb_clase.setText("Agregar");
        jb_clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_claseMouseClicked(evt);
            }
        });

        jb_salir.setText("Salir");
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tutorLayout = new javax.swing.GroupLayout(tutor.getContentPane());
        tutor.getContentPane().setLayout(tutorLayout);
        tutorLayout.setHorizontalGroup(
            tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tutorLayout.createSequentialGroup()
                        .addComponent(jb_clase)
                        .addGap(65, 65, 65)
                        .addComponent(jb_salir))
                    .addGroup(tutorLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        tutorLayout.setVerticalGroup(
            tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jt_clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(tutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_clase)
                    .addComponent(jb_salir))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jLabel10.setText("Nivel de aprendizaje:");

        jb_guardarestudiante.setText("Guardar");
        jb_guardarestudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarestudianteMouseClicked(evt);
            }
        });
        jb_guardarestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarestudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EstudianteLayout = new javax.swing.GroupLayout(Estudiante.getContentPane());
        Estudiante.getContentPane().setLayout(EstudianteLayout);
        EstudianteLayout.setHorizontalGroup(
            EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudianteLayout.createSequentialGroup()
                .addGroup(EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstudianteLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_aprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EstudianteLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jb_guardarestudiante)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        EstudianteLayout.setVerticalGroup(
            EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudianteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jt_aprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jb_guardarestudiante)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Carrera:");

        jLabel4.setText("Lugar de nacimiento:");

        jLabel5.setText("Numero de cuenta:");

        jLabel6.setText("Usuario:");

        jLabel7.setText("Contraseña:");

        jt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nombreActionPerformed(evt);
            }
        });

        jt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_edadActionPerformed(evt);
            }
        });

        jt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_contraseñaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de alumno:");

        jButton1.setText("Tutor");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Estudiante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_edad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_carrera))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_numero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_usuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_contraseña)))
                        .addGap(55, 244, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear cuenta", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Login", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Crear examen", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nombreActionPerformed

    private void jt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_edadActionPerformed

    private void jt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_contraseñaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.tutor.pack();
        tutor.setVisible(true);
        tutor.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_claseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_claseMouseClicked
        // TODO add your handling code here:
        String clase;
        Tutores t = new Tutores();
        clase = jt_clase.getText();
        t.getClases().add(clase);
        JOptionPane.showMessageDialog(null, "Clase agregada con exito");
        jt_clase.setText("");
    }//GEN-LAST:event_jb_claseMouseClicked

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked
        // TODO add your handling code here:
        String nombre, carrera, lugar, usuario, contraseña;
        int edad, numero;
        try {
            nombre = jt_nombre.getText();
            carrera = jt_carrera.getText();
            lugar = jt_lugar.getText();
            edad = Integer.parseInt(jt_edad.getText());
            numero = Integer.parseInt(jt_numero.getText());
            usuario = jt_nombre.getText();
            contraseña = jt_nombre.getText();
            Tutores t = new Tutores(0, 0, edad, nombre, edad, carrera, usuario, numero, usuario, contraseña);
            lista.add(t);
            JOptionPane.showMessageDialog(null, "Alumno creado con exito");
            jt_nombre.setText("");
            jt_carrera.setText("");
            jt_edad.setText("");
            jt_contraseña.setText("");
            jt_usuario.setText("");
            jt_numero.setText("");
            jt_lugar.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hubo un error y no se guardaron los datos contacte al administrador");
        }
        this.tutor.pack();
        tutor.setVisible(false);
    }//GEN-LAST:event_jb_salirMouseClicked

    private void jb_guardarestudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarestudianteMouseClicked
        // TODO add your handling code here:
        String nombre, carrera, lugar, usuario, contraseña;
        int edad, numero, aprendizaje;
        try {
            nombre = jt_nombre.getText();
            carrera = jt_carrera.getText();
            lugar = jt_lugar.getText();
            edad = Integer.parseInt(jt_edad.getText());
            numero = Integer.parseInt(jt_numero.getText());
            usuario = jt_nombre.getText();
            contraseña = jt_nombre.getText();
            aprendizaje = Integer.parseInt(jt_aprendizaje.getText());
            Estudiante t = new Estudiante(0, aprendizaje, nombre, edad, carrera, usuario, numero, usuario, contraseña);
            lista.add(t);
            JOptionPane.showMessageDialog(null, "Alumno creado con exito");
            jt_nombre.setText("");
            jt_carrera.setText("");
            jt_edad.setText("");
            jt_contraseña.setText("");
            jt_usuario.setText("");
            jt_numero.setText("");
            jt_lugar.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hubo un error y no se guardaron los datos contacte al administrador");
        }
        this.tutor.pack();
        tutor.setVisible(false);
    }//GEN-LAST:event_jb_guardarestudianteMouseClicked

    private void jb_guardarestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarestudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarestudianteActionPerformed

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
            java.util.logging.Logger.getLogger(Examen1DiegoVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen1DiegoVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen1DiegoVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen1DiegoVarela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen1DiegoVarela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_clase;
    private javax.swing.JButton jb_guardarestudiante;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField jt_aprendizaje;
    private javax.swing.JTextField jt_carrera;
    private javax.swing.JTextField jt_clase;
    private javax.swing.JTextField jt_contraseña;
    private javax.swing.JTextField jt_edad;
    private javax.swing.JTextField jt_lugar;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_numero;
    private javax.swing.JTextField jt_usuario;
    private javax.swing.JFrame tutor;
    // End of variables declaration//GEN-END:variables
ArrayList<Alumnos> lista = new ArrayList();
}
