    public class JenisFactory {

        //use getShape method to get object of type shape
        public Jenis getJenis(String shapeType){
            if(shapeType == null){
                return null;
            }
            if(shapeType.equalsIgnoreCase("CIRCLE")){
                return new Lemari();

            } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Meja();

            } else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Kursi();
            }

            return null;
        }
    }