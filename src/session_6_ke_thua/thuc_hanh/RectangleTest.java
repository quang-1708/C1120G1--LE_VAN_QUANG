package session_6_ke_thua.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("dien tich hinh chu nhat: "+ rectangle.getArea());

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println("dien tich hinh chu nhat moi: "+ rectangle.getArea());
    }
}
