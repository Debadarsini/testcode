import java.util.ArrayList;
import java.util.Collections;

public class LambdaCollection{

    public static  void main(String [] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);

        Collections.sort(al, (c1, c2)-> (c1>c2)?-1 :(c1<c2)?1:0);


        System.out.println(al);
    }
}
