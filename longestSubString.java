// Find the longest sub string in alphabetical order in string java
public static String longestString(String str) {
    String longestString = "";
    char prevChar = '\0';
    StringBuilder currentString = new StringBuilder();

    for (char c : str.toCharArray()) {
        if (prevChar <= c) {
            currentString.append(c);
            if (currentString.length() > longestString.length()) {
                longestString = currentString.toString();
            }
        } else {
            String newValue = "";
            newValue += c;
            currentString = new StringBuilder(newValue);
        }
        prevChar = c;
    }
    return longestString;
}
