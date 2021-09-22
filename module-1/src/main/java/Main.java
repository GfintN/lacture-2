public class Main {
    public static void main(String... ar){
        StringBuilder summaryString = new StringBuilder();
        FunctionsStrings strings = new FunctionsStrings();
        String stringOne = "OneNon";
        String stringTwo = "OneMon";
        String stingLine = "Hello Strings";
        char replacementChar = '/';
        int length = 20;
        summaryString.append("Получаем суффикс строк ").append(stringOne).append(" и ").append(stringTwo).append(": ")
                .append(strings.CommonSuffix(stringOne, stringTwo))

                .append("\n Получаем префикс строк ").append(stringOne).append(" и ").append(stringTwo).append(": ")
                .append(strings.CommonPrefix(stringOne, stringTwo))

                .append("\n До символа под номером ").append(length).append(", символы вне строки будут заменены на \"")
                .append(replacementChar).append("\" в строке: ").append(stingLine).append(", Итог: ")
                .append(strings.PadEnd(stingLine, length, replacementChar))

                .append("\n До символа под номером ").append(length).append(", символы вне строки будут заменены на \"")
                .append(replacementChar).append("\" в строке ").append(stingLine).append(", Итог: ")
                .append(strings.PadStart(stingLine,length,replacementChar));

        System.out.println(summaryString);
    }
}
