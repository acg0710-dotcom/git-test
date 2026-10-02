import javax.swing.*;
import java.awt.*;

//JFram 상속받는 CalGUI2 클래스

// CalGUI2 클래스가 판때기 (JFrame) 기능을 사용하기위해 상속받음
// is a 관계 -> CalGUI2는 판때기다.
public class CalGUI2 extends JFrame {
    // JFrame f; // 판때기
    JButton b = new JButton("누르면500원"); // 버튼
    JButton clear;
    JTextField jtf; // 한줄 입력창

    public CalGUI2() {
        // 숫자 0부터 9, " + , - , /", "C" , "="
    //    f = new JFrame();
        // 화면 배치 관리자: FlowLayout -> 가장 기본 배치관리자 들어오는 순서대로 화면에배치
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout); // 판때기에 화면 배치 관리자 설정
        jtf = new JTextField(10);
        b = new JButton("상속된 판때기");
        clear = new JButton("C");
        clear.setBackground(Color.RED);
        String[] B3 = {
               "7","8","9","X",
               "4","5","6","-",
               "1","2","3","+",
                   "0",".","="
        };

        this.add(jtf);
        this.add(b);
        this.add(clear);
        //this.add(B3);
        this.setSize(500, 300); // 판때기 크기설정
        this.setLocation(500, 500); // 판때기 위치 설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제종료 활성화
        this.setVisible(true);

    }


}