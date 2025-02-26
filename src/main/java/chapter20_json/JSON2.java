package chapter20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;

}

public class JSON2 {
    public static void main(String[] args) {


        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");

        System.out.println(gson.toJson(user1));

        System.out.println(gsonBuilder.toJson(user1));
        userJson =gsonBuilder.toJson(user1);

        boolean result1 =(gsonBuilder.toJson(user1)instanceof String);
        boolean result2 =(userJson instanceof String);
        System.out.println("결과값 : " + result1);
        System.out.println("결과값 : " + result2);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("학번","20250001");
        jsonObject.addProperty("학과","영교");
        jsonObject.addProperty("성적","A");

        System.out.println(jsonObject);
        System.out.println(gson.toJson(jsonObject));
        System.out.println(gsonBuilder.toJson(jsonObject));





    }
}
