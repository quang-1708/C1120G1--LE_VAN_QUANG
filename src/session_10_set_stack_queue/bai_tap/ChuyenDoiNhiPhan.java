package session_10_set_stack_queue.bai_tap;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int num = scanner.nextInt();
        int num1;
        do {
            num1 = num % 2;
            stack.push(num1);
            num = num / 2;
        } while ((num/2) != 0);
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
            //duyệt stack để đưa mảng stack về số
        }
    }
}
