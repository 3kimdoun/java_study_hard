package chapter11_arrays;
/*
    배열의 필요성 :
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 int 변수를
        10개 선언해서 저장해야 했습니다
        배열은 '같은' 자료형의 데이터를 하나의 변수에 저징해서 처리하는 방식입니다
            -> 추후 다른 자료형을 하나의 변수에 저장하는 방식도 수업할 예정



        sout(arr1) 등을 통해서 출력해보면
        [I@36baf30c
        [I@7a81197d

 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        //이상의 코드는 1부터 10까지를 저장하는 것 밖에 없는데 너무 코드블럭의 낭비가 심함
        //이를 해결하기 위한 배열의 선언방식으로는

        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5 };

        System.out.println(arr1);
        System.out.println(arr2);


    }
}
