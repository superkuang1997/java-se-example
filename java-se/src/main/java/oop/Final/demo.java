package oop.Final;

public class demo {
    public static void main(String[] args) {
        String s1 = "core JAVA";
        String s2 = "core JAVA";
        String s3 = new String("core JAVA");
        String s4 = "   hello  ";
        System.out.println(s1.length());
        System.out.println(s1.indexOf("JAVA"));
        System.out.println(s1.substring(0,4));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.replace("JAVA", "Python"));
        String[] arr = s1.split(" ");
        System.out.println(arr.getClass());
        for (String s:arr) {
            System.out.println(s);
        }
        System.out.println(s4.trim());

        System.out.println(s1.startsWith("J"));

        StringBuilder sb = new StringBuilder();
    }
}
