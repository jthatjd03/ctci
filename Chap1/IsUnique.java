public class IsUnique {

    public boolean isUnique(String s) {
        Set<Character> set = new HashSet<Character>();
        for (char s : s.toCharArray()) {
            if (set.contains(s)) {
                return false;
            } else {
                s.add(s);
            }
        }
        return true;
    }
}