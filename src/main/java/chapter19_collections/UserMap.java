package chapter19_collections;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        userMap.put("username", "geunsu");
        userMap.put("passwors", "1234");
        userMap.put("email", "maybeags@gmail.com");
        userMap.put("name", "안근수");

        System.out.println(userMap);

        Set<String> keySet =userMap.keySet();
        System.out.println(keySet);

        List<String> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);

        String keyName1 = keyList.get(3);
        String keyName2 = keyList.get(0);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(1);

        List<String> keyList2 = new ArrayList<>();
        keyList2.add(keyName1);
        keyList2.add(keyName1);
        keyList2.add(keyName1);
        keyList2.add(keyName1);

        System.out.println(keyList2);

        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);

        //여기서 놓침


    }
}
