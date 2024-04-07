
public abstract class Artifacts {
     int index=1,year;
     String creator;
    Artifacts(){
        System.out.println("Creating Artifact");
        this.creator="Creator"+index;
        this.year=2021;
        this.index++;
    }
    public  void getInfo()  {
        System.out.println("creator:"+creator);
        System.out.println("year:"+year);
    }
    public void getIndex(){
        System.out.println("index:"+this.index);
    }
    public void evaluate(String a,String b){
    }
}
