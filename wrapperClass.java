
public class wrapperClass {
    public static void main(String[] args) {

        // STRING OPERATIONS
        System.out.println("========STRING OPERATIONS========");

        String str1 = "Hello World";
        String str2 = "Java Programming Lab";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("Length: " + str2.length());
        System.out.println("Uppercase: " + str2.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Concatenation: " + str1.concat(str2));
        System.out.println("Substring: " + str2.substring(5));

        // BOXING
        System.out.println("\nBOXING");

        int num1 = 15;
        Integer obj1 = Integer.valueOf(num1);
        System.out.println("Integer: " + obj1);

        char num2 = 'a';
        Character obj2 = Character.valueOf(num2);
        System.out.println("Character: " + obj2);

        float num3 = 11;
        Float obj3 = Float.valueOf(num3);
        System.out.println("Float: " + obj3);

        double num4 = 1.93;
        Double obj4 = Double.valueOf(num4);
        System.out.println("Double: " + obj4);

        // UNBOXING
        System.out.println("\nUNBOXING");

        int unboxValue1 = obj1.intValue();
        System.out.println("Integer to int: " + unboxValue1);

        char unboxValue2 = obj2.charValue();
        System.out.println("Character to char: " + unboxValue2);

        float unboxValue3 = obj3.floatValue();
        System.out.println("Float to float: " + unboxValue3);

        double unboxValue4 = obj4.doubleValue();
        System.out.println("Double to double: " + unboxValue4);

        // AUTOBOXING AND AUTO-UNBOXING
        System.out.println("\nAUTOBOXING AND AUTO-UNBOXING");

        Integer autoBoxed = num1;
        System.out.println("Autoboxing: " + autoBoxed);

        int autoUnboxed = obj1;
        System.out.println("Auto-unboxing: " + autoUnboxed);
    }
}
