import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
class Solution
{
    char firstRep(String S)
    {
        // your code here
       char[] strArray = S.toCharArray();
       Map<Character, Integer> m = new LinkedHashMap<>();
        
        for (char c: strArray)
        {
            if(m.containsKey(c)){
                m.put(c, m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
        }
        
        char temp = ' ';
        
        for (Map.Entry entry : m.entrySet()) {
            if(!entry.getValue().equals(1)){
                temp = (Character)entry.getKey();
                break;
            }
            else
            temp = '#';
        }
        
        return temp;
 
    }
}