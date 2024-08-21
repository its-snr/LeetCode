//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        int n=arr.length;
        int i=1;
        int j=n-1;
        int sum1=arr[0];
        int sum2=0;
        while(i<=j){
            if(sum1<=sum2){
                sum1+=arr[i++];
            }
            else if(sum2<sum1){
                sum2+=arr[j--];
            }
            
        }
        return sum1==sum2;
        // code here
    }
}