public class BasicTypeEx {
    public static void main(String args[]){
        // 자바의 기본 자료형
        // (1) 정수형 : 정수형에 암묵적인 default type은 int형
        // byte(1바이트의 용량) - short(2바이트의 용량) - int(4바이트) - long(8바이트)
        byte b = 10; // 1바이트의 숫자범위: 0~255 but 양수음수 = -128 ~ +127
        // short or byte result = b + 1; // 이거 안 됨 b가 어떤값인지 모르기에 에러 b는 int값 취급
        int result = b + 1; // 자바에서 정수타입 산술연산을 하면 int타입으로 간주

        // (2) 실수형 : 명시적으로 default 형이 double
        float f = 0.1f;    //float type은 default type이 아니므로 사용시 "f" "F"를 달아줘야함
        double d = 0.1;

        // (3) 문자형 : 문자 하나를 저장하기 위한 기본자료형
        char c = 'A';
        char c2 = 65; //아스키코드표 상에 값으로 저장도 가능
        System.out.println( c );
        System.out.println( c2 );

        // (4) boolean 형 : true / false 만 저장가능
        boolean boo = true;
        boo = false;
    }
}
