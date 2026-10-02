import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // if - else if - else 구조로 간결하게 작성
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) { // 90 미만 중 80 이상
            System.out.println("B");
        } else if (score >= 70) { // 80 미만 중 70 이상
            System.out.println("C");
        } else {                  // 70 미만
            System.out.println("F");
        }
    } // main 메서드 끝
} // Quiz 클래스 끝



