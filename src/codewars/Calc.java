import java.util.Stack;

public class Calc {

    public double evaluate(String expr) {
        String[] strs=expr.split(" ");
        Stack<Double> stack=new Stack<>();
        for(String str:strs){

            if(str.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(str.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(str.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }else if(str.equals("/")){
                stack.push(1.0/stack.pop()*stack.pop());
            }else {
                if (!"".equals(str)) {
                    stack.push(Double.parseDouble(str));
                }
            }

        }
        return stack.isEmpty()?0:stack.pop();
    }
}