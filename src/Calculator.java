public class Calculator {
    // 메소드 오버로딩
    // 자바가 메소드를 구분하는 3가지 파라미터 조건
    // 매소드 이름이 같을 때 자바는 다음 3가지 중 최소 하나라도 달라야 서로다른
    // 매소드로 인정함
    // 1. 파라미터의 개수가 다를 때 2. 파라미터의 자료형(타입)이 다를때
    // 3. 파라미터의 순서가 다를 때

    //1.기본형: 정수 2개 더하기
    public int add(int a, int b){
        return a + b;
        // c.add(10,20) int 2개 호출
    }
    // 2. [개수 다름] 정수 3개 더하기 (파라미터가 3개로 늘어남)
    public int add(int a, int b, int c){
        return a + b + c;
        // c.add(10,20,30) int 3개 호출
    }
    // 3. [타입 다름] 실수 2개 더하기 (int 대신 double 받음)
    public double add(double a, double b){
        return a + b;
        // c.add(1.5, 2.5) double 2개 호출
    }
    // 4. [순서 다름] String과 int 순서로 받기
    public void add(String label, int a){
        System.out.println(label + ": " + a);
        // c.add("합계",100) String과 int 호출
    }
    // 5. [순서 다름] int와 String 순서로 받기
    public void add(int a, String label){
        System.out.println(a + "는 " + label);
    }
}
