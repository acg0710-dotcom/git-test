public class Casting {
    public static void main(String[] args) {
//        형변환
        double d = 85.4;
        int score = (int)d; // 실수(float)인 85.4를 정수형(int)으로 변환
        System.out.println("score=" + score);
        System.out.println("d=" + d); // 형변환 후에도 피연산자에는 변화 X

    }
}
