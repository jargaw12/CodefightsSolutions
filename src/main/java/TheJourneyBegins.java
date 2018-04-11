public class TheJourneyBegins {
    int add(int param1, int param2) {
        return param1 + param2;
    }

    int centuryFromYear(int year) {
        if (year == ((year / 100) * 100)) return year / 100;
        else return year / 100 + 1;
    }

    boolean checkPalindrome(String inputString) {
        char w1[] = inputString.toCharArray();
        for (int i = 0; i < w1.length; i++) {
            if (w1[i] != w1[w1.length - i - 1]) return false;
        }
        return true;
    }

}
