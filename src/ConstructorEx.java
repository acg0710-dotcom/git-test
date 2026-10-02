//생성자 : 클래스가 객체화 될때 단 한번 호출되는 놈
// 생성자 문법
// 매소드와 유사하나 리턴형이 없고 이름이 클래스명과 같아야함
// 생성자는 왜 쓰는가?
// => 생성자를 사용하는 가장 큰 목적은 멤버변수 초기화
// 생성자의 역할: new를 통해 객체가 만들어질 때 멤버변수들을 원하는 값으로 초기화(세팅)해주는 특수 메소드
// 생성자 오버로딩: 똑같은 이름(MyCon)의 생성자라도 매개변수의 개수,타입,순서가 다르면 여러개 만들 수 있음

class MyCon{
    // [멤버변수] 객체가 생성될 때 Heap 메모리에 올라감 (기본값: null,0)
    String name;
    int age;
    //[생성자 1] 매개변수가 없는 기본 형태
    public MyCon(){
        age = 20;
        name = "홍기동";
    }
    // [생성자2] (int,string)순서로 받는 형태
    public MyCon(int a,String n){
        age = a;
        name = n;
        System.out.println("생성자 호출");
    }
    //[생성자3] (String, int) 순서로 받는 형태
    public MyCon(String n ,int a){
        age = a;
        name = n;
    }
}

// main 메소드 실행 영역
public class ConstructorEx {
    public static void main(String arg[]) {
        // 1번 객체 생성
        // 전달받은 값의 타입이 (int,String) 순서
        // 그렇기에 자바는 3개의 생성자중 [생성자 2]를 자동으로 찾아가 실행함
        MyCon m1 = new MyCon(10,"김길동");
        System.out.println(m1.name);

        // 2번 객체 생성
        // 전달받은 값의 타입이 (String,Int) 순서
        // 자바는 [생성자 3]을 자동으로 찾아가 실행
        MyCon m2 = new MyCon("박길동",30);
        System.out.println(m2.name);
    }
}