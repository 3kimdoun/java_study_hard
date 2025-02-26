package chapter19_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {

        Map<String,String> strMap = new HashMap<>();
        //Map에 Key -value 쌍 삽입 -> .put(키, 값)
        strMap.put("kor20250001","권민주");
        strMap.put("kor20250002","김도언");
        strMap.put("kor20250003","김태윤");
        strMap.put("kor20250004","안민섭");
        strMap.put("kor20250005","이현규");
        strMap.put("kor20250006","제다정");
        strMap.put("kor20250007","최민준");
        //MAp 출력
        System.out.println(strMap);

        //특정 키의 값 조회-> .get(키) -> 값이 출력
        System.out.println(strMap.get("kor20250003"));

        //특정 키의 값 수정#1 -> .put()을 통해 덮어 쓰기
        strMap.put("kor20250003","김삼");   //->키 하나당 하나의 벨류만 가지기 때문
        System.out.println(strMap);

        //특정 키의 값 수정 # 2 -> .replace()
        strMap.replace("kor20250002","김이");
        System.out.println(strMap);

        // 특정 키의 존재 여부
        boolean searchKeyFlag1 = strMap.containsKey("kor20250001");
        boolean searchKeyFlag2 = strMap.containsKey("kor20250010");
        System.out.println("해당 키 존재여부 :" + searchKeyFlag1);
        System.out.println("해당 키 존재여부 :" + searchKeyFlag2);

        //특정 값의 존재 여부
        boolean searchValueFlag1 = strMap.containsValue("김일");
        boolean searchValueFlag2 = strMap.containsValue("김이");
        System.out.println("해당 값 존재 여부 : " + searchValueFlag1);
        System.out.println("해당 값 존재 여부 : " + searchValueFlag2);

        //Map의 엔트리 (Key-Value 쌍을 통칭하여 ) 로부터 List를 생성
        Set<Map.Entry<String, String>> entrySet = strMap.entrySet();
        System.out.println(entrySet);

        //Map의 엔트리 (Key-Value 쌍을 통칭하여 ) 로부터 List를 생성
        List<Map.Entry<String, String>> entryList = new ArrayList<>();
        entryList.addAll(entrySet);
        System.out.println(entryList);

        //Ket Set 출력 -> strMap 제네릭의 첫 번째 매개변수인 key에 해당하는 자료형을 넣어야함
        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        //Value Set 출력 -> strMap 제네릭의 두 번째 매개변수인 Value에 해당하는 자료형을 넣어야함
        Collection<String> values = strMap.values();  //키는 중복이 불가능하므로 set을 쓰는데
        //value는 중복되어 있을 수 있으므로 set을 쓰게되면 중복제가가 될 확률이 잇어 Collection을 사용함 (NOT. Collections)

        System.out.println(values);

    }
}
