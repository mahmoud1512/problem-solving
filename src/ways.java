import java.util.Scanner;

public class ways {

   static int way;
    static void ways(int n2,int sum)
    {
       if(sum==n2)
       {
           way++;
       }
       if(sum>n2)
           return;
       ways(n2,sum+1);
       ways(n2,sum+2);
       ways(n2,sum+3);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        n1=input.nextInt();
        n2=input.nextInt();
       ways.ways(n2,n1);
        System.out.println(ways.way);
    }

}
