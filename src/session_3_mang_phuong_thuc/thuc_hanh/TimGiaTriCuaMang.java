package session_3_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriCuaMang {
    public static void main(String[] args) {
        String name;
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner students1 = new Scanner(System.in);
        System.out.println("nhap ten muon tim kiem");
        name = students1.nextLine();
        boolean isExist = false;
        for(int i=0;i <students.length;i++){
            if(students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
            if(isExist==false) {
                System.out.println("Not found " + name + " in the list.");
                break;
            }
        }
    }
}
