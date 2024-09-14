public class LambdaVariableRestriction {
    int n = 10;


    public static void main (String [] args){
        LambdaVariableRestriction var = new LambdaVariableRestriction();
        System.out.println(var.n);
        MyFunction f = ()-> {
            var.n+=2;
            System.out.println(var.n);
        };
        f.myFunctional();
        var.n-=10;
        System.out.println(var.n);
    }
}

interface  MyFunction{
    void myFunctional();
}