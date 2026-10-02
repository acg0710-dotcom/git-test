
class A{
    public A(){
        System.out.println("A 객체화됨");
    }
}
class B extends A{
    public B(){
        super(); // <- 위에 상위클래스 생성자 호출
    }
}

public class OOPEx2 {
    public static void main(String[] args) {
        new B();
     // A a = new A();
     // B b = new B();
     // A c = new B(); // 권장되는 코드
     // B d = new A(); // 불가능한 코드
    }
}
