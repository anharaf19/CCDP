import java.util.Date;

public class Nota {
    public static void showNota(Furniture furniture, String harga){
        System.out.println(new Date().toString() + " [" + furniture.getName() + "] : " + harga);
    }
}