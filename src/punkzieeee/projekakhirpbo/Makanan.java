package punkzieeee.projekakhirpbo;

/**
 * Subclass dari Menu untuk makanan
 * menerapkan interface LevelPedas
 * @author Fajar Agung Purnama
 */
public class Makanan extends Menu implements LevelPedas{
    private int level;

    public Makanan(String nama, int jumlah, int harga, int level) {
        super(nama, jumlah, harga);
        this.level = level;
    }
    
    @Override
    public void setLevelPedas(int level) {
        this.level = level;
    }

    @Override
    public int getLevelPedas() {
        return level;
    }

    @Override
    public String cetak(){
        return super.getNama() + " " + super.getJumlah() + " x " + super.getHarga() + " = " + (super.getJumlah() * super.getHarga());
    } 
    
    //untuk makanan pedas
    public String cetak(int level){
        return super.getNama() + " level " + this.level + " " + super.getJumlah() + " x " + super.getHarga() + " = " + (super.getJumlah() * super.getHarga());
    } 
}