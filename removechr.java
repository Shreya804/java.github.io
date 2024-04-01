public class removechr {
    public static void main(String[] args) {
        String str = "Hello123 World!@#";
        String result = removeNonAlphabetic(str);
        System.out.println("Original string: " + str);
        System.out.println("String with only alphabets: " + result);
    }

    public static String removeNonAlphabetic(String str) {
        // Regular expression to match any character that is not a letter
        String regex = "[^a-zA-Z]";
        
        // Replace all non-alphabetic characters with an empty string
        return str.replaceAll(regex, "");
    }
}
