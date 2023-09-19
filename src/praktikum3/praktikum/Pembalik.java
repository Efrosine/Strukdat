package praktikum3.praktikum;

public class Pembalik {
    private String input;
    private int length;
    private Stack theStack;

    public Pembalik(String s) {
        input = s;
        length = input.length();
        theStack = new Stack(length);
    }

    public void setWord() {
        char sArray[] = input.toCharArray();
        for (char c : sArray) {
            theStack.push(c);
        }
    }

    public String getWord() {
        StringBuffer result = new StringBuffer();
        while (!theStack.isEmpty()) {
            char value = theStack.pop();
            result.append(value);
        }
        return result.toString();
    }
}
