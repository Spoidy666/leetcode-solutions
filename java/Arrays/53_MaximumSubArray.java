import java.util.Scanner;
import java.util.Arrays;
class MaximumSubArray{
    public int maxSubArray(int[] nums) {
        int sum = 0 ;
        int maxvalue = Integer.MIN_VALUE;
        for(int i : nums){
            sum +=i;
            maxvalue=Math.max(maxvalue,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxvalue;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements : ");
        for (int i= 0 ; i <n ; i++){
            nums[i]=sc.nextInt();
        }
        MaximumSubArray obj = new MaximumSubArray();
        System.out.println("Output value is : "+obj.maxSubArray(nums));
    }
}