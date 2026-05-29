import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Permutation{
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }
        int[] remaining = Arrays.copyOfRange(nums,1,nums.length);
        List<List<Integer>> perms = permute(remaining);
        List<List<Integer>> result =new ArrayList<>();
        for(List<Integer> i : perms){
            for(int j = 0 ; j <= i.size() ;j++){
                List<Integer> copy = new ArrayList<>(i);
                copy.add(j,nums[0]);
                result.add(copy);
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] nums = new int[n];
        for(int i = 0 ; i < n;i ++){
            nums[i]=sc.nextInt();
        }
        Permutation obj = new Permutation();
        List<List<Integer>> result = obj.permute(nums); 
        System.out.println(result);
        sc.close();
        }
}