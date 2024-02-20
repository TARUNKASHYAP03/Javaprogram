package JavaProgram.String;

public class Concatenation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder object banaya gaya

        sb.append("Hello"); // StringBuilder mein "Hello" string add kiya gaya
        sb.append(" "); // Ek space add kiya gaya
        sb.append("World"); // "World" string ko StringBuilder mein add kiya gaya

        String result = sb.toString(); // StringBuilder ko string mein convert kiya gaya

        System.out.println("Concatenated String: " + result); // Concatenated string ko print kiya gaya
    }
}
