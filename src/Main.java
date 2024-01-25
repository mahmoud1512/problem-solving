import java.util.Scanner;

public class Main {
    int num,x;

    boolean converge(int idx,long sum,int []arr)
    {
        if(idx==num-1)
        {
           return sum==x;
        }

      boolean p1=converge(idx+1,sum+arr[idx+1],arr);
      boolean p2= converge(idx+1,sum-arr[idx+1],arr);

      return p1||p2;


    }

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int num,x;
        num=input.nextInt();
        x=input.nextInt();
        Main main=new Main();
        main.num=num;
        main.x=x;
        int [] arr= new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=input.nextInt();

        }


        if(main.converge(0,arr[0],arr))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


    }
}