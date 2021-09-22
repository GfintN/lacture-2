public class Main {
    public static void main(String... ar){
        String text = null;
        StringsNullToEmpty strings = new StringsNullToEmpty(text);
        System.out.println("Строка без функции NullToEmpty: "+text);
        System.out.println("Строка c функцией NullToEmpty:"+ strings.NullToEmpty());
    }
}
