package per.hpy.utils;

import com.google.gson.Gson;

public class StringHelper {
    public static String toJsonString(Object obj){
        if(obj != null){
            return new Gson().toJson(obj);
        }else{
            return null;
        }
    }
}
