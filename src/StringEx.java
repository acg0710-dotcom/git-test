
// String class => 자바에서 문자열 저장/관리를 위해 제공하는 클래스
// String class의 특징 2가지
//(1) 압묵적인 객체생성을 지원
//String str = new String("ABC"); // 원칙적으로 이렇게 만들어야함
//String str = "ABC"; // 5번처럼 계속하면 불편하니 이렇게 지원함
//(2) 불변적인 특징
// String class는 한번 문자열 자원을 할당하면 변경이 불가능
//

public class StringEx {
    public static void main(String[] args) {

        // String class 원칙적 사용
        String str1 = new String("ABC"); // 메모리에 값이 아닌 주소값이 들어감
        String str2 = new String("ABC"); // => 18-21 => 다르다
        // 문자열 값 비교
        //if(str1 == str2){ //잘못된 코드 값 비교가 되지 않음
        if(str1.equals(str2)){ // 문자열 값 비교를 위한 equals() 메소드 사용
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
        //(1) String class는 암묵적인 객체 생성 지원
            String str3 = "ABC"; // => new String("ABC");
            String str4 = "ABC"; // 18-21 => 같다

        if(str3 == str4){ // 이거 쓰면 안 됨
            System.out.println("str3 과 str4는 값이 같다");
        }else{
            System.out.println("str3 과 str4는 값이 다르다");
        }


        //(2) 불변적인 특징
        String str5 = "ABC"; // 메모리에 "ABC" 만들고 그 위치 str5에 저장
        str5 = str5 + "D"; // 메모리에 "ABCD" 만들고 그 위치 str5에 저장
        str5 = str5 + "e"; // 메모리에 "ABCDE" 만들고 그 위치 str5에 저장
        // 결론적으로 메모리에는 "ABC", "ABCD","ABCDE" 세개가 존재하게 됨

    }
}