package punkzieeee.projekakhirpbo;

/**
 * Subclass dari Menu untuk minuman
 * @author Fajar Agung Purnama
 */
public class Minuman extends Menu {

    public Minuman(String nama, int jumlah, int harga) {
        super(nama, jumlah, harga);
    }

    @Override
    public String cetak() {
        return super.getNama() + " " + super.getJumlah() + " x " + super.getHarga() + " = " + (super.getJumlah() * super.getHarga());
    }  
}