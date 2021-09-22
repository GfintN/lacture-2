import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FunctionTest {
    private FunctionsStrings test;

    @Test
    void StringsSuffixTest(){
        test = new FunctionsStrings();
        String stringOne=test.CommonSuffix("Opo","Ppo");
        String stringTwo="po";

        Assertions.assertEquals(stringTwo, stringOne);
    }

    @Test
    void StringsPrefixTest(){
        test = new FunctionsStrings();
        String stringOne=test.CommonPrefix("poO","poP");
        String stringTwo="po";

        Assertions.assertEquals(stringTwo, stringOne);
    }

    @Test
    void StringsPadEndTest(){
        test = new FunctionsStrings();
        String string ="Hello Strings";
        String summaryString = test.PadEnd(string,14,'!'); //length > 13

        Assertions.assertFalse(string.equals(summaryString));
    }

    @Test
    void StringsPadStartTest(){
        test = new FunctionsStrings();
        String string ="Hello Strings";
        String summaryString = test.PadStart(string,14,'!'); //length > 13

        Assertions.assertFalse(string.equals(summaryString));
    }

}
