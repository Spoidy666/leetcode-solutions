import java.util.Scanner;
import java.util.HashMap;
class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
roman.put('X',10);
roman.put('L',50);
roman.put('C',100);
roman.put('D',500);
roman.put('M',1000);
    int n = s.length();
    int output = 0;
    for(int i = 0 ; i < n ; i ++ ){
        if (i < n-1 && roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
            output-=roman.get(s.charAt(i));
        }
        else{
            output+=roman.get(s.charAt(i));
        }

    }
    return output;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman String : ");
        String s = sc.nextLine();
        System.out.println("The integer value is : "+ romanToInt(s));
    }
}