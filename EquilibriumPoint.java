//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}


class Solution {

    public static int equilibriumPoint(long arr[], int n) {

        if(arr.length == 1){
            return 1;
        }
        
        if(arr.length == 2){
            return -1;
        }
        
        int start = 0,  not=-1,flag=0;
        int end = n-1;
        long sum1=arr[0], sum2=arr[n-1];
       while(start<end){
            if(sum1 == sum2 ){
            start++;
            end--;
            sum1 += arr[start];
            sum2 += arr[end];
            }
            else if(sum2>sum1){
            start++;
             //flag+=1;
            sum1 += arr[start];
            }
            else if(sum1>sum2){
            end--;
             //flag+=1;
            sum2 += arr[end];
            }
           
    }
    if(sum1 == sum2 ){
           return start+1;
  }
    return not;
}
}
