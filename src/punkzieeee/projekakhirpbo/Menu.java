package punkzieeee.projekakhirpbo;

/**
 * Superclass dari Makanan dan Minuman
 * @author Fajar Agung Purnama
 */
public abstract class Menu {
    private String nama; //nama makanan/minuman
    private int jumlah; //jumlah pesanan per item
    private int harga; //harga per pesanan

    public Menu(String nama, int jumlah, int harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public String cetak() {
        return getNama() + " " + getJumlah() + " x " + getHarga() + " = " + (getJumlah() * getHarga());
    }   
}