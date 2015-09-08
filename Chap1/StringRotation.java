public class StringRotation {
    public boolean isStringRotation(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isSubstring(s1 + s1, s2);
        }
        return false;
    }