package session_6_ke_thua.bai_tap;

import java.util.Arrays;

public class Test3d extends Test2D {
    private float z = 0.0f;

    public Test3d() {

    }

    public Test3d(float z) {
        this.z = z;
    }

    public Test3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float [] arr = new float[3];
        arr[0]=this.getX();
        arr[1]= this.y;
        arr[2] =z;
        return arr;
    }
    public void setXYZ(float z){
        this.z = z;
    }

    @Override
    public String toString() {
        return "Test_3_D{" +
                "z=" + z +
                '}'+ Arrays.toString(this.getXYZ());
    }

    public static void main(String[] args) {
        Test3d test3d = new Test3d(6);
        System.out.println(test3d);
    }
}
