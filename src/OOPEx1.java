// 객체지향형 프로그래밍 출발점
// 유지보수가 편리한 프로그래밍 출발점
//


class Person {
    private String name;
    public int age;

    // 멤버변수 초기화를 생성자
    // 생성자 3개를 정의
    // (1) 아무런 값을 받지 않는 생성자
    public Person(){
        this("김길동" , 20);
    }
    // (2) 나이,이름 순으로 값을 받는 생성자
    public Person(int a, String n){
        this(n , a); //파라미터 이름,나이를 받는 생성자 호출
    }
    // (3) 이름,나이 순으로 값을 받는 생성자
    public Person(String n, int a){
        this.name = n+"님";
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void SetName(String n ){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class OOPEx1 {

    // 다음 코드는 객체지향적 프로그램인가?
    // => 다음 코드는유지보수 관리가 편한 프로그램인가?
    // i say F no

    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.name = "김길동"; // 이건 oop가 아님 -> 유지보수가 불편함
        p1.SetName("김길동"); // 유지보수가 편함 "님"을 붙여야하면 11번에 + "님" 하면 끝
        p1.age = 20;
        System.out.println(p1.getName());
        System.out.println(p1.age);

        Person p2 = new Person();
        //p2.name = "박길동";
        p2.SetName("박길동");
        p2.age = 25;

        Person p3 = new Person();
        //p3.name = "홍길동";
        p3.SetName("홍길동");
        p3.age = 30;
    }
}