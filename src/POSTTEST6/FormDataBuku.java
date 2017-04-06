package POSTTEST6;                                          // program dibuat dalam package POSTTEST6

import java.sql.*;                                          // mengambil fungsi-fungsi dari java.sql
import javax.swing.table.DefaultTableModel;                 // mengambil fungsi DefaultTableModel dari javax.swing

/**
 *
 * @author Jodi
 */
public class FormDataBuku extends javax.swing.JFrame {      // pendeklarasian dari class FormDataBuku

    private DefaultTableModel model;                        //  pendeklarasian variabel model yang memanggil fungsi dari DefaultTableModel
    private Connection con = koneksi.getConnection();       //  pendeklarasian variabel con yang memanggil fungsi koneksi ke database menggunakan class koneksi dari package yang sama
    private Statement stt;                                  //  pendeklarasian variabel stt yang memanggil fungsi pembuatan statement SQL.
    private ResultSet rss;                                  //  pendeklarasian variabel rss yang memanggil fungsi ResultSet
    
    private void InitTable(){                               // pendeklarasian fungsi InitTable
        model = new DefaultTableModel();                    // pendeklarasian variabel model yang menggunakan fungsi DefaultTableModel
        model.addColumn("JUDUL");                           // penambahan kolom judul pada tabel model
        model.addColumn("PENULIS");                         // penambahan kolom penulis pada tabel model
        model.addColumn("HARGA");                           // penambahan kolom harga pada tabel model
        
        tabel.setModel(model);                              // pengambilan tabel dari model yang telah diset
    }
    
    private void TampilData(){                              // pendeklarasian fungsi TampilData
        try{                                                // menggunakan try-catch
            String sql = "SELECT * FROM buku";              // memasukkan string "SELECT * FROM buku" pada variabel sql
            stt = con.createStatement();                    // pengeksekusian variabel stt untuk menjalankan proses statement
            rss = stt.executeQuery(sql);                    // pengeksekusian query yang akan dibuat
            while(rss.next()){                              // saat menjalankan fungsi next() dari variabel rss,
                Object[] o = new Object[3];                 // Object yang memiliki array dengan panjang 3 dideklarasikan dalam variabel o.
                o[0]= rss.getString("judul");               // di mana array o[0] diisi dengan judul,
                o[1]= rss.getString("penulis");             // a o[1] diisi dengan penulis, dan
                o[2]= rss.getInt("harga");                  // o[2] diisi dengan harga.
                model.addRow(o);                            // Array yang telah terisi dimasukkan ke dalam tabel model dengan mengisi 1 baris.
            }
            
        }catch(SQLException e){                             // menangkap kesalahan yang terjadi dari kesalahan SQL,
            System.out.println(e.getMessage());             // dengan menampilkan pesan error yang terjadi.
        }
    }
    
    private void TambahData(String judul, String penulis, int harga){                       // pendeklarasian fungsi TambahData dengan parameter penulis dan judul dengan tipe data string, dan harga dengan tipe data integer
        try{                                                                                // penggunaan try-catch dalam fungsi TambahData
            String sql =                                                                    // dengan variabel sql yang berupa query "INSERT INTO buku VALUES (NULL,"judul,"penulis",harga);".
                    "INSERT INTO buku VALUES (NULL,'"+judul+"','"+penulis+"',"+harga+")";   //
            stt = con.createStatement();                                                    // query kembali diproses sebagai statement yang akan diproses pada database
            stt.executeUpdate(sql);                                                         // dan penambahan data dari query yang telah dimasukkan
            model.addRow(new Object[]{judul,penulis,harga});                                // dengan menambahkan 1 baris pada tabel berupa data yang telah dimasukkan ke database
        }catch(SQLException e){                                                             // dan menangkap kesalahan yang terjadi pada pengeksekusian query dalam SQL
            System.out.println(e.getMessage());                                             // dengan menampilkan pesan berupa kode error yang terjadi.
        }
    }
    
    public FormDataBuku() {                                                                 // main class
        initComponents();                                                                   // menjalankan fungsi initComponents
    }               

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        comboPenulis = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        comboCari = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(112, 146, 224));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penulis");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        comboPenulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S. Rendra", "Felix Siauw", "Dewi Lestari", "Asma Nada" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHarga)
                    .addComponent(txtJudul)
                    .addComponent(comboPenulis, 0, 222, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(112, 146, 224));

        jLabel1.setFont(new java.awt.Font("Moon", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Data Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimpan);

        btnUbah.setText("Ubah");
        jPanel3.add(btnUbah);

        btnHapus.setText("Hapus");
        jPanel3.add(btnHapus);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(btnKeluar);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jScrollPane3.setViewportView(tabel);

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });

        comboCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

        jLabel5.setFont(new java.awt.Font("Moon", 1, 12)); // NOI18N
        jLabel5.setText("CARI");

        jLabel6.setText("Berdasarkan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       String judul = txtJudul.getText();                                       // saat tombol simpan diklik, judul,
       String penulis = comboPenulis.getSelectedItem().toString();              // penulis, serta
       int harga = Integer.parseInt(txtHarga.getText());                        // harga ditambahkan ke dalam fungsi
       TambahData(judul, penulis, harga);                                       // TambahData.
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        InitTable();                                                            
        TampilData();                                                           
    }//GEN-LAST:event_formComponentShown

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
       System.exit(0);                                                          // saat tombol keluar diklik, mematikan program yang sedang dijalankan.
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
        DefaultTableModel model1 = new DefaultTableModel();                     // pendeklarasian tabel model1 yang digunakan untuk pencarian data.
        model1.addColumn("JUDUL");                                              // dengan menambahkan kolom judul,
        model1.addColumn("PENULIS");                                            // penulis,
        model1.addColumn("HARGA");                                              // dan harga.
        
        try{
            String sql = "Select * from buku where "+comboCari.getSelectedItem().toString()+" like '%"+txtCari.getText()+"%'";      // memasukkan query untuk mencari, dengan comboCari memberikan pilihan kolom mana yang dicari, serta txtCari memasukkan keyword yang telah diketikkan
            stt = con.createStatement();                                                                                            //
            rss = stt.executeQuery(sql);                                                                                            //
            while (rss.next()){                                                                                                     //
                model1.addRow(new Object[]{                                                                                         //
                    rss.getString(2),                                                                                               //
                    rss.getString(3),                                                                                               //
                    rss.getString(4),                                                                                               //
                });
            }
            tabel.setModel(model1);                                             // tabel yang telah ada dimasukkan pada tabel model1
        }catch (Exception e){                                                   //
            System.out.println(e.getMessage());                                 //
        }
    }//GEN-LAST:event_txtCariKeyTyped

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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                                                 //
                new FormDataBuku().setVisible(true);                            //
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox comboCari;
    private javax.swing.JComboBox comboPenulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    // End of variables declaration//GEN-END:variables
}
