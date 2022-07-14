/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ActorControl;
import Modelo.Actor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulp
 */
public class ActVentana extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActVentana
     */
    private ActorControl actorCtrl;

    public ActVentana() {
        initComponents();
        actorCtrl = new ActorControl();
    }

    public void cargarActorTabla() {
        DefaultTableModel modelo = (DefaultTableModel) TablaActor.getModel();
        modelo.setRowCount(0);
        for (Actor actor : actorCtrl.listar()) {
            Object[] rowData = {actor.getCodigo(),
                actor.getNombre(),
                actor.getNacionalidad(),
                actor.getFechanacimiento(),
                actor.getEdad(),};
            modelo.addRow(rowData);
        }
        TablaActor.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlistar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaActor = new javax.swing.JTable();
        txtnacionalidad = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ACTOR/ACTRIZ");

        btnlistar.setText("LISTAR");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("NACIONALIDAD:");

        jLabel4.setText("FECHA NACIMIENTO:");

        jLabel5.setText("EDAD:");

        TablaActor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE ", "NACIONALIDAD", "FECHA NACI", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaActorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaActor);

        btncrear.setText("CREAR");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncrear)
                .addGap(147, 147, 147)
                .addComponent(btnlistar)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtedad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(btnlistar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        String nombre = txtnombre.getText();
        String nacionalidad = txtnacionalidad.getText();
        int codigo = 0;
        int fecha = 0;
        int edad = 0;

        try {
            fecha = Integer.parseInt(txtfecha.getText());
            edad = Integer.parseInt(txtedad.getText());
            codigo = Integer.parseInt(txtcodigo.getText());
        } catch (Exception e) {
            System.out.println(e);
        }

        Actor actor = new Actor(codigo, nombre, nacionalidad, fecha, edad);

        if (!nombre.isBlank() && !nacionalidad.isBlank() && !txtfecha.getText().isBlank() && !txtedad.getText().isBlank() && !txtcodigo.getText().isBlank()) {
            String[] params = new String[2];
            params[0] = nombre;
            params[1] = nacionalidad;

            actorCtrl.crear(codigo, params, fecha, edad);

        }
        cargarActorTabla();
        txtnombre.setText("");
        txtnacionalidad.setText("");
        txtfecha.setText("");
        txtedad.setText("");

        JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");
    }//GEN-LAST:event_btnlistarActionPerformed

    private void TablaActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaActorMouseClicked
//        // TODO add your handling code here:
//        int fila = TablaActor.getSelectedRow();
//        String nombre = TablaActor.getValueAt(fila, 0).toString();
//        String nacionalidad = TablaActor.getValueAt(fila, 1).toString();
//        int fecha = (int) TablaActor.getValueAt(fila, 2);
//        int edad = (int) TablaActor.getValueAt(fila, 3);
//        int codigo = (int) TablaActor.getValueAt(fila, 3);
//
//        txtnombre.setText(nombre);
//        txtnacionalidad.setText(nacionalidad);
//        txtfecha.setText(String.valueOf(fecha));
//        txtedad.setText(String.valueOf(edad));
//        txtcodigo.setText(String.valueOf(codigo));
    }//GEN-LAST:event_TablaActorMouseClicked

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        String nombre = txtnombre.getText();
        String nacionalidad = txtnacionalidad.getText();

        int fecha = Integer.parseInt(txtfecha.getText());
        int edad = Integer.parseInt(txtedad.getText());
        int codigo = Integer.parseInt(txtcodigo.getText());
        Actor actor = new Actor(codigo, nombre, nacionalidad, fecha, edad);

        if (!nombre.isBlank() && !nacionalidad.isBlank() && !txtfecha.getText().isBlank() && !txtedad.getText().isBlank() && !txtcodigo.getText().isBlank()) {

            String[] params = new String[2];
            params[0] = nombre;
            params[1] = nacionalidad;
            try {
                actorCtrl.crear(codigo, params, fecha, edad);
                JOptionPane.showMessageDialog(this, "Actor registrado", "CREAR", JOptionPane.INFORMATION_MESSAGE);
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "CREAR", JOptionPane.ERROR_MESSAGE);
            }
            
        }

        txtnombre.setText("");
        txtnacionalidad.setText("");
        txtfecha.setText("");
        txtedad.setText("");
        txtcodigo.setText("");
    }//GEN-LAST:event_btncrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaActor;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnlistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnacionalidad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}