package session_10_set_stack_queue.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.TreeMap;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập một chuỗi:");
        String s = scanner.nextLine();
        TreeMap<Character, Integer> treeMap= new TreeMap<Character, Integer>();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean check = treeMap.containsKey(c);
            // kiểm tra c có trong hashMap không
            // có là true,không có là false
            if(c==' '){
                continue;
            }else if(check){
                Integer value = treeMap.get(c)+1;
                // lấy dữ liệu trong key
                treeMap.put(c, value);
            }else {
                treeMap.put(c,1);
            }
        }
        System.out.println(treeMap);
    }

}
