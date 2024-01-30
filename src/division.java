import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class division {

   static long min;
   static int n;
   static ArrayList<Long> arrayList=new ArrayList<Long>();
    public static void generate(long s1,long s2,int depth)
    {


          if(depth==n-1)     //base case
          {
              if(min>Math.abs(s1-s2))
              {
                  min=Math.abs(s1-s2);
              }
              return;
          }

          generate(s1+arrayList.get(depth+1),s2,depth+1);
          generate(s1,s2+arrayList.get(depth+1),depth+1);



    }






    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int n;
        n=  input.nextInt();
        division.n=n;
        division.min= (long) (20*1e9);
        for (int i = 0; i < n; i++) {
            long x;
            x=input.nextLong();
            division.arrayList.add(x);
        }
        generate(0,0,-1);
        System.out.println(division.min);
    }
}
