
// 자바 문법상 생략가능 문법은 여러개 존재
// 그 중에서 개발자 입장에서 꼭 기억해야할 3가지 생략요소

// 자바 3대 생략요소
// (1) extends Object
// (2) default constructor
// (3) super();


class Test10 extends Object{ // (1) extends Object 생략가능
    public Test10(){ // default constructor
        super(); // super();
    }
}

public class 자바3대생략요소 {

}
