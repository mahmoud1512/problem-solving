import java.util.Scanner;

public class fibonaci {

    int x1=0,x2=1;

   static int fib(int n)
    {
        if(n==1)
        {
          return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num=input.nextInt();
        System.out.println(fibonaci.fib(num));
    }
}
