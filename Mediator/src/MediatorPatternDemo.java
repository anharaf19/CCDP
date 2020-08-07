public class MediatorPatternDemo {
    public static void main(String[] args) {
        Furniture Kursi = new Furniture("Kursi");
        Furniture Meja = new Furniture("Meja");

        Kursi.createNota("Kursi 10000");
        Meja.createNota("Meja 20000");
    }
}