import java.util.Scanner;

public class frame {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        String q=input.nextLine();
        if(n>q.length())
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
            for (int i = 0; i < n-1; i++) {
                System.out.println(q.charAt(i));
            }

        }

    }
}
