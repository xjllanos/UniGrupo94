
package unigrupo94.Vistas;

import java.util.ArrayList;
import unigrupo94.AccesoADatos.MateriaData;
import unigrupo94.Entidades.Materia;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unigrupo94.AccesoADatos.AlumnoData;
import unigrupo94.AccesoADatos.InscripcionData;
import unigrupo94.Entidades.Alumno;
import unigrupo94.Entidades.Inscripcion;

public class ListadoDeAlumnosPorMaterias extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel (){

        public boolean isCellEditable (int f, int c){
            return false ; 
        }
    };
    /**
     * Creates new form ListadoDeAlumnosPorMaterias
     */
    public ListadoDeAlumnosPorMaterias() {
        initComponents();
        armarCabecera ();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBmateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAluporMate = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("SELECCIONE MATERIA:");

        jCBmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBmateriaActionPerformed(evt);
            }
        });

        jTAluporMate.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTAluporMate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBmateriaActionPerformed
        // Obtengo la materia seleccionada del JComboBox
        Materia materiaSeleccionada = (Materia) jCBmateria.getSelectedItem();
        
        // Verifico si se seleccionó una materia válida
        if (materiaSeleccionada != null) {
            // Limpio la tabla si ya contiene datos
            DefaultTableModel modeloTabla = (DefaultTableModel) jTAluporMate.getModel();
            modeloTabla.setRowCount(0);

            // aca obtengo las inscripciones de esa materia desde la base de datos utilizando InscripcionData
            InscripcionData inscripcionData = new InscripcionData();
            // Pasa el idMateria en lugar del objeto Materia
            List<Alumno> alumnos = inscripcionData.obtenerAlumnosxMateria(materiaSeleccionada.getIdMateria());

            // Itero sobre las inscripciones y agrega cada una como una fila en la tabla
            for (Alumno alumno : alumnos) {
                Object[] rowData = {
                    alumno.getIdAlumno(),
                    alumno.getApellido(),
                    alumno.getNombre(),
                    alumno.getDni(),
                };
                modeloTabla.addRow(rowData);
            }
  
        }
    
    }//GEN-LAST:event_jCBmateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCBmateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAluporMate;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera (){
        modelo.addColumn("ID");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DNI");
        jTAluporMate.setModel(modelo);
    
    }

    //creacion de codigo para controlar jcombobox
    private void cargarCombo(){
       //En esta línea, crea una instancia de la clase MateriaData. Esto se hace para poder acceder a los métodos
       //y datos de esa clase, en particular, al método listarMaterias() que se utiliza para obtener la lista de
       //materias desde la base de datos.
        MateriaData materiaData = new MateriaData();
        // Llamo al método listarMaterias() para obtener la lista de materias
        List<Materia> listaMaterias = materiaData.listarMaterias();
        // Convierto la lista de materias en un array de objetos
        Materia[] materiasArray = listaMaterias.toArray(new Materia[0]);
        // Creo un modelo para el JComboBox utilizando el array de materias
        DefaultComboBoxModel<Materia> modeloComboBox = new DefaultComboBoxModel<>(materiasArray);
        // Asigna el modelo al JComboBox
        jCBmateria.setModel(modeloComboBox);
    }

}
