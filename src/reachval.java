import java.util.Scanner;

public class reachval {
    static int way;
    static boolean ways(long n2,long sum)
    {
        if(sum==n2)
        {
            return true;
        }
        if(sum>n2)
            return false;
        boolean p1=ways(n2,sum*10);
       boolean p2= ways(n2,sum*20);
       return p1||p2;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
        t=input.nextInt();

        while(t>0)
        {
            long n;
            n=input.nextLong();
            if(reachval.ways(n,1))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }


    }

}
