public class MyTest {
    public static void main(String args[]){
        // 값만 넘어감
        int x = 10;
        int y = x;
        x = 100;
        System.out.println("x == " + x);
        System.out.println("y == " + y);
        // 셤 문제에 나옴 2,30 나오면 좆됨
        int[] xx = {10,20,30};
        int[] yy = xx;
       // xx[0] = 1000;
        System.out.println("xx[0] == " + xx[0]);
        System.out.println("yy[0] == " + yy[0]);
    }
}
