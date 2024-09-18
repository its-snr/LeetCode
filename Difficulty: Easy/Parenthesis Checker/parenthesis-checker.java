//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        
        int n=x.length();
        Stack<Character> s=new Stack<Character>();
        if(n%2!=0)return false;
        
        for(int i=0;i<n;i++){
            char c=x.charAt(i);
            if(c=='(' || c=='{'||c=='[')s.push(c);
            else {
                if(s.isEmpty())return false;
                else {
                    char open=s.pop();
                    if(c==')' && open=='(')continue;
                    else if(c==']' && open=='[')continue;
                    else if(c=='}'&& open=='{')continue;
                    else return false;
                }
            }
        }
        return s.isEmpty();
    }
}
