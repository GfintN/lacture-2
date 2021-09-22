import com.google.common.base.Strings;

public class StringsIsNullOrEmpty {

    String text;

    public StringsIsNullOrEmpty(String text) {
        this.text = text;
    }

    public boolean isNullOrEmpty(){
        return Strings.isNullOrEmpty(text);
    }
}
