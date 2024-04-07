
public abstract class Masterpiece extends Artifacts{
     String movement;
    String condition;
    
    Masterpiece(){
        System.out.println("Creating a Masterpiece");
        this.condition="good";
        this.movement="expressionism";
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("movement:"+movement);
        System.out.println("condition:"+condition);
    }
    public void evaluate(String a,String b){
    }
}
