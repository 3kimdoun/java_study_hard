package chapter19_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    컬렉션은 여러 객체를 모아놓은 것ㅇ을 의미함.
    종류:
        1. List : 순서가 있는 데이터의 집합으로 중복된 요소를 허용홤.
            -ArrayList :배열 기반의 리스트, 요소 접근 속도가 빠름
            -LinkedList :연결 리스트의 리스트, 삽입/ 삭제 속도가 빠름

        2. Set : 중복을 허용하지 않는 데이터들의 집합
            -HashSet :해시테이블 기반의 집합 , 요소의 순서를 보장하지 않음
            -TreeSet :  이진(binary)검색트리 기반의 집합, 요소가 정렬된 상태로 유지됨
        3. Map: Key(키)와 Value(값) 의 쌍으로 이루어지 ㄴ데이터의 집합
            -HashMap : 해시 테이블 기반의 맵, 키의 순서를 보장하지 않음
            -TreeMap :이진 검색 트리 기반의 맵, 키가 정렬된 상태로 유지됨
 */
public class StrList {
    //ArrayList 생성 및 초기화
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        int[] intArray = new int[3];

        //비교
        intArray[0] = 1;
        //리스트의 데이터 삽입
        strList.add("Java");
        strList.add("Python");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList);

    }
}
