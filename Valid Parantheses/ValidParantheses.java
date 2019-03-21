import java.util.Stack;
class ValidParantheses{

    private boolean validParantheses(String string){
        Stack <Character> stack = new Stack <Character>();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if (!stack.isEmpty() && isParantheses(stack.peek(),c)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isParantheses(char left,char right){
         if (left=='(' && right==')'){
             return true;
         } else if (left=='{' && right=='}'){
             return true;
         }
         else if (left=='[' && right==']'){
             return true;
         }
         else{
             return false;
         }
    }

    public static void main(String[] args){ 
        String string = "([()])}";
        ValidParantheses validparantheses = new ValidParantheses();
        boolean isValid = validparantheses.validParantheses(string);
        System.out.println(isValid);
    }
}