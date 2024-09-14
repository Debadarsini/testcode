public class LambdaPractice2 {
    interface FuncInter1{
        int operation(int a, int b);
    }
    interface FuncInter2{
        void printMessage(String msg);
    }

    public  static  void main(String [] args){
        FuncInter1 fi1 = (int a, int b)-> a+b;
        FuncInter1 fi3 = (int a, int b)-> a*b;
        FuncInter2 fi2 = msg-> System.out.println("Hello "+msg);
        System.out.println(fi1.operation(10,12));
        System.out.println(fi3.operation(10,12));
        Runnable f20 = () -> {
            System.out.println("10");
        };

        int i =0;
        while ( i <10){
         Thread th = new Thread(f20);
          th.start();
            i++;
        }



    }

}
