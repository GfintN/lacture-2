import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsNullToEmptyTest {

   @Test
    void NullToEmptyTest(){
       StringsNullToEmpty strings = new StringsNullToEmpty(null);
      Assertions.assertFalse(strings.NullToEmpty()==null);
   }
}
