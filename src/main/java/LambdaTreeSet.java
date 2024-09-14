import java.util.TreeSet;

public class LambdaTreeSet {

    public static  void main (String [] args){
        TreeSet<Integer> h = new TreeSet<Integer>((c1,c2)->
           //     (c1>c2)?1:(c1<c2)?-1:0
               // c1.compareTo(c2)
                c2.compareTo(c1)
      //  (c1>c2)?-1:(c1<c2)?1:0
                /*{
            if(c1>c2){
                return -1;
            }else if(c1<c2){
                return 1;
            }else
                return 0;
        }*/);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);

        System.out.println(h);

    }


}
