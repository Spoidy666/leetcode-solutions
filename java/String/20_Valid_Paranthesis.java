import java.util.Scanner;
import java.util.Stack;
class ValidParanthesis{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length= s.length();
        for(int i = 0 ; i < length ; i++){
            if(s.charAt(i) == '{' ){
                stack.push('}');
            }
            else if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i)== '['){
                stack.push(']');
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char left = s.charAt(i);
                char right = stack.pop();
                if (left != right){
                    return false;
                }
            }
        }
       return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paranthesis String : ");
        String s = sc.nextLine();
        System.out.println("The given paranthesis is : "+isValid(s));
    }
}