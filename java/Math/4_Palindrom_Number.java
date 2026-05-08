import java.util.Scanner;
class PalindromNumber{
  public static boolean isPalindrome(int x){
    int y = x;
    int rem=0, sum =0;
    while(y>0){
      rem = y%10;
      sum = sum*10 + rem;
      y=y/10;
    }
    return sum==x;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to be tested : ");
    int x = sc.nextInt();
    System.out.println(isPalindrome(x));

  }
}