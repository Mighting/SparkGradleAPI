package Manager;

public interface Converter<T> {

    public T StringToObject(String string, T object);
    public String ObjectToString(T object);


}
