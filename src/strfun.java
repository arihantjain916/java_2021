public class strfun {
    public static void main(String[] args) {
        // To give multiple argument in Java then we have to use "+".
        // To add inverted comma in inverted commas the we have to use "\".
        String a = "Arihant Jain"; 
        String b = "is a good boy"; 
        // To concatinate two string "+" is used.
        System.out.println(a + " " + b);
        System.out.println("The length of string is " + a.length());
        System.out.println("The upper case version of string is " + a.toUpperCase());
        System.out.println("The lower case version of string is " + a.toLowerCase());
        System.out.println(a.contains("Ari"));
        // It give true if string contains the given argument of false if not
        System.out.println(a.charAt(2));
        // It give the character present at given index
        System.out.println(a.endsWith("in"));
        // it give true if the given string is end with given suffix
        System.out.println(a.indexOf("Ari"));
    }
}
