/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST2;

/**
 *
 * @author Jodi
 */
public class output extends javax.swing.JFrame {

    /**
     * Creates new form output
     */
    public output() {
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
        labelNama = new javax.swing.JLabel();
        labelTTL = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelJK = new javax.swing.JLabel();
        labelRTRW = new javax.swing.JLabel();
        labelDesa = new javax.swing.JLabel();
        labelKec = new javax.swing.JLabel();
        labelKota = new javax.swing.JLabel();
        labelAgama = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelGoldar = new javax.swing.JLabel();
        labelKewarganegaraan = new javax.swing.JLabel();
        labelPekerjaan = new javax.swing.JLabel();
        txtNama1 = new javax.swing.JTextField();
        txtTmptLahir1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTglLahir1 = new javax.swing.JTextField();
        txtAlamat1 = new javax.swing.JTextField();
        txtRT1 = new javax.swing.JTextField();
        txtDesa1 = new javax.swing.JTextField();
        txtKec1 = new javax.swing.JTextField();
        txtKota1 = new javax.swing.JTextField();
        txtPekerjaan1 = new javax.swing.JTextField();
        txtRW1 = new javax.swing.JTextField();
        foto1 = new javax.swing.JPanel();
        Foto1 = new javax.swing.JLabel();
        btnRegisterUlang = new javax.swing.JButton();
        txtJK1 = new javax.swing.JTextField();
        txtStatus1 = new javax.swing.JTextField();
        txtAgama1 = new javax.swing.JTextField();
        txtGoldar1 = new javax.swing.JTextField();
        txtKewarganegaraan1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Formulir Pengisian KTP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moon", 0, 24)))); // NOI18N

        labelNama.setText("Nama");

        labelTTL.setText("Tempat/Tanggal Lahir");

        labelAlamat.setText("Alamat");

        labelJK.setText("Jenis Kelamin");

        labelRTRW.setText("RT/RW");

        labelDesa.setText("Kelurahan/Desa");

        labelKec.setText("Kecamatan");

        labelKota.setText("Kota");

        labelAgama.setText("Agama");

        labelStatus.setText("Status");

        labelGoldar.setText("Golongan Darah");

        labelKewarganegaraan.setText("Kewarganegaraan");

        labelPekerjaan.setText("Pekerjaan");

        txtNama1.setEditable(false);
        txtNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama1ActionPerformed(evt);
            }
        });

        txtTmptLahir1.setEditable(false);
        txtTmptLahir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmptLahir1ActionPerformed(evt);
            }
        });

        jLabel14.setText("/");

        txtTglLahir1.setEditable(false);

        txtAlamat1.setEditable(false);
        txtAlamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamat1ActionPerformed(evt);
            }
        });

        txtRT1.setEditable(false);

        txtDesa1.setEditable(false);

        txtKec1.setEditable(false);

        txtKota1.setEditable(false);

        txtPekerjaan1.setEditable(false);

        txtRW1.setEditable(false);
        txtRW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRW1ActionPerformed(evt);
            }
        });

        foto1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP)));

        javax.swing.GroupLayout foto1Layout = new javax.swing.GroupLayout(foto1);
        foto1.setLayout(foto1Layout);
        foto1Layout.setHorizontalGroup(
            foto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        foto1Layout.setVerticalGroup(
            foto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foto1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        btnRegisterUlang.setText("Daftar Ulang");
        btnRegisterUlang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterUlangMouseClicked(evt);
            }
        });
        btnRegisterUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUlangActionPerformed(evt);
            }
        });

        txtJK1.setEditable(false);
        txtJK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJK1ActionPerformed(evt);
            }
        });

        txtStatus1.setEditable(false);
        txtStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus1ActionPerformed(evt);
            }
        });

        txtAgama1.setEditable(false);
        txtAgama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgama1ActionPerformed(evt);
            }
        });

        txtGoldar1.setEditable(false);
        txtGoldar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoldar1ActionPerformed(evt);
            }
        });

        txtKewarganegaraan1.setEditable(false);
        txtKewarganegaraan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKewarganegaraan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNama)
                    .addComponent(labelTTL)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKec)
                            .addComponent(labelDesa)
                            .addComponent(labelKota)))
                    .addComponent(labelAgama)
                    .addComponent(labelStatus)
                    .addComponent(labelGoldar)
                    .addComponent(labelPekerjaan)
                    .addComponent(labelKewarganegaraan)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelRTRW)
                        .addComponent(labelJK))
                    .addComponent(labelAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPekerjaan1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtKec1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesa1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTmptLahir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTglLahir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNama1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtRT1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRW1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtKota1)
                            .addComponent(txtJK1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAgama1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGoldar1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtKewarganegaraan1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegisterUlang)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNama)
                    .addComponent(txtNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTTL)
                            .addComponent(txtTmptLahir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglLahir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJK)
                            .addComponent(txtJK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(txtAlamat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRTRW)
                            .addComponent(txtRT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtRW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDesa)
                            .addComponent(txtDesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKec)
                            .addComponent(txtKec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKota)
                            .addComponent(txtKota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAgama)
                            .addComponent(txtAgama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStatus)
                            .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGoldar)
                            .addComponent(txtGoldar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPekerjaan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPekerjaan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKewarganegaraan)
                            .addComponent(txtKewarganegaraan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegisterUlang)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTmptLahir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmptLahir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTmptLahir1ActionPerformed

    private void txtAlamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamat1ActionPerformed

    private void btnRegisterUlangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterUlangMouseClicked

    }//GEN-LAST:event_btnRegisterUlangMouseClicked

    private void btnRegisterUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUlangActionPerformed
        this.dispose();
        new output().setVisible(false);
    }//GEN-LAST:event_btnRegisterUlangActionPerformed

    private void txtNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama1ActionPerformed

    private void txtJK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJK1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJK1ActionPerformed

    private void txtStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus1ActionPerformed

    private void txtGoldar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoldar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoldar1ActionPerformed

    private void txtRW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRW1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRW1ActionPerformed

    private void txtAgama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgama1ActionPerformed

    private void txtKewarganegaraan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKewarganegaraan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKewarganegaraan1ActionPerformed

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
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Foto1;
    private javax.swing.JButton btnRegisterUlang;
    public javax.swing.JPanel foto1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAgama;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelDesa;
    private javax.swing.JLabel labelGoldar;
    private javax.swing.JLabel labelJK;
    private javax.swing.JLabel labelKec;
    private javax.swing.JLabel labelKewarganegaraan;
    private javax.swing.JLabel labelKota;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPekerjaan;
    private javax.swing.JLabel labelRTRW;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTTL;
    public static javax.swing.JTextField txtAgama1;
    public static javax.swing.JTextField txtAlamat1;
    public static javax.swing.JTextField txtDesa1;
    public static javax.swing.JTextField txtGoldar1;
    public static javax.swing.JTextField txtJK1;
    public static javax.swing.JTextField txtKec1;
    public static javax.swing.JTextField txtKewarganegaraan1;
    public static javax.swing.JTextField txtKota1;
    public static javax.swing.JTextField txtNama1;
    public static javax.swing.JTextField txtPekerjaan1;
    public static javax.swing.JTextField txtRT1;
    public static javax.swing.JTextField txtRW1;
    public static javax.swing.JTextField txtStatus1;
    public static javax.swing.JTextField txtTglLahir1;
    public static javax.swing.JTextField txtTmptLahir1;
    // End of variables declaration//GEN-END:variables

    
}
