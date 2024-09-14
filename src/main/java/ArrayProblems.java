import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProblems {

    public static void main(String [] args){
        threeLargestNumber();
        secondLargestNumber();
        moveZeroToTheEnd();
        maxMinAdj();
        oddAndEven();
        sortArrayWithNumsAndPos();
        countTrianglesPossible1();
        printDistinct();
        leaderinArray();
        sunArraySum();

    }


    private static void oddAndEven() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int i=0,j=1;
        int n = arr.length;

        while(j<n){
            if(arr[j]%2==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println();
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    private static void maxMinAdj() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7   };
        int n = arr.length;
        int i=0;
        int j=n-1;
        int temp,temp1;
        temp= arr[i];
        temp1 = arr[i+1];
        //  int temp1=Integer.MIN_VALUE;
        while(i<j && j>0){
            //temp1=arr[i+1];
           // temp = arr[i];

            if((i+1)%2==0) {
                arr[i] = arr[j];
                arr[i + 1] = temp;
                temp=temp1;
            }else{
                temp1 = arr[i+1];
            }

            i++;
            j--;
           // temp1 = arr[i];

        }
        System.out.println();
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    private static void moveZeroToTheEnd() {
        int arr[] = { 5, 6, 0, 4, 6, 0, 9, 0, 8   };
        int n = arr.length;
        int i=0;
        int j=n-1;
        int temp=Integer.MIN_VALUE;
        while(i<j){
            if(arr[i]==0&&arr[j]!=0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(arr[i]!=0){
                i++;

            }else if(arr[j]==0){
                j--;
            }
        }
       for(int a : arr){
           System.out.print(a);
       }
    }

    private static void secondLargestNumber() {
        int arr[] = { 12, 35, 1, 10, 34, 1  };
        int n = arr.length;
        int first,second;
        first=second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second) {
                second = arr[i];
            }

        }
        System.out.println( "Second "+ second);
    }
    private static void threeLargestNumber() {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }else if(arr[i]>second){
                third=second;
                second=arr[i];
            }else if(arr[i]>third){
                third=arr[i];
            }

        }
        System.out.println("first "+first+" Second "+ second+" Third "+third);
    }

    private static void sortArrayWithNumsAndPos() {
        int[] arr = { 3, 2, 5, 6, 1, 4 };

        int n = arr.length;
        int temp = Integer.MIN_VALUE;
        int i =0;

        while (i<n){
            int ideal = arr[i]-1;
            if(arr[ideal]!=arr[i]){
                temp = arr[i];
                arr[i]= arr[ideal];
                arr[ideal]=temp;
            }else{
                i++;
            }
        }

        System.out.print("\n");
        for(int a : arr){
            System.out.print(a+" ");
        }

    }

    private static void countTrianglesPossible() {

        int[] arr = { 10, 21, 22, 100, 101, 200, 300 };

        Arrays.sort(arr);

        int count =0;
        int n = arr.length;

        for(int i=n-1;i>=1;i--){
            int l = 0, r = i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=r-l;
                    r--;
                }else{
                    l++;
                }
            }
        }

        System.out.print("No of possible solutions: "
                + count);



    }

    private static void countTrianglesPossible1() {

        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        Arrays.sort(arr);
        int count =0;
        int n = arr.length;

        for (int i = 0; i < n - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                while (k < n && arr[i] + arr[j] > arr[k])
                    ++k;
                if (k > j)
                    count += k - j - 1;

            }

        }

        System.out.print("\n");

        System.out.print("No of possible solutions: "
                + count);
    }

    private static void printDistinct(){
        System.out
                .println("\n");
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        Set<Integer> set = new HashSet<Integer>();
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(!set.contains(arr[i])){
                System.out
                        .print(arr[i]+" ");
                set.add(
                        arr[i]
                );
            }
        }
   }

    private static void leaderinArray(){
        System.out
                .println("\n");
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };

        int n = arr.length;
        int max= arr[n-1];
        System.out.print(max + " ");
        for ( int i =n-2; i>0;i--){
            if(max<arr[i]){
                max = arr[i];
                System.out.print(max + " ");
            }
        }

    }


    private static void sunArraySum(){
        System.out
                .println("\n");
        int arr[] = new int[] { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;

        int start = 0;
        int n = arr.length;

        int currSum = arr[0];

        for(int i=1;i<n;i++){
            if(currSum>sum && start <i-1){
                currSum = currSum - arr[start];
                start++;
            } if(currSum==sum){
                System.out.println("Sub array with sum starting "+start +" ending "+ (i-1));
                break;
            }else{
                currSum+=arr[i];
            }
        }
        //System.out.println("No subarray found");

    }

}
