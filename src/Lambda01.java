/**
 * Created by y3user on 28/10/15.
 */

interface volume {
    double setVolume(double vol);
}

interface operator {
    int operate(int a, int b);
}


public class Lambda01 {

    public static void main(String[] args) {
        Lambda01 object = new Lambda01();
        volume vol = object::getVolume;
        object.generateVolume(2.0d, vol);
        //object method assignment
        operator op = object::add;
        //lambda
        operator opminus = (a, b) -> a - b;
        System.out.println(object.operate(2, 3, op));
        System.out.println(object.operate(2, 3, opminus));
    }

    private int operate(int a, int b, operator op) {
        return op.operate(a, b);
    }

    private void generateVolume(double a, volume vol) {
        System.out.println(vol.setVolume(a));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private double getVolume(double d) {
        return 2.0d;
    }

}
