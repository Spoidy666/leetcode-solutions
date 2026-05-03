import java.util.*;
class twoSum{
     public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> lookup = new HashMap<>();
        int value;
        for (int i = 0 ; i < nums.length; i++){
            lookup.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length;i++)
            {
                value = target - nums[i];
                if (lookup.containsKey(value) && i != lookup.get(value)){
                    return new int[]{i,lookup.get(value)};
                }
            }
            return new int[]{};
     }
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Arrary : ");
        int n , target;
        n = sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the elements in order ");

        for (int i = 0 ; i < n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        target= sc.nextInt();
        int[] result=twoSum(nums,target);
        System.out.println("Result : "+ Arrays.toString(result));
     }


}