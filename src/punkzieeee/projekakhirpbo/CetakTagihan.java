package punkzieeee.projekakhirpbo;

import java.io.*;
import java.time.*;
import java.time.format.*;
import javax.swing.*;
import java.util.*;

/**
 * Class untuk mencetak bukti pembayaran
 * outputnya berbentuk file .txt
 * @author Fajar Agung Purnama
 */
public class CetakTagihan {           
    public static void cetak(JTextArea menubill, JTextField tanggal, JTextField jam, JTextField table, JComboBox kasir, JTextField total, JTextField bayar, JTextField kembalian, int makan, int minum) 
            throws IOException {
        try{
            int count = 1; //ditambahkan ke nama file jika file sebelumnya sudah ada
            String meja = table.getText().equals("") ? "takeaway" : "meja" + table.getText(); //jika textfield table kosong, maka akan mengembalikan takeaway
            DateTimeFormatter date = DateTimeFormatter.ofPattern("ddMMyyyy");
            DateTimeFormatter hour = DateTimeFormatter.ofPattern("HHmm");
            //lokasi file saat projek ini dibuat
            String namaFile = "cetakstruk/" + LocalDate.now().format(date).toString() 
                    + meja + "_" + LocalTime.now().format(hour).toString();
            File cetak = new File(namaFile + ".txt");
            
            if(!cetak.exists()){
                cetak.createNewFile();
            }else{
                while(cetak.exists()){
                    namaFile = namaFile + "(" + count + ")";
                    cetak = new File(namaFile + ".txt");
                    count++;
                }
                cetak.createNewFile();
            }
            
            PrintWriter print = new PrintWriter(cetak);
            
            print.println("\n\n        Seafood Laut Karinduan          ");
            print.println(" SENTRA NIAGA 6 BLOK SN 6 NO.6 B-5, 8-6 ");
            print.println("            KELAPA GADING               ");
            print.println("            021 - 2897680               ");
            print.println("========================================");
            print.println("Tanggal : " + tanggal.getText());
            print.println("Jam     : " + jam.getText());
            print.println("Kasir   : " + kasir.getSelectedItem());
            print.println(table.getText().equals("") ? "Take away" : "Meja    : " + table.getText());
            print.println("========================================");
            print.println(menubill.getText());
            print.println("Pesanan makanan: " + makan + " Pesanan minuman: " + minum);
            print.println("----------------------------------------");
            print.println("Total   : Rp." + total.getText()); //sudah termasuk pajak 10%
            print.println("Bayar   : Rp." + bayar.getText());
            print.println("----------------------------------------");
            print.println("Kembali : Rp." + kembalian.getText());
            print.println("\n\n            TERIMA KASIH                ");
            print.println("     KAMI AKAN SELALU MERINDUKANMU      ");
            print.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Folder tidak ditemukan");
        }
    }
}