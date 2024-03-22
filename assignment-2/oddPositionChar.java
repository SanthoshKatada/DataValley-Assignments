public class oddPositionChar {
    public static void main(String[] args) {
        String text = "Web Dev is fun!";
        printOddPositionCharacters(text);
    }
    
    public static void printOddPositionCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
