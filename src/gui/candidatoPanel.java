package gui;

/**
 *
 * @author emanuel
 */

import negocio.Eleccion;
import util.Notificacion;

public class candidatoPanel extends javax.swing.JPanel {

    private Eleccion elecciones;
    
    public candidatoPanel(Eleccion elecciones) {
        initComponents();
        this.elecciones = elecciones;
        cargarComboPartidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPartidoPolitico = new javax.swing.JComboBox();
        cmbMiembro = new javax.swing.JComboBox();
        txtFechaPostulacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADiscurso = new javax.swing.JTextArea();
        cmdGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Candidato");

        jLabel2.setText("Fecha de postulación: ");

        jLabel3.setText("Discurso: ");

        jLabel4.setText("Partido politico: ");

        jLabel5.setText("Miembro: ");

        cmbPartidoPolitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPartidoPoliticoActionPerformed(evt);
            }
        });

        txtADiscurso.setColumns(20);
        txtADiscurso.setRows(5);
        jScrollPane1.setViewportView(txtADiscurso);

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Destino de candidatura: ");

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gobernación", "Alcaldía", "Concejo", "Asamblea", "Cámara de Representantes" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPartidoPolitico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMiembro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaPostulacion)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 273, Short.MAX_VALUE)
                        .addComponent(cmdGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDestino, 0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaPostulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdGuardar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String partido[] = cmbPartidoPolitico.getSelectedItem().toString().split("-");
        String miembro[] = cmbMiembro.getSelectedItem().toString().split("-");
        String destino = cmbDestino.getSelectedItem().toString();
        String fechaPostulacion = txtFechaPostulacion.getText();
        String discurso = txtADiscurso.getText();
        
        if(elecciones.registrarCandidato(partido[0], miembro[0], destino, fechaPostulacion, discurso)){
            Notificacion.alertaInformativo("Sistema", "Se ha registrado el candidato");
            limpiarCapos();
        }else
            Notificacion.alertaError("Error", "No se ha podido registrar");
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmbPartidoPoliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPartidoPoliticoActionPerformed
        String partidos[] = elecciones.concatenarPartidos().split("-");
        String partido[] = cmbPartidoPolitico.getSelectedItem().toString().split("-");
        
        cargarComboMiembros(partido[0]);
    }//GEN-LAST:event_cmbPartidoPoliticoActionPerformed

    private void limpiarCapos(){
        txtFechaPostulacion.setText("");
        txtADiscurso.setText("");
    }
    
    private void cargarComboPartidos(){
        String partidos[] = elecciones.concatenarPartidos().split("~");
        cmbPartidoPolitico.removeAllItems();
        
        for(String x: partidos)
            cmbPartidoPolitico.addItem(x);
    }
    
    private void cargarComboMiembros(String idPartido){
        String miembros[] = elecciones.concatenarMiembros(idPartido).split("~");
        cmbMiembro.removeAllItems();
        
        for(String x: miembros)
            cmbMiembro.addItem(x);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JComboBox cmbMiembro;
    private javax.swing.JComboBox cmbPartidoPolitico;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADiscurso;
    private javax.swing.JTextField txtFechaPostulacion;
    // End of variables declaration//GEN-END:variables
}
