import java.util.*;

class threeSum{
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int lengthh = nums.length;
        int left,right,sum;
        for ( int i = 0 ; i < lengthh-2 ; i ++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            left = i+1;
            right=lengthh-1;
            while(left<right){
                sum = nums[i] + nums[right] + nums[left];
                if (sum==0){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[right]);
                    a.add(nums[left]);
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
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array : ");
        n = sc.nextInt();
        int[] nums= new int[n];
        for(int i = 0 ;i < n ; i ++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The output is : "+threeSum(nums));
    }
}