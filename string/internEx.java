public class internEx {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hel" + "lo";          
        String part = "Hel";
        String s3 = part + "lo";           

        System.out.println(s1 == s2);           
        System.out.println(s1 == s3);           
        System.out.println(s1 == s3.intern());  
    }
}

