import java.util.ArrayList;

public class xortotals {
    ArrayList<ArrayList<Integer>>subs=new ArrayList<ArrayList<Integer>>();
    int sum=0;
    public int subsetXORSum(int[] nums) {
        sets(nums);
        for(int i=0;i<subs.size();i++)
        {
            sum+=getxor(subs.get(i));
        }
        return sum;
    }
   public int getxor(ArrayList<Integer>x)
    {
        int d=0;
        for (int i = 0; i < x.size(); i++) {
            d=d^x.get(i);
        }
        return d;
    }
    public void sets(int[]set)
    {

        ArrayList<Integer>x=new ArrayList<Integer>();
        generatesets(set,-1,x);
    }
    public void generatesets(int []sup,int idx,ArrayList<Integer>x)
    {
        if(sup.length==0)
        {
            return;
        }
        if(idx==sup.length)
        {
             subs.add(x);
             return;
        }
        x.add(sup[idx+1]);
        generatesets(sup,idx+1,x);
        x.remove(x.size()-1);
        generatesets(sup,idx+1,x);

    }


}
