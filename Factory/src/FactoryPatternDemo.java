public class FactoryPatternDemo {

    public static void main(String[] args) {
        JenisFactory jenisFactory = new JenisFactory();

        //get an object of Circle and call its draw method.
        Jenis jenis1 = jenisFactory.getJenis("CIRCLE");

        //call draw method of Circle
        jenis1.draw();

        //get an object of Rectangle and call its draw method.
        Jenis jenis2 = jenisFactory.getJenis("RECTANGLE");

        //call draw method of Rectangle
        jenis2.draw();

        //get an object of Square and call its draw method.
        Jenis jenis3 = jenisFactory.getJenis("SQUARE");

        //call draw method of square
        jenis3.draw();
    }
}