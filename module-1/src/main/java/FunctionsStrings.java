import com.google.common.base.Strings;

public class FunctionsStrings {

    public String CommonSuffix(String stringOne , String stringTwo){
        return Strings.commonSuffix(stringOne,stringTwo);
    }

    public String CommonPrefix(String stringOne , String stringTwo){
        return Strings.commonPrefix(stringOne,stringTwo);
    }

    public String PadEnd(String string ,int length, char replacementChar){
        return Strings.padEnd(string,length,replacementChar);
    }

    public String PadStart(String string ,int length, char replacementChar){
        return Strings.padStart(string,length,replacementChar);
    }
}
