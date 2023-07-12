import java.util.*;

class Solution
{
    public int getsecondLarge(int size,Set<Integer> set)
    {
        int solution=0;
        if(set.size()==1)
        {
            solution =-1;
        }
        int i=0;
        for(int element:set)
        {
            if(i==set.size()-2)
            {
                solution=element;
            }
            i++;
        }
        return solution;

    }
}

class SecondLarge
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
            set.add(array[i]);
        }
        Solution solution =new Solution();
        System.out.println(solution.getsecondLarge(n,set));
    }
}

