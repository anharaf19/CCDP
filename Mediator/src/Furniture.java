public class Furniture {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Furniture(String name){
        this.name  = name;
    }

    public void createNota(String message){
        Nota.showNota(this,message);
    }
}