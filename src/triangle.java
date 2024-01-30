import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    public static int findmin(int l1, int r1, int l2, int r2, int n) {
        int l = l1, r = r1;
        int m = 0, x = 0;

        while (l <= r) {
            m = (l + r) / 2;
            int y = n - m;

            if (y >= l2 && y <= r2) {
                x = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return x;
    }

    public static int findmax(int l1, int r1, int l2, int r2, int n) {
        int l = l1, r = r1;
        int m = 0, x = 0;

        while (l<=r) {
            System.out.println(l);
            System.out.println(r);
            System.out.println(m);
            System.out.println(x);
            System.out.println("-------------------");
            m = (l + r) / 2;
            int y = n - m;

            if (y >= l2 && y <= r2)
            {
                x = m;
                l = m+1;

            }
            else
            {
              r=m-1;

            }

        }

        return x;
    }



    public static void main(String[] args) {
       int l1,r1,l2,r2,n;
       Scanner input=new Scanner(System.in);
       l1=input.nextInt();
       r1=input.nextInt();
       l2=input.nextInt();
       r2=input.nextInt();
       n=input.nextInt();
       System.out.println(triangle.findmax(l1,r1,l2,r2,n));
    }
}
