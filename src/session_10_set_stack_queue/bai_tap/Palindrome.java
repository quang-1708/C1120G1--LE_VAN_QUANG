package session_10_set_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
       Queue<Character> queue = new Queue<Character>() {
           @Override
           public boolean add(Character character) {
               return false;
           }

           @Override
           public boolean offer(Character character) {
               return false;
           }

           @Override
           public Character remove() {
               return null;
           }

           @Override
           public Character poll() {
               return null;
           }

           @Override
           public Character element() {
               return null;
           }

           @Override
           public Character peek() {
               return null;
           }

           @Override
           public int size() {
               return 0;
           }

           @Override
           public boolean isEmpty() {
               return false;
           }

           @Override
           public boolean contains(Object o) {
               return false;
           }

           @Override
           public Iterator<Character> iterator() {
               return null;
           }

           @Override
           public Object[] toArray() {
               return new Object[0];
           }

           @Override
           public <T> T[] toArray(T[] a) {
               return null;
           }

           @Override
           public boolean remove(Object o) {
               return false;
           }

           @Override
           public boolean containsAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean addAll(Collection<? extends Character> c) {
               return false;
           }

           @Override
           public boolean removeAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean retainAll(Collection<?> c) {
               return false;
           }

           @Override
           public void clear() {

           }
       };

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("nhập chuỗi cần kiểm tra");
        input = scanner.nextLine();
        String newinput = input.toLowerCase();
        System.out.println(newinput);
        for (int i = 0; i < newinput.length(); i++) {
            char c = newinput.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        boolean check = true;
//        for(int i=0; i < newinput.length();i++){
//            if(queue.poll() != stack.pop()){
//                check = false;
//                break;
//            }
//        }
        System.out.println(queue.poll());
        while (queue.poll() != null){
            if(!queue.poll().equals(stack.pop())){
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(input + " is Palindrome");
        } else {
            System.out.println(input + " is not Palindrome");
        }

    }
}
