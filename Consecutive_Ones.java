
package consecutive_ones;
import java.util.*;

public class Consecutive_Ones {
public int count_string(int n){
    int i=2;
    int zeroend=1;
    int oneend=1;
    int sum=oneend+zeroend;
    if(n==1)
        return sum;
    while(i<=n){
        oneend=zeroend %(1000000007);
        zeroend=sum %(1000000007);
        sum=oneend+zeroend %(1000000007);
        i++;
    }
    return sum;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Consecutive_Ones s=new Consecutive_Ones();
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int a[]=new int[n];
       int c= s.count_string(n);
        System.out.println("no of string is "+c);
    }
    
}
