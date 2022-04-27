package ${package}.utils;

import java.util.UUID;

public class CommonUtils {
    private CommonUtils(){
        // Disable Constructor
    }

    public static Integer parseInt(String str){
        if(str == null){
            return null;
        }
        return Integer.parseInt(str);
    }

    public static String randomString(){
        return UUID.randomUUID().toString();
    }
}
