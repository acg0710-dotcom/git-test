// 멤버변수 , 지역변수 구분
// 멤버변수: 클래스 전체에서 사용가능한 변수, 초기화 값을 넣어주지않으면 자동초기화
// 지역변수: 특정 지역(영역)에서만 사용가능한 변수, 대표적으로 메소드안에서만 사용가능한 변수
//         지역변수는 자동초기화 안 됨 내가 직접 초기화 해줘야함
// 변수 선언이 어디에 되어 있냐가 기준
class MyMember{
    //멤버변수
    int y;// <- 멤버변수 y를 선언 //// y라는 변수를 출력하기 위해 메모리에 올림??
    // int y;는 그냥 "앞으로 MyMember 라는 설계도로 객체를 만들면 그 안에 y라는 정수형 변수를 포함시킴"
    static int j = 50;
}


public class MemberVariableEx {

    int k = 30;

    public static void main(String[] args) {
        //변수 선언을 main 메소드 안에서 했으므로 main 메소드안에서만 사용가능한 지역변수됨
        int x = 10; // 지역변수는 자동초기화 XXX
        System.out.println(x);

        //MyMember 클래스의 y 변수를 출력
        //이 순간에 y가 메모리에 올라감
        //new 키워드가 실행되면서 Heap 메모리에 MyMember 객체 공간이 실제로 만들어지고,그 내부에 y 변수 공간이 뚫림
        //y에 따로 값을 넣어준 적이 없지만, 멤버변수이므로 자바가 알아서 기본값 "0"으로 자동초기화
        // 그로인해 error없이 0이 출력
        MyMember m = new MyMember();
        System.out.println( m.y );


        MemberVariableEx mx = new MemberVariableEx();
        System.out.println(mx.k);

        //static 선언된 변수는, 알아서 메모리에 올라가기 때문에
        //우리가 메모리에 올릴 필요는 없지만 사용할때 어떤 클래스에 속하는지
        //클래스명으로 지정이 필요함
        System.out.println(MyMember.j);
    }

}
