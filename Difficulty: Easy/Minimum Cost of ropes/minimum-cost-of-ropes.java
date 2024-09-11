//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long[] a = new long[input.length];

            for (int i = 0; i < input.length; i++) {
                a[i] = Long.parseLong(input[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minCost(a));
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        PriorityQueue<Long>q=new PriorityQueue<Long>();
        for(long n:arr){
            q.add(n);
        }
        long ans=0;
        while(q.size()>1){
            long a=q.poll();
            long b=q.isEmpty()?0:q.poll();
            long sum=a+b;
            ans+=sum;
            q.add(sum);
        }
        return ans;
        // code here
    }
}