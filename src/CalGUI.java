import javax.swing.*;
import java.awt.*;

// 계산기 화면 구현을 위한 클래스
// 판때기를 사용할때 CalGUI가 내부에 멤버변수로 판때기(JFrame)를 가지고 있는
// has a 관계
public class CalGUI {
    JFrame f = new JFrame(); // 판때기
    JButton b = new JButton("누르면500원"); // 버튼
    JTextField jtf; // 한줄 입력창

    public CalGUI() {
        f = new JFrame();
        // 화면 배치 관리자: FlowLayout -> 가장 기본 배치관리자 들어오는 순서대로 화면에배치
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout); // 판때기에 화면 배치 관리자 설정
        jtf = new JTextField(10);
        b = new JButton("누르면 5000원");
        f.add(jtf);
        // 위에 2개가 멤버변수 초기화
        f.add(b);
        f.setSize(500, 300); // 판때기 크기설정
        f.setLocation(500, 500); // 판때기 위치 설정
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제종료 활성화
        f.setVisible(true);
    }


}