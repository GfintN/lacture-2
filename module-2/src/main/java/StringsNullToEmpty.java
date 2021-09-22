import com.google.common.base.Strings;

public class StringsNullToEmpty {

    String text;
    public StringsNullToEmpty(String text) {
        this.text=text;
    }
    public String NullToEmpty(){

        return Strings.nullToEmpty(text);
    }
}
