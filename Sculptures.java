
public class Sculptures extends Masterpiece {
    int volume;
    String material;
    Sculptures(){
        System.out.println("Creating a Sculpture");
        this.volume=2;
        this.material="iron";
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("volume:"+volume);
        System.out.println("material:"+material);
    }
        public void evaluate(String mov,String con){
        if(this.condition == con && this.movement == mov){
            System.out.println("Sculpture accepted");
        }
        else{
            System.out.println("Sculpture not accepted");
            
        }
    }
     public void evaluate(String mov){
            String con="good";
        if(this.condition == con && this.movement == mov){
            System.out.println("Sculpture accepted");
        }
        else if(this.condition == "excellent" && con == "good" && this.movement == mov ){
            System.out.println("Sculpture accepted");
        }
        else{
            System.out.println("Sculpture not accepted");
            
        }
    }
}
