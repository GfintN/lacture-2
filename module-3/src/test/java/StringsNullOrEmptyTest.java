import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsNullOrEmptyTest {

    @Test
    void isNullOrEmptyTest(){
        StringsIsNullOrEmpty strings = new StringsIsNullOrEmpty(null);
        Assertions.assertTrue(strings.isNullOrEmpty());
    }
}
