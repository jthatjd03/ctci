public class CheckPermutation {

    public boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length; i++) {
            char c = s1[i];
            if (map.containsKey() {
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for (int i = 0; i < s2.length; i++) {
            char c = s2[i];
            if (map.containsKey() {
                map.put(c, map.get(c) - 1);
            }else{
                return false;
            }
        }

        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                return false
            }
        }
        return true;
    }
}