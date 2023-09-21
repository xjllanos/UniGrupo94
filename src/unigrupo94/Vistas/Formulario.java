/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unigrupo94.Vistas;

/**
 *
 * @author JATil
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        jMenu3 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jtAlumno = new javax.swing.JMenu();
        jMGesAlu = new javax.swing.JMenuItem();
        jtMateria = new javax.swing.JMenu();
        jMGesMate = new javax.swing.JMenuItem();
        jtAdmi = new javax.swing.JMenu();
        jMInscripcion = new javax.swing.JMenuItem();
        jMNotas = new javax.swing.JMenuItem();
        jtConsultas = new javax.swing.JMenu();
        jMAluPorMateria = new javax.swing.JMenuItem();
        jtSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jtAlumno.setText("Alumno");

        jMGesAlu.setText("Formulario de Alumno");
        jMGesAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGesAluActionPerformed(evt);
            }
        });
        jtAlumno.add(jMGesAlu);

        jMenuBar1.add(jtAlumno);

        jtMateria.setText("Materia");

        jMGesMate.setText("Formulario de Materia");
        jMGesMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGesMateActionPerformed(evt);
            }
        });
        jtMateria.add(jMGesMate);

        jMenuBar1.add(jtMateria);

        jtAdmi.setText("Administracion");

        jMInscripcion.setText("Manejo de Inscripciones");
        jMInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionActionPerformed(evt);
            }
        });
        jtAdmi.add(jMInscripcion);

        jMNotas.setText("Manipulacion de notas");
        jMNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNotasActionPerformed(evt);
            }
        });
        jtAdmi.add(jMNotas);

        jMenuBar1.add(jtAdmi);

        jtConsultas.setText("Consultas");

        jMAluPorMateria.setText("Alumnos por materia");
        jMAluPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAluPorMateriaActionPerformed(evt);
            }
        });
        jtConsultas.add(jMAluPorMateria);

        jMenuBar1.add(jtConsultas);

        jtSalir.setText("Salir");
        jMenuBar1.add(jtSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMGesAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGesAluActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeAlumnos gda = new GestionDeAlumnos (); 
        gda.setVisible(true);
        escritorio.add(gda);
        escritorio.moveToFront(gda);
    }//GEN-LAST:event_jMGesAluActionPerformed

    private void jMGesMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGesMateActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeMaterias gdm = new GestionDeMaterias (); 
        gdm.setVisible(true);
        escritorio.add(gdm);
        escritorio.moveToFront(gdm);
    }//GEN-LAST:event_jMGesMateActionPerformed

    private void jMInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion fdi = new FormularioDeInscripcion ();
        fdi.setVisible(true);
        escritorio.add(fdi);
        escritorio.moveToFront(fdi);
    }//GEN-LAST:event_jMInscripcionActionPerformed

    private void jMNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNotasActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotas cdn = new CargaDeNotas ();
        cdn.setVisible(true);
        escritorio.add(cdn);
        escritorio.moveToFront(cdn);
        
    }//GEN-LAST:event_jMNotasActionPerformed

    private void jMAluPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAluPorMateriaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ListadoDeAlumnosPorMaterias lda = new ListadoDeAlumnosPorMaterias ();
        lda.setVisible(true);
        escritorio.add(lda);
        escritorio.moveToFront(lda);
        
    }//GEN-LAST:event_jMAluPorMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMAluPorMateria;
    private javax.swing.JMenuItem jMGesAlu;
    private javax.swing.JMenuItem jMGesMate;
    private javax.swing.JMenuItem jMInscripcion;
    private javax.swing.JMenuItem jMNotas;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jtAdmi;
    private javax.swing.JMenu jtAlumno;
    private javax.swing.JMenu jtConsultas;
    private javax.swing.JMenu jtMateria;
    private javax.swing.JMenu jtSalir;
    // End of variables declaration//GEN-END:variables
    
    


}
