
public class MainClass {
    public static void auction(Artifacts[] artifacts,String mov,String con){
        int i=0;
            System.out.println(artifacts[i].index);
            artifacts[i].getInfo();
            artifacts[i].evaluate(mov,con);
 
    }
    public static void main(String[] args) {
      int N=Integer.parseInt(args[0]);
      Artifacts[] artifacts = new Artifacts[N];
      for(int i=0;i<N;i++){
          if(i % 2 == 0){
              artifacts[i]=new Paintings();
          }
          else{
              artifacts[i]=new Sculptures();
          }
          auction(artifacts,args[1],args[2]);
      }
    }   
}
