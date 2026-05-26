import java.util.Scanner;
class RemoveElement{
     public static int removeElement(int[] nums, int val) {
        int j = 0;
        int length = nums.length;
        int output=0;
        for(int i = 0;i < length;i++){
            if(nums[i]!=val){
                output++;
                nums[j++]=nums[i];
            }

        }
        return output;
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
        System.out.println("Enter the element to be removed : ");
        int val = sc.nextInt();
        System.out.println(removeElement(nums,val));
    }   
}