

//자바에서 상속 (extends)
//자바에서 상속의 대상은 기본적으로 class
//특정 클래스 상속을 위해서 자바에서는 "extends" 문법을 사용

class MyA{
    int x = 10;
    public MyA(){
    }
    public MyA(int x) {
        this.x = x;
    }
    public void printX(){
        System.out.println("X = " + x);
    }
}

// }
class MyB extends MyA{
    //int x = 10;
    //public MyB(int x){
        // 상위 클래스 생성자에 있는 코드 복사해서 붙여넣기
    // 2. new MyB() 호출을 위한 기본 생성자 추가
    public MyB() {
     //   super(); // 부모의 기본 생성자 MyA() 호출 (생략 가능)
    }

    // 3. int x를 받는 생성자 (부모 생성자에 전달)
    public MyB(int x) {
      //  super(x); // 부모 클래스의 MyA(int x) 생성자 호출
    }

    }



public class ExtendEx {
    public static void main(String[] args) {
        // MyA 클래스를 객체화
        MyA a = new MyA(5); // 메모리에 올라간 클래스 = 객체
        System.out.println(a.x);
        a.printX();

        MyB b = new MyB();
        System.out.println(b.x);
        b.x = 20;
        b.printX();
    }
}

