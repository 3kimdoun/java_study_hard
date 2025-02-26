package chapter19_collections;

import java.util.*;

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

        //List 의 출력 - Arrays 같은 식 말고 객체명으로 출력이 가능

        //특정 element(리스트 내의) 검색 -> .contains()메서드를 이용

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("element명을 입력하세요 >>>");
//        String searchElem = scanner.nextLine();
//
//        boolean contains = strList.contains(searchElem);
//        System.out.println(searchElem + "포함 여부 : "+ contains);

        //element의 스트링 데이터 중 일부만 자른 검색 결과를 확인
        String searchElem2 = "py";
        boolean conmtains2 =strList.contains(searchElem2);
        System.out.println(searchElem2+ " 포함여부 :"  + conmtains2);
        //정확하게는 문자열 자체를 검색해서 확인하는 것이 아니라 해당 리스트 내부의요소를 전체확인
        //하는 것이기 때문에 엘르맨트의 일부인 문자열로는 포함여부 확인이 불가능

        // 특정 element 삭제 -> .remove()
        String removeElem = " C#";
        boolean removed = strList.remove(removeElem);
        System.out.println(removeElem + "삭제여부 : "+ removed);
        System.out.println(strList);

        //마찬가지로 .remove() 역시 element 전체가 일치하는 지를 확인하고 삭제를 수행하기에
        //element 의 일부 데이터만 가지고 삭제를 진행할 수 없음

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removeElem2 + "삭제여부 : "+ removed2);
        System.out.println(strList);

        //List 정렬 -> Collection.sort(strList);
        Collections.sort(strList);
        System.out.println("정렬된 List :"+ strList);
        //정렬된 List :[C#, Java, JavaScript, Kotlin, Python]

        //List 역순 저렬 -> Collections.reverseOrder();
        Collections.sort(strList,Collections.reverseOrder());
        System.out.println("역순 정렬된 리스트 :"+ strList);
        //역순 정렬된 리스트 :[Python, Kotlin, JavaScript, Java, C#]

        //List의 특정 element 출력
        System.out.println(strList.get(0));
        //리스트 각 요소 전체 출력하시오


        System.out.println(strList.get(0));
        System.out.println(strList.get(1));
        System.out.println(strList.get(2));
        System.out.println(strList.get(3));
        System.out.println(strList.get(4));

        for (String strElem : strList) {
            System.out.println(strElem);
        }








    }
}
