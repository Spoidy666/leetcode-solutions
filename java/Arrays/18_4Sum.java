import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class fourSum{
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int left,right;
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j = i+1; j<length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                left = j+1;
                right=length-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[left]);
                        a.add(nums[right]);
                        result.add(a);
                        while(left<right){
                            if(nums[left]==nums[left+1]){
                                left++;
                            }
                            else{
                                left++;
                                break;
                            }
                        }
                        while(left<right){
                            if(nums[right]==nums[right-1]){
                                right--;
                            }
                            else{
                                right--;
                                break;
                            }
                        }

                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, target;
        System.out.println("Enter the number of elements in the array : ");
        n= sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0 ; i < n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        target = sc.nextInt();

        System.out.println("The output is : "+fourSum(nums,target));

    }
}