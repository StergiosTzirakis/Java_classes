
public class Paintings extends Masterpiece{
    int length,width,surface;
    String technique;
    Paintings(){
        System.out.println("Creating a Painting");
        this.length=2;
        this.width=2;
        this.surface=4;
        this.technique="oil";
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("surface:"+surface);
        System.out.println("length:"+length);
        System.out.println("width:"+width);
        System.out.println("technique:"+technique);
    }
    public void evaluate(String mov,String con){
        if(this.condition == con && this.movement == mov){
            System.out.println("painting accepted");
        }
        else if(this.condition == "excellent" && con == "good" && this.movement == mov ){
            System.out.println("painting accepted");
        }
        else{
            System.out.println("painting not accepted");
            
        }
    }
     public void evaluate(String mov){
            String con="good";
        if(this.condition == con && this.movement == mov){
            System.out.println("painting accepted");
        }
        else if(this.condition == "excellent" && con == "good" && this.movement == mov ){
            System.out.println("painting accepted");
        }
        else{
            System.out.println("painting not accepted");
            
        }
    }
    
}
