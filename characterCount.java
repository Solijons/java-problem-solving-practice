// Count character occurrence in String with java 
public static HashMap<Character, Integer> characterCount(String str) {
    HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
    char[] strArray = str.toCharArray();
    for (char c: strArray) {
        if (characterIntegerHashMap.containsKey(c)) {
            characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
        } else {
            characterIntegerHashMap.put(c, 1);
        }
    }
    return characterIntegerHashMap;
}
