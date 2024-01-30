import java.util.ArrayList;
import java.util.List;

class Solution {

 List<List<Integer>> sol= new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
       boolean []visited=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            visited[i]=false;
        }
        List<Integer>l=new ArrayList<Integer>();
        prem(nums,visited,l);
        System.out.println(sol);
        return sol;
    }
    void prem(int[] nums,boolean[] visited,List<Integer>l)
    {
        if(l.size()== nums.length)
        {
            sol.add(new ArrayList<>(l));

            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i])
            {
                visited[i]=true;
                l.add(nums[i]);
                prem(nums,visited,l);
                visited[i]=false;
                l.remove(l.size()-1);
            }
        }
    }


    public static void main(String[] args) {
           Solution sol=new Solution();
           int []v={1,2,3};
        List<List<Integer>> x  =sol.permute(v);
    }
}