public class OneAway {
    public boolean isOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return isOneEditAway(s1, s2);
        } else if (s1.length() > s2.length()) {
            return isOneInsertAway(s1, s2);
        } else {
            return isOneInsertAway(s2, s1);
        }
    }

    private isOneEditAway(String s1, String s2) {
        boolean diffFound = false;
        for (int i = 0; i < s1.length) {
            if (s1[i] != s2[i]) {
                if (diffFound) {
                    return false;
                } else {
                    diffFound = true;
                }
            }
        }
        return diffFound;
    }

    private boolean isOneInsertAway(String s1, String s2) {
        boolean diffFound = false;
        int index1 = 0;
        int index2 = 0;
        //s1 is longer string
        while (index1 < s1.length) {
            char c1 = s1[i];
            char c2 = s2[i];
            if (c1 == c2) {
                index1++;
                index2++;
            } else {
                if (diffFound) {
                    return false;
                }
                diffFound = true;
                s2++;
            }
        }

        return false;
    }
}