package chapter01_variable;
/*
    변수 (variable) : 데이터를 담을 수 있는 바구니

 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(3.1415929204);
//
//        // 원의 둘레를 구하는 공식 = 지름 * pi
//        //7번 라인에 있느 원주율을 이용하여 지름이 19인 원의 둘레를 구하시오
//        // sout 콘솔창에 출력 ㄱ
//        System.out.println(19*3.1415929204);
//
//
////      자료형 변수명 = 데이터;    -> 변수 선언 및 초기화 방법
//        double pi = 3.1415929204;       //  초기화
//        //지름이 23인 원의 둘레를 구하시오
//        System.out.println(pi*23);
//
//        int age;     // 변수 선언
//        age = 38;       // 초기화 -> 처음으로 변수에 데이터가 대입되는 것을 의미

    /*
      자바에서의 변수 표기 방식
       카멜 표기버 (Camel case) : 첫 문자는 소문자로 쓰고, 복수의 단어가 연결된 경우에는 두 번ㄴ째 단어의 첫 문자만 대문자로 씀
       ex) 하나짜리 단어인 경우
        String example
       ex) 복수의 단어로 조합된 경우
        String exampleOfKorean
        특히 파이썬 배우는 경우에는 스네이크 케이스를 쓰기 때문에 실수많이함
        example_of_korean

    1. 논리 자료형 (boolean) 변수 : 참/거짓 - > true/ false

    2.


     */
//        boolean checkFlag = false;  // 변수의선언 및 초기화
//        System.out.println(checkFlag);
//        checkFlag = true;           // 이미 선언된 변수는 자료형을 적지않음
//        System.out.println(checkFlag);

//        checkFlag2 = true;   -> 오류발생 : 처음나오는데 자료형을 안적음

        // 변수의 선언 및 초기화
        boolean checkFlag3 = true;
        // 변수의 선언 따로 초기화 따로
        boolean checkFlag4; //변수의 선언
        checkFlag4 = false; //초기화

        //변수명 가독성잇게 ㄱ
//        boolean a = true;
//        boolean b = false;

    /*
        최초로 변수를 선언할 때 자료형 (data type) 을 명시하고 값을 대입하여 초기화 함
        추후 해당 변수에 값을 제대입하는 경우 변수명 = (바뀐)값; 형태로 작성함
     */
        //2. 문자 자료형 변수
//        char name1 ='안';    //문자르 ㄹ입력할 때는 작음따옴표 (')로 감쌈
//        char name2 ='근';   //char 는 캐릭터의 축약어 알파벳/한글/ 숫자 하나를 으미
//        char name3 ='수';     //문자 =/= 문자열
//        System.out.println(name1 + name2 + name3);
//        System.out.println(""+ name1 + name2 + name3);
        /*
            이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자들이 하나하나 전부다
            지정을 해줘야함
            문자와 문자열은 서로 다른데 문자 (하나짜리)를 세 번 더했을 경우 더이상 문자가 아니라
            문자열로 되어야함 65번 라인같이 작성햇을 경우
            자료형 불일치로 생각한 결과값이 나오지 않앗음
            그래서 문자들을 합쳐 문자열로 만들기 위해 꼼수를 쓴게 66번 라인 방식임
            JAVA에서는 out의 경우 괄호 맨 앞부분의 자료형을 따라가는 경우가 잇음
             즉, 큰 따옴표로 시작했을 경우() 내에 있는 부분을 전부 문자열로 보기때문에
             "안근수" 전체가 안정적으로 출력됨

        지시사항
        name4-6 한글 내이름
        실행예
        아이유

         */
//
//        char name4 ='김';
//        char name5 ='도';
//        char name6 ='언';
//
//        System.out.println(""+ name4 + name5 + name6);

        //3. 정수 자료형 변수
        int width1 =100;
        int width2 =200;
        System.out.println(width1 + width2);// 숫자 끼리는 연산이 가능함 챕터0에서 배움

    /*
        int : Integer의 축약어로 , 정수를 의미함.
        실수에 해당하는 자료형 double

        4. 실수 자료형 변수
   */
        double pi = 3.1415929204;
//        int pi2 = 3.1415929204;   -> 자료형 불일치
//        int longNum = 12345678912;  -> 너무 큰 숫자는 오류남 롱 쓰셈
//        long longNum =  12345678912L;

//      5. 문자열 자료형
   /*
        string : 문자들이 일정한 순서를 지니고 나열된 것을 의미함 (대문자로 시작한다는점)
   */
        String name = "kim";
        int age =22;
        System.out.println("제이름은" + name + "입니다. 제 나이는 " + (age+1) + "살입니다.");
        System.out.println("제이름은" + name + "입니다. 제 나이는 " +  age + 1 + "살입니다.");

    /*
    원래 java 17 이전 까지는 string에 한 줄 씩만 작성이 가능했음
    근데 자바 17 부터 다중 스트링을 지원하게 됨.
     */
//        String introduction = """
//                제 이름은 김도언 이고요 하이하ㅣㅇ하ㅣㅇ ㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇ
//                ㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇㅎㅇ
//
//                """
        /*
            int / long

            int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)


        6. 상수 -> 변수와 반대되는 개념
            특징
                1) 한 번의 선ㄴ언 및 초기화가 가능 -> 변수와는 달리 ' 재 대입이 불가능'
                2) 이미 초기화가 끝난 상수를 한참 밑에서 불러올 경우 걔가 상수인지 변수인지
                    가시적으로 확인이 불가능하기 떄문에 개발자들끼리의 약속으로 상수는 전부
                    다 대문자로 작성하고, 단어와 단어 사이의 공백을 "_" 로 연결함
                3) 상수를 선언 할 때는 " final" 키워드가 붙음

         */
        //자료형 변수명 = 데이터 ;
        //final 자료형 변수명 = 데이터 ;

        final int FINAL_NUM = 123;
//        FINAL_NUM = 321;
        System.out.println(FINAL_NUM);
//        final String FILE_PATH =
        // 상수의 경우 파일 경로와 같이 쉽게 바뀌어서는 안되는 부분에 부분적으로 사용

        /*

         */























    }
}















