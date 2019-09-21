public class StringComparision {
    public static void main(String[] args) {
        String s1 = "Gokul";
        String s2 = "Gokul";
        String s3 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        String str1= "Java";
        String str2 = "java";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = new String("Java");
        System.out.println(str1 == str2);//true (because both refer to same instance)
        System.out.println(str1 == str3);//false(because s3 refers to instance created in nonpool)

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        //String concatenation
        System.out.println(s1.concat(s3));

        //Substring
        System.out.println(s1.substring(0,4));

        //replace
        String ss1="Java is a very good language";
        System.out.println(ss1.replace('a','$'));

        //replaceAll
        String ss2 = " My name is GokulaKrishnan";
        System.out.println(ss2.replaceAll("is","was"));

    }
}
