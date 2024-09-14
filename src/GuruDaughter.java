import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuruDaughter {



    static void printAllKLength(char[] set, int k, BufferedWriter bw) throws IOException {
        int n = set.length;
        printAllKLengthRec(set, "", n, k,bw);
    }

    // The main recursive method
// to print all possible
// strings of length k
    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k,BufferedWriter bw)  {

        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
          //  if(prefix.startsWith("b")) {
                try {
                    bw.write(prefix);
                    bw.newLine();
                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
               // System.out.println(prefix);

           // }
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            if (!prefix.contains(""+set[i])){
                // Next character of input added
                String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1,bw);
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println("First Test");
        //char[] set1 = {'j', 'a','n','b','i','b','d','g','r','u'};
        char[] set1 = {'j', 'a','n','b','d','r','i'};
        System.out.println(set1.length);
        int k = 7;
        String data = " Tutorials Point is a best website in the world";


        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("/Users/administrator/Documents/daughteseve.txt",true));

            printAllKLength(set1, k,bw);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
      //  printAllKLength(set2, k);
    }
}


