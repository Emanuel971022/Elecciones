package gui;

import negocio.Eleccion;
import util.Notificacion;

/**
 *
 * @author emanuel
 */
public class votarPanel extends javax.swing.JPanel {

    private Eleccion elecciones;
    
    public votarPanel(Eleccion elecciones){
        initComponents();
        this.elecciones = elecciones;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cmbPartidoPolitico = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbCandidato = new javax.swing.JComboBox();
        cmdVotar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Votaciones");

        jLabel6.setText("Destino de candidatura: ");

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gobernación", "Alcaldía", "Concejo", "Asamblea", "Cámara de Representantes" }));
        cmbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDestinoActionPerformed(evt);
            }
        });

        jLabel3.setText("Partido politico: ");

        cmbPartidoPolitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPartidoPoliticoActionPerformed(evt);
            }
        });

        jLabel4.setText("Candidato: ");

        cmdVotar.setText("¡VOTAR!");
        cmdVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDestino, 0, 220, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPartidoPolitico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCandidato, 0, 175, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(cmdVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDestinoActionPerformed
        String destino = cmbDestino.getSelectedItem().toString();
        
        String partidos[] = elecciones.concatenarPartidosPorDestinoVotar(destino).split("~");
        cmbPartidoPolitico.removeAllItems();
        for(String x: partidos)
            cmbPartidoPolitico.addItem(x);
    }//GEN-LAST:event_cmbDestinoActionPerformed

    private void cmbPartidoPoliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPartidoPoliticoActionPerformed
        String destino = cmbDestino.getSelectedItem().toString();
        String partido = "";
        
        try{
            partido = cmbPartidoPolitico.getSelectedItem().toString();
        }catch(NullPointerException ex){}
        
        String candidatos[] = elecciones.concatenarCandidatosPorDestinoVotar(destino, partido).split("~");
        cmbCandidato.removeAllItems();
        for(String x: candidatos)
            cmbCandidato.addItem(x);
    }//GEN-LAST:event_cmbPartidoPoliticoActionPerformed

    private void cmdVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVotarActionPerformed
        String destino = cmbDestino.getSelectedItem().toString();
        String partido = cmbPartidoPolitico.getSelectedItem().toString();
        String candidato = cmbCandidato.getSelectedItem().toString();
        
        if(elecciones.registrarVoto(destino, partido, candidato)){
            Notificacion.alertaInformativo("Sistema", "Gracias por votar");
        }else
            Notificacion.alertaError("Error", "No se ha podido registrar su voto");
    }//GEN-LAST:event_cmdVotarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCandidato;
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JComboBox cmbPartidoPolitico;
    private javax.swing.JButton cmdVotar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
