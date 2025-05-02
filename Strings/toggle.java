public class toggle {
    public static void main(String[] args) {
        String s = "RishAV";
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            str.setCharAt(i, ch);
        }
        System.out.println(str);
    }
}
