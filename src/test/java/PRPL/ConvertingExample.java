package PRPL;

public class ConvertingExample {

    public static void main(String[] args) {

        String a = "12";
        String b = "11";
        Integer s = Integer.parseInt(a);
        Integer x = Integer.valueOf(b);
        Integer y = Integer.valueOf(b);
        System.out.println(s);
        System.out.println(x);

        int m = 10;

        String v = String.valueOf(m);
        String h = Integer.toString(m);

        reverseString();
    }

    static void reverseString() {

        String s1 = "Welcome to Edureka";
        StringBuilder y = new StringBuilder();
        char[] ch = s1.toCharArray();
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println("");
        for (int i = s1.length() - 1; i >= 0; i--) {
            y.append(s1.charAt(i));


        }
        System.out.print(y);


    }
}
