package session_7_abstract_interface.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import session_6_ke_thua.thuc_hanh.Shape;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        double persent = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Persent: ");
        persent = scanner.nextDouble();
        Circle circle = new Circle(4);
        System.out.println("dien tich hinh tron cu là: " +circle.getArea());
        circle.resize(persent);
        System.out.println("dien tich hinh tron moi la: " + circle.getArea());

        Ractangle ractangle = new Ractangle(5,10);
        System.out.println("dien tich hinh chu nhat cu: " + ractangle.getArea());
        ractangle.resize(persent);
        System.out.println("chieu cao moi: " + ractangle.getLength());
        System.out.println("chieu rong moi: " + ractangle.getWidth());
        System.out.println("dien tich hinh chu nhat moi: "+ ractangle.getArea());
    }


}
