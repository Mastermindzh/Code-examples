import java.util.Scanner;
import java.util.Stack;

public class postfix {


    public static void main(String[] args){
        System.out.println(postfix("2 3 + 4 + 7 -"));
        System.out.println(postfix("1 2 3 * + 4 +"));

    }

    public static int postfix(String sum) {
        Stack<Integer> myStack = new Stack<Integer> ();
        Scanner myScanner = new Scanner(sum);

        while (myScanner.hasNext()) {
            if (myScanner.hasNextInt()) {
                myStack.push(myScanner.nextInt());
            } else {
                int num1 = myStack.pop();
                int num2 = myStack.pop();
                String operator = myScanner.next();

                switch (operator) {
                    case "+":
                        myStack.push(num1 + num2);
                        break;
                    case "-":
                        myStack.push(num1 - num2);
                        break;
                    case "*":
                        myStack.push(num1 * num2);
                        break;
                    default:
                        myStack.push(num1 / num2);
                        break;
                }
            }
        }
        return myStack.pop();
    }

}

