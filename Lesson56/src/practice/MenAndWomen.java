package practice;

import java.util.HashMap;
import java.util.Map;

// посчитать кол-во мужчин и женщин в нашей группе
public class MenAndWomen {
    public static void main(String[] args) {
        System.out.println("Group list with gender ");

        Map<String, String> groupMapGender = new HashMap<>();
        groupMapGender.put("Leonid", "male");
        groupMapGender.put("Sergey", "male");
        groupMapGender.put("Galina", "female");
        groupMapGender.put("Liubov", "female");
        groupMapGender.put("Anatolii", "male");
        groupMapGender.put("Evgeniya", "female");
        groupMapGender.put("Viktor", "male");
        groupMapGender.put("Alex", "Male");
        groupMapGender.put("Kirill", "Male");
        groupMapGender.put("Olesia", "Female");
        groupMapGender.put("Elena", "Female");
        groupMapGender.put("Andreas", "Male");
        groupMapGender.put("Sergei", "Male");
        groupMapGender.put("Victor", "Male");
        groupMapGender.put("Tatyana", "female");
        groupMapGender.put("Vladislava", "female");
        groupMapGender.put("Iryna", "female");
        groupMapGender.put("Sasha", "male");

        System.out.println(groupMapGender.entrySet());

        int women = 0;
        for (String name : groupMapGender.keySet()
        ) {
            if (groupMapGender.get(name).equalsIgnoreCase("female")) {
                women++;
            }

        }
        int men = 0;
        for (String namet : groupMapGender.values()
        ) {
            if (groupMapGender.containsValue("male")) {
                men++;
            }
        } System.out.println("Men: " + men);
        System.out.println("Women: " + women);
    }
}
