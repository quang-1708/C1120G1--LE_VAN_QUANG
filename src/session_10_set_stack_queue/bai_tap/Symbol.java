package session_10_set_stack_queue.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biểu thức");
        String s = scanner.nextLine();
        Stack<Character> bStack = new Stack<Character>();
        boolean check = true;
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c==')' && bStack.empty()){
                check = false;
                break;
            }else if(c=='('){
                bStack.pop();
            }else if(c==')'){
                bStack.push(c);
            }
        }
        if(bStack.empty() && check){
            System.out.println("Well");
        }else {
            System.out.println("Wrong");
        }
    }
}
