import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
       int positiveCounter=0;
       int negativeCounter=0;
       int zeroCounter=0;
       int arrayLength=arr.length;
        for(int i:arr){
            if(i>0)
                positiveCounter++;
            else if(i<0)
                negativeCounter++;
            else
                zeroCounter++;
                
        }
        
        System.out.println(new BigDecimal(positiveCounter).divide(new BigDecimal(arrayLength)));
        System.out.println((float)(negativeCounter/arrayLength));
        System.out.println((float)(zeroCounter/arrayLength));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}


/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long sum=0;
        for(int i:arr)
            sum+=i;
        
        long min,max;
        min=max=sum-arr[0];
        for(int j=1;j<arr.length;j++){
            long temp=sum-arr[j];
           if(temp<min)
               min=temp;
           if(temp>max)
            max=temp;
        }
        System.out.println(min+"  "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}*/
