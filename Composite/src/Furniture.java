import java.util.ArrayList;
import java.util.List;

public class Furniture {
    private String jenis;
    private String bahan;
    private int harga;
    private List<Furniture> subof;

    // constructor
    public Furniture(String jenis, String bahan, int har) {
        this.jenis = jenis;
        this.bahan = bahan;
        this.harga = har;
        subof = new ArrayList<Furniture>();
    }

    public void add(Furniture e) {
        subof.add(e);
    }

    public void remove(Furniture e) {
        subof.remove(e);
    }

    public List<Furniture> getSubof(){
        return subof;
    }

    public String toString(){
        return ("Furniture :[ Jenis : " + jenis + ", Bahan : " + bahan + ", Harga :" + harga +" ]");
    }
}