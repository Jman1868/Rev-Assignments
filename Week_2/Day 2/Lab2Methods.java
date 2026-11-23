public class Lab2Methods {
    
    public static void main(String[] args) {
       
       // printProfile("jamal", 23, 5.9, true, 'A');
       // System.out.println(average(1, 2, 2));

        //System.out.println(fitsInByte(-129));
       // System.out.println(addTexts("12", "30"));
    
        // int r = boxtwice(21);
        // System.out.println(r);

        //describe(10);

        // Integer a = 127;
        // Integer b = 127;

        // System.out.println("127: equals=" + sameValue(a, b)
        //         + " == " + (a == b));

        // Integer c = 1000;
        // Integer d = 1000;
        // System.out.println("1000: equals=" + sameValue(c, d)
        //         + " == " + (c == d));


        //System.out.println(truncate(-9.99));



        //System.out.println(widen(7));

        //overflowDemo();

        //System.out.println(shiftLetter('a', 2));


        // describeValue(5);
        // describeValue(2.5);
        // describeValue("hi");
        // describeValue('A');
        // describeValue(5L);


        // int x = 1;
        // tryChange(x);
        // System.out.println("x = " + x);


        // StringBuilder sb = new StringBuilder("Hi");
        // appendBang(sb);
        // System.out.println(sb);


        // StringBuilder sb = new StringBuilder("Hi");
        // replaceBuilder(sb);
        // System.out.println(sb);


        // String s = "java";
        // shout(s);
        // System.out.println(s);


        // StringBuilder a = new StringBuilder("Cat");
        // StringBuilder b = a;
        // b.append("s");
        // System.out.println(a);


        //compareRefs();

        // System.out.println(safeLength(null));
        // System.out.println(safeLength("hello"));

        //System.out.println(initials("john", "doe"));

        // System.out.println(isPalindromeWord("Level"));
        // System.out.println(isPalindromeWord("Java"));

        //System.out.println(maskEmail("asha@mail.com"));

        // System.out.println("String +=     : " + timeJoin(false) + " ns");
        // System.out.println("StringBuilder : " + timeJoin(true) + " ns");


        //System.out.println(safeAppend(new StringBuffer("Hi"), " there"));

        System.out.println(formatReceipt("Asha", 3, 9.99));
        System.out.println();

        System.out.println(formatReceipt("Ravi", 2, 4.5));
    }

    public static void printProfile(String name, int age, double height, boolean student, char grade) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + student);
        System.out.println("Grade: " + grade);
    }

    public static double average(int a, int b, int c){
        return( (a + b + c) / 3.0);
    }

    public static boolean fitsInByte(int value){

        if(value>=-128 && value<=127){
            return true;
        }
        return false;
    }

    public static int addTexts(String a, String b){

        return (Integer.parseInt(a)+Integer.parseInt(b));

    }

    public static Integer boxtwice(int x){
        return (Integer.valueOf(x * 2));
    }
    
    public static void describe(Integer n){

        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Max: " +Integer.MAX_VALUE);
        System.out.println("Compare with 10.5:  "+ Double.compare(n, 10.5));

    }

    // Integer caches -128 to 127, so == compares the same object
    // for 127 but two different objects for 1000.
    // Use equals() for wrapper values.
    public static boolean sameValue(Integer a, Integer b){
        return (a.equals(b));
    }

    public static int truncate(double d){
        return ( (int) (d) );
    }
    
    public static double widen(int i){
        return(i);
    }

    //?
    public static void overflowDemo(){
        int big = 130;
        byte b = (byte) big;
        System.out.println(b);
    }


    public static char shiftLetter(char c, int by) {
        return ( (char) (c+by));
    }


    public static void describeValue(int a){
        System.out.println("int: " + a);
    }

    public static void describeValue(double a){
        System.out.println("double: " + a);
    }

    public static void describeValue(String a){
        System.out.println("String: " + a);
    }


    public static void tryChange(int n){
        n = 99;
    }


    public static void appendBang(StringBuilder sb){

        sb.append("!");
    }


    public static void replaceBuilder(StringBuilder sb){

        sb = new StringBuilder("New");
    }


    public static void shout(String s){
        s.toUpperCase();
    }


    public static void compareRefs(){
    String s1 = "java";
    String s2 = "java";
    String s3 = new String("java");
    System.out.println(s1==s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
    }

    public static int safeLength(String s){
    
        if(s == null){
            return -1;
        }

        return s.length();
    }

    public static String initials(String first, String last){

        return "" + Character.toUpperCase(first.charAt(0)) + Character.toUpperCase(last.charAt(0));
    }

    public static String clean(String raw) {
    return raw.trim().toLowerCase();
    }

    public static boolean isPalindromeWord(String w) {
        String reversed = new StringBuilder(w).reverse().toString();

        return w.equalsIgnoreCase(reversed);
    }

    public static String maskEmail(String email) {
        int at = email.indexOf("@");

        String name = email.substring(0, at);
        String domain = email.substring(at);

        return name.substring(0, 1)
                + "*".repeat(name.length() - 1)
                + domain;
    }



    public static String buildCsv(String a, String b, String c) {
        StringBuilder sb = new StringBuilder();

        sb.append(a);
        sb.append(",");
        sb.append(b);
        sb.append(",");
        sb.append(c);

        return sb.toString();
    }


    public static String edit(String text) {
    StringBuilder sb = new StringBuilder(text);

    sb.insert(0, "[");
    sb.append("]");
    sb.replace(7, 12, "Java");
    sb.deleteCharAt(6);

    return sb.toString();
}


    public static long timeJoin(boolean useBuilder) {
    long start = System.nanoTime();

    if (useBuilder) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 20000; i++) {
            sb.append("x");
        }

        sb.toString();

    } else {
        String s = "";

        for (int i = 0; i < 20000; i++) {
            s += "x";
        }
    }

        long end = System.nanoTime();

        return end - start;
    }



    public static String safeAppend(StringBuffer sb, String part) {
        sb.append(part);
        return sb.toString();
    }


    public static String formatReceipt(String customer, int quantity, double unitPrice){

        
        double total = quantity * unitPrice;
        int whole = (int) total;

        StringBuilder sb = new StringBuilder();

        sb.append("Customer: ").append(customer.toUpperCase());
        sb.append("\n\n");

        sb.append("Qty: ").append(quantity);
        sb.append(" | Price: ").append(unitPrice);
        sb.append("\n\n");

        sb.append("Total: ").append(total);
        sb.append(" (whole: ").append(whole).append(")");

        return sb.toString();

    }





}