package Manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverter implements Converter {


    @Override
    public Object StringToObject(String string, Object object) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        return gson.fromJson(string, object.getClass());
    }

    @Override
    public String ObjectToString(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}