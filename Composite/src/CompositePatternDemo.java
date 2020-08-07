public class CompositePatternDemo {
    public static void main(String[] args) {

        Furniture Bahan = new Furniture("Kursi","Kayu", 30000);

        Furniture bahanJati = new Furniture("Kursi Taman","Kayu Jati", 20000);

        Furniture bahanAlbasiah = new Furniture("Kursi Taman","Kayu Albasiah", 20000);

        Furniture kayujati1 = new Furniture("Kursi Taman Jenis 1","Kayu Jati", 10000);
        Furniture kayujati2 = new Furniture("Kursi Taman Jenis 2","Kayu Jati", 10000);

        Furniture KayuAlbasiah1 = new Furniture("Kursi Taman Jenis 1","Kayu Albasiah", 10000);
        Furniture KayuAlbasiah2 = new Furniture("Kursi Taman Jenis 2","Kayu Albasiah", 10000);

        Bahan.add(bahanJati);
        Bahan.add(bahanAlbasiah);

        bahanJati.add(kayujati1);
        bahanJati.add(kayujati2);

        bahanAlbasiah.add(KayuAlbasiah1);
        bahanAlbasiah.add(KayuAlbasiah2);

        //print all employees of the organization
        System.out.println(Bahan);

        for (Furniture headFurniture : Bahan.getSubof()) {
            System.out.println(headFurniture);

            for (Furniture furniture : headFurniture.getSubof()) {
                System.out.println(furniture);
            }
        }
    }
}