import java.util.Scanner;
import java.util.Arrays;
class threeSumClosest{
    public int threeSumClosest(int[] nums, int target) {
        int left,right,sum,closestSum=nums[0]+nums[1]+nums[2];
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            left = i+1;
            right = length-1;
            while(left<right){
                sum = nums[i]+nums[left]+nums[right];
                int test = Math.abs(target-sum);
                if(test<Math.abs(target-closestSum)){
                    closestSum= sum;
                }
       
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int target,n;
        System.out.println("Enter the number of elements in the array : ");
        n= sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0 ; i < n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        target = sc.nextInt();
        threeSumClosest obj = new threeSumClosest(); 
        System.out.println("The closest sum value is : "+ obj.threeSumClosest(nums,target));
    }
}