package src.java_basics;

public class VariablesContinued {
    public static void main(String[] args) {
        // 8 bit integer, signed, two's complement
        // first bit is sign
        // so -128 to +127
        byte reallySmallNumber = -128;

        // 16 bit 
        // -32,768 to 32,767
        short smallNumber = 32767;

        // 32 bit
        // -2^31 to 2^31 - 1
        int var = 100000;
        
        // 64 bit
        // will get warnings that int is out of range, can mark as long by putting an L
        // at the end of the digits.
        long bigNumber = 1000000000000000000L;

        // 32 bit floating point
        float floatNumber = 123.45f;

        // 64 bit floting point 
        double decimalVariable = 9898.878;

        // true/false
        boolean decision = false;
        
        // single 16 bit unicode character
        char letter = 'g';
    }
}
