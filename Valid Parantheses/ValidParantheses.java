import java.util.HashMap;
import java.util.Stack;
class ValidParantheses{

    private boolean validParantheses(String string){
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack <Character> stack = new Stack <Character>();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if (map.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement!=map.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){ 
        String string = "[][]}";
        ValidParantheses validparantheses = new ValidParantheses();
        boolean isValid = validparantheses.validParantheses(string);
        System.out.println(isValid);
    }
}