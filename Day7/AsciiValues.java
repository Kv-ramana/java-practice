public class AsciiPrinter {
    public static void main(String[] args) {
        printAsciiCharactersAndValues();
    }

    public static void printAsciiCharactersAndValues() {
        int asciiValue = 0;

        while (asciiValue <= 127) {
            char character = (char) asciiValue;
            System.out.println("ASCII Value: " + asciiValue + " Character: " + character);
            asciiValue++;
        }
    }
}
