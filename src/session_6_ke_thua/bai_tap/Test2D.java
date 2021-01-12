package session_6_ke_thua.bai_tap;

import java.util.Arrays;

public class Test2D {
    private float x = 3.0f;
    protected float y = 4.0f;

    public Test2D() {

    }

    public Test2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float [] getXY() {
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Test2D{" +
                "x=" + x +
                ", y=" + y +
                '}'+ Arrays.toString(this.getXY());
    }

    public static void main(String[] args) {
        Test2D test2D = new Test2D();
        System.out.println("Array: "+ test2D);
    }
}
