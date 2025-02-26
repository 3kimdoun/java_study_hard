package chapter19_collections;

import java.util.*;

/*
    List는 순서가 잇고 중복을 허용하는 반면
    Set의 경우 순서는 없고 중복을 허용하지 않기 때문에
    List -> Set 의 경우 순서는 ㅇ벗고 중복을 허용하지 않기 때문에
    List -> Set혹은 Set -> List의 형 변환이 중요
    List 를 통해 전체 설문을 받고 set을 통해 중복을 제거하여 후보군을 남기는 방식으로 많이사용됨
    또한 셑으로 중복을 제거한 후 .get(인덱스넘버) 로 조회하는 방법 역시 가능
 */
public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        strList.add("Java");
        strList.add("Java");
        strList.add("Java");
        strList.add("Python");
        strList.add("C#");
        strList.add("1");
        strList.add("2");
        strList.add("2");
        strList.add("3");
        strList.add("3");
        strList.add("3");

        //Set 출력방법-> 세트명으로 하면됨
        System.out.println(strSet);//순서를 보장하지 않음

        //특정 요소를 추출하는 것이 어렵다 -> List로의 형 변환이 필요
        strList.addAll(strSet);
        System.out.println(strList);
        // strList에 값이 더해졌기 때문에 정렬을 하는 것이 가능해짐

        Collections.sort(strList); //원본리스트가 밥뀜
        System.out.println(strList);
        strSet.addAll(strList);
        System.out.println(strSet);


    }
}
