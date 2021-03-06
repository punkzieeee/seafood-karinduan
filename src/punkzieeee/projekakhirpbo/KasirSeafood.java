package punkzieeee.projekakhirpbo;

import java.awt.HeadlessException;
import java.io.IOException;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * GUI untuk menampilkan tagihan sementara
 * @author Aisyah Riski Fauzia
 */
public class KasirSeafood extends javax.swing.JFrame {
    SeafoodMenu seafood = new SeafoodMenu();
    LinkedList<String[]> tampungMenu = new LinkedList<>();
    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH:mm");
    private Menu menu;
    private String pesanan;
    int makan = 0;
    int minum = 0;
    
    /**
     * Creates new form KasirSeafood
     */
    public KasirSeafood(LinkedList<String[]> tampungMenu){
        //memindahkan isi LinkedList tampungMenu dari kelas SeafoodMenu ke KasirSeafood
        while(!seafood.tampungMenu.isEmpty()){
             this.tampungMenu.add(seafood.tampungMenu.pop());
        }
        initComponents();
        
        Iterator it = tampungMenu.iterator();
        String str = "";
        int i = 0; //total harga pesanan
        while(it.hasNext()){
            String[] s = (String[]) it.next(); //karena masih berbentuk objek, isi dari tampungMenu di casting ke String[]
            if(s.length == 4){ //khusus makanan
                Makanan mkn = new Makanan(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                menu = new Makanan(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                pesanan = s[0].endsWith("Saus Padang") || s[0].endsWith("Cabe Hijau") || s[0].endsWith("Rica-Rica") ? mkn.cetak(Integer.parseInt(s[3])) : menu.cetak();
            }else if(s.length == 3){ //khusus minuman
                menu = new Minuman(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                pesanan = menu.cetak();
            }
            //akan mencetak jumlah pesanan makanan dan minuman
            if(menu instanceof Minuman) minum += Integer.parseInt(s[1]); else makan += Integer.parseInt(s[1]);
            str += pesanan + "\n";
            i += (Integer.parseInt(s[1]) * Integer.parseInt(s[2]));
        }
        menubill.setText(str); //menampung pesanan sementara
        total.setText("" + i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        table = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        total = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        kasir = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        menubill = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir | Seafood Laut Karinduan");
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(410, 660));
        setPreferredSize(new java.awt.Dimension(410, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("        SENTRA NIAGA 6 BLOK SN 6 NO.6   B-5, 8-6");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 46, 367, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("KELAPA GADING");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 69, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("021 - 2897680");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 90, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 380, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Tanggal :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 66, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Seafood Laut Karinduan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 360, -1));

        tanggal.setEditable(false);
        tanggal.setText(LocalDate.now().format(date).toString());
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 121, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Table     :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 66, -1));
        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 147, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Jam :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 121, -1, -1));

        jam.setEditable(false);
        jam.setText(LocalTime.now().format(hour).toString());
        getContentPane().add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 121, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("Kasir :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 147, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 380, 10));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 380, -1));

        total.setEditable(false);
        total.setText("0");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 396, 170, -1));

        bayar.setText("0");
        bayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bayarFocusLost(evt);
            }
        });
        getContentPane().add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 422, 170, -1));

        kembalian.setEditable(false);
        kembalian.setText("0");
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 460, 170, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 380, 17));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("KEMBALI");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("TOTAL ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("BAYAR");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        cetak.setBackground(new java.awt.Color(255, 153, 255));
        cetak.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cetak.setText("CETAK");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 570, 100, 40));

        kembali.setBackground(new java.awt.Color(255, 153, 255));
        kembali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kembali.setText("RESET");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 570, 90, 40));

        kasir.setBackground(new java.awt.Color(255, 153, 255));
        kasir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "punkzieeee", "candraaddi", "aisyahrskyy" }));
        getContentPane().add(kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 110, -1));

        menubill.setColumns(20);
        menubill.setRows(5);
        jScrollPane1.setViewportView(menubill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, 200));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punkzieeee/projekakhirpbo/background2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-750, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //mengulang semua pesanan dari 0
    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        SeafoodMenu menu = new SeafoodMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    //mencetak kembalian
    private void bayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bayarFocusLost
        if((Integer.parseInt(bayar.getText()) - Integer.parseInt(total.getText())) >= 0)
            kembalian.setText("" + (Integer.parseInt(bayar.getText()) - Integer.parseInt(total.getText())));
        else if(Integer.parseInt(bayar.getText()) < 1 || bayar.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Eh... bayar dulu sini. Gak ada yang gratis di sini!", "Warning!", JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Duitnya kurang, Boss!", "Warning!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bayarFocusLost

    //mencetak struk pesanan
    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        if(Integer.parseInt(bayar.getText()) < 1 || bayar.getText().equals("")){ //belum bayar
            JOptionPane.showMessageDialog(null, "Eh... bayar dulu sini. Gak ada yang gratis di sini!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }else if(Integer.parseInt(bayar.getText()) < Integer.parseInt(total.getText())){ //uang kurang
            JOptionPane.showMessageDialog(null, "Duitnya kurang, Boss!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                JOptionPane.showMessageDialog(null, "Struk berhasil dicetak\nTerima kasih telah mampir di Restoran Seafood Laut Karinduan");
                CetakTagihan.cetak(menubill, tanggal, jam, table, kasir, total, bayar, kembalian, makan, minum); //mencetak tagihan dalam bentuk .txt
                SeafoodMenu menu = new SeafoodMenu(); //kembali ke pilihan menu untuk pemesanan baru
                menu.setVisible(true);
                menu.pack();
                menu.setLocationRelativeTo(null);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(KasirSeafood.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cetakActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(KasirSeafood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirSeafood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirSeafood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirSeafood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirSeafood(tampungMenu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField bayar;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    protected javax.swing.JTextField jam;
    protected javax.swing.JComboBox<String> kasir;
    private javax.swing.JButton kembali;
    protected javax.swing.JTextField kembalian;
    private javax.swing.JTextArea menubill;
    protected javax.swing.JTextField table;
    protected javax.swing.JTextField tanggal;
    protected javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}