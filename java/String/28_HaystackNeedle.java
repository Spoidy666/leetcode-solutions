import java.util.Scanner;
class HayStackNeedle{
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++) {

            int j = 0;

            while(j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if(j == m) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Haystack String : ");
        String haystack = sc.nextLine();
        System.out.println("Enter the needle String : ");
        String needle = sc.nextLine();
        System.out.println("The output is : "+strStr(haystack,needle));
    }
}