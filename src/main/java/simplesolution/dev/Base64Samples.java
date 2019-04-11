/**
 * https://simplesolution.dev/
 */
package simplesolution.dev;

import org.apache.commons.codec.binary.Base64;

public class Base64Samples {

    public static void main(String... args) {
        encodeSolution1();
        encodeSolution2();
        encodeSolution3();
        encodeSolution4();

        decodeSolution1();
        decodeSolution2();
        decodeSolution3();
        decodeSolution4();
    }

    private static void encodeSolution1() {
        Base64 base64 = new Base64();
        String valueToEncode = "https://simplesolution.dev/";
        byte[] encodedBytes = base64.encode(valueToEncode.getBytes());
        String encodedString = new String(encodedBytes);

        System.out.println("Decode Solution #1 output: ");
        System.out.println(encodedString);
    }

    private static void encodeSolution2() {
        Base64 base64 = new Base64();
        String valueToEncode = "https://simplesolution.dev/";
        String encodedString = base64.encodeToString(valueToEncode.getBytes());

        System.out.println("Decode Solution #2 output: ");
        System.out.println(encodedString);
    }

    private static void encodeSolution3() {
        String valueToEncode = "https://simplesolution.dev/";
        byte[] encodedBytes = Base64.encodeBase64(valueToEncode.getBytes());
        String encodedString = new String(encodedBytes);

        System.out.println("Decode Solution #3 output: ");
        System.out.println(encodedString);
    }

    private static void encodeSolution4() {
        String valueToEncode = "https://simplesolution.dev/";
        String encodedString = Base64.encodeBase64String(valueToEncode.getBytes());

        System.out.println("Decode Solution #4 output: ");
        System.out.println(encodedString);
    }

    private static void decodeSolution1() {
        Base64 base64 = new Base64();
        String valueToDecode = "aHR0cHM6Ly9zaW1wbGVzb2x1dGlvbi5kZXYv";
        byte[] bytesToDecode = valueToDecode.getBytes();
        byte[] decodedBytes = base64.decode(bytesToDecode);
        String decodedString = new String(decodedBytes);

        System.out.println("Decode Solution #1 output: ");
        System.out.println(decodedString);
    }

    private static void decodeSolution2() {
        Base64 base64 = new Base64();
        String valueToDecode = "aHR0cHM6Ly9zaW1wbGVzb2x1dGlvbi5kZXYv";
        byte[] decodedBytes = base64.decode(valueToDecode);
        String decodedString = new String(decodedBytes);

        System.out.println("Decode Solution #2 output: ");
        System.out.println(decodedString);
    }

    private static void decodeSolution3() {
        String valueToDecode = "aHR0cHM6Ly9zaW1wbGVzb2x1dGlvbi5kZXYv";
        byte[] bytesToDecode = valueToDecode.getBytes();
        byte[] decodedBytes = Base64.decodeBase64(bytesToDecode);
        String decodedString = new String(decodedBytes);

        System.out.println("Decode Solution #3 output: ");
        System.out.println(decodedString);
    }

    private static void decodeSolution4() {
        String valueToDecode = "aHR0cHM6Ly9zaW1wbGVzb2x1dGlvbi5kZXYv";
        byte[] decodedBytes = Base64.decodeBase64(valueToDecode);
        String decodedString = new String(decodedBytes);

        System.out.println("Decode Solution #4 output: ");
        System.out.println(decodedString);
    }

}
