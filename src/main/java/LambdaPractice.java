import java.util.ArrayList;

public class LambdaPractice {
    interface FunctionalInterface{
        void abstractFunc(int x);
    }

    public static  void main(String [] args){
        FunctionalInterface fi = (int x) -> System.out.println(2*x);
        fi.abstractFunc(5);

        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(1);arrl.add(2);arrl.add(3);arrl.add(4);

        arrl.forEach(n-> System.out.println(n));

       arrl.forEach(n->{
          if(n%2==0){
              System.out.println(n);
          }
       });
    }

}
