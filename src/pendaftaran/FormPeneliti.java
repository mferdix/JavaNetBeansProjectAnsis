/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran;

import Pendaftaran.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Swift 3
 */
public class FormPeneliti extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    protected void aktif(){
        tnip.setEnabled(true);
        tnama.setEnabled(true);
        temail.setEnabled(true);
        ttelp.setEnabled(true);
    }
    
    protected void kosong(){
        tnip.setText("");
        tnama.setText("");
        tasal.setText("");
        temail.setText("");
        ttelp.setText("");
    }
    
    protected void datatable(){
        Object[] Baris = {"NIP/NUP","Nama Lengkap", "Asal Institusi", "Alamat Email"," No Telp", "Upload CV"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelpeneliti.setModel(tabmode);
        
        String sql = "select * from data_peneliti"; //buat hubungin netbeans dengan database
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nip");
                String b = hasil.getString("namapeneliti");
                String c = hasil.getString("institusi");
                String d = hasil.getString("email");
                String e = hasil.getString("telp");
                String f = hasil.getString("uploadCV");
                
                String [] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
       
            } catch(Exception e) {
        }
    }
    /**
     * Creates new form FormPeneliti
     */
    public FormPeneliti() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        bcancel = new javax.swing.JButton();
        email = new javax.swing.JLabel();
        bdelete = new javax.swing.JButton();
        nip = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        bedit = new javax.swing.JButton();
        cv = new javax.swing.JLabel();
        ttelp = new javax.swing.JTextField();
        tpencarian = new javax.swing.JTextField();
        tnip = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tasal = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        temail = new javax.swing.JTextField();
        pencarian = new javax.swing.JLabel();
        bupload = new javax.swing.JButton();
        telp = new javax.swing.JLabel();
        input = new javax.swing.JLabel();
        asal = new javax.swing.JLabel();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpeneliti = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 3));

        judul.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 102));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Data Peneliti");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bcancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bcancel.setText("CANCEL");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        email.setText("Alamat E-mail");

        bdelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        nip.setText("NIP / NUP");

        nama.setText("Nama Lengkap");

        bedit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        cv.setText("Lampirkan CV");

        bsave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        pencarian.setText("Pencarian");

        bupload.setText("Upload CV");

        telp.setText("No Telp");

        input.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        input.setText("Input Data Peneliti");

        asal.setText("Asal Institusi");

        bcari.setText("cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        tabelpeneliti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIP / NUP", "Nama", "Email", "No Telp"
            }
        ));
        tabelpeneliti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenelitiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpeneliti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(asal)
                            .addComponent(email)
                            .addComponent(telp)
                            .addComponent(nip)
                            .addComponent(cv))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcancel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bupload, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tasal)
                                .addComponent(tnama)
                                .addComponent(tnip)
                                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addComponent(pencarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(562, 562, 562)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pencarian)
                            .addComponent(tpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nip)
                            .addComponent(tnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asal)
                            .addComponent(tasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email)
                            .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telp)
                            .addComponent(ttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cv)
                            .addComponent(bupload))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1120, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        // TODO add your handling code here:
        Menubar tugas = new Menubar();
         tugas.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_bcancelActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into data_peneliti values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString (1, tnip.getText());
            stat.setString (2, tnama.getText());
            stat.setString (3, tasal.getText());
            stat.setString (4, temail.getText());
            stat.setString (5, ttelp.getText());
            stat.setString (6, "Coming Soon");
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tnip.requestFocus();
            datatable();
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update data_peneliti set namapeneliti = ?,institusi = ?, email=?, telp=?, uploadCV = ? where nip='" + tnip.getText() + "'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnama.getText());
            stat.setString(2, tasal.getText());
            stat.setString(3, temail.getText());
            stat.setString(4, ttelp.getText());
            stat.setString(5, "Coming Soon");
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            tnip.requestFocus();
            datatable();
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
        }
    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        
        int ok=JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql ="delete from data_peneliti where nip='"+tnip.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                tnip.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e);
            }
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        Object[] Baris = {"NIP/NUP","Nama Lengkap", "Asal Institusi", "Alamat Email"," No Telp", "Upload CV"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelpeneliti.setModel(tabmode);
        String key = tpencarian.getText();
        String sql = "SELECT * FROM data_peneliti where nip like '%"+ key +"%' OR namapeneliti LIKE '%"+ key +"%' OR institusi LIKE '%"+key+"%' OR email LIKE '%"+key+"%' OR telp LIKE '%"+key+"%'";//buat hubungin netbeans dengan database
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nip");
                String b = hasil.getString("namapeneliti");
                String c = hasil.getString("institusi");
                String d = hasil.getString("email");
                String e = hasil.getString("telp");
                String f = hasil.getString("uploadCV");
                
                String [] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
       
            } catch(Exception e) {
        }
    }//GEN-LAST:event_bcariActionPerformed

    private void tabelpenelitiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenelitiMouseClicked
        // TODO add your handling code here:
        int bar = tabelpeneliti.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();

        tnip.setText(a);
        tnama.setText(b);
        tasal.setText(c);
        temail.setText(d);
        ttelp.setText(e);
    }//GEN-LAST:event_tabelpenelitiMouseClicked

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
            java.util.logging.Logger.getLogger(FormPeneliti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeneliti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeneliti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeneliti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeneliti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asal;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bupload;
    private javax.swing.JLabel cv;
    private javax.swing.JLabel email;
    private javax.swing.JLabel input;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nip;
    private javax.swing.JLabel pencarian;
    private javax.swing.JTable tabelpeneliti;
    private javax.swing.JTextField tasal;
    private javax.swing.JLabel telp;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnip;
    private javax.swing.JTextField tpencarian;
    private javax.swing.JTextField ttelp;
    // End of variables declaration//GEN-END:variables
}