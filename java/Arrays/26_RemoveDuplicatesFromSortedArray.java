import java.util.Scanner;
class RemoveDuplicatesFromSortedArray{
    public static int removeDuplicates(int[] nums) {
        int unique=1;
        int j=1;
        int length = nums.length;
        for(int i = 1 ; i <length ; i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            nums[j++]=nums[i];
            unique+=1;
        }
        return unique;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n]; 
        System.out.println("Enter the elements : ");
        for(int i =0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
    }   
}