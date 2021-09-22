public class Main {
    public static void main(String... ar){
    String text = null;
    StringsIsNullOrEmpty strings = new StringsIsNullOrEmpty(text);
    System.out.print("Строка 'text' является пустой: "+strings.isNullOrEmpty());
    }
}
