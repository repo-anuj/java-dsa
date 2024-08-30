public class StringProgram {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        int length = str.length();
        System.out.println("Length of the string: " + length);

        String upperCase = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCase);

        boolean contains = str.contains("World");
        System.out.println("Does the string contain 'World'?: " + contains);

        String[] words = str.split(", ");
        System.out.println("Array of words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
