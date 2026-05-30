import java.util.*;
class longest_substring{
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int longest=0, l=0;
        for(int r = 0 ; r < s.length() ; r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            longest= Math.max(longest,r-l+1);
            set.add(s.charAt(r));
        }
        return longest;   
    }
    public static void main(String []args){
        String s = new String();
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check : ");
        s= sc.nextLine();
        longest_substring obj = new longest_substring();
        System.out.println("The length of longest substring without repetition is : "+  obj.lengthOfLongestSubstring(s));
        

    }
    
}