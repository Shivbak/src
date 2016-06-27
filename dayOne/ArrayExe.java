package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class ArrayExe {

    public static void main(String[] args)
    {
        int[] test = {1,2,6};
        int[][] test1 = {{1,2,30},{2,3}};
        int[] test3 ={2,3};
        firtLast6(test);
        System.out.println(sameFirstLast(test));
        System.out.println(commonEnd(test1));
        System.out.println(maxEnd3(test));
        System.out.println(has23(test3));
        System.out.println(countEvens(test3));
    }

    static boolean firtLast6(int[] nums)
    {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }

    static boolean sameFirstLast(int[] nums)
    {
        return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }

    static boolean commonEnd(int[][] nums)
    {
        return (nums[0][0] == nums[1][0]) || (nums[0][nums[0].length - 1] == nums[1][nums[1].length - 1]);
    }

    public static int[] maxEnd3(int[] nums)
    {
        int max;
        if(nums[0] > nums[nums.length - 1])

           max = nums[0];

        else
            max = nums[nums.length - 1];

        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;


    }

    static  boolean has23(int[] nums)
    {
        if (nums.length >=2)
       return (nums[0]== 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);

        return false;
    }

    public static int countEvens(int[] nums)
    {
        int output = 0;
        for(int i = 0 ; i<= nums.length ; i++)
        {
            if((nums[i]%2) == 0)
            {
                output ++;
            }
        }

        return output;
    }
}
