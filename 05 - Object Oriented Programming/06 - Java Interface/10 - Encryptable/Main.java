// Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.

public class Main {
    public static void main(String[] args) {
        AES aes = new AES();
        String originalData = "Hello, everyone =]";
        System.out.println("Original Data: " + originalData);

        String aesEncryptedData = aes.encrypt(originalData);
        System.out.println("AES Encrypted Data: " + aesEncryptedData);

        String aesDecryptedData = aes.decrypt(aesEncryptedData);
        System.out.println("AES Decrypted Data: " + aesDecryptedData);

        RSA rsa = new RSA();

        String rsaEncryptedData = rsa.encrypt(originalData);
        System.out.println("RSA Encrypted Data: " + rsaEncryptedData);

        String rsaDecryptedData = rsa.decrypt(rsaEncryptedData);
        System.out.println("RSA Decrypted Data: " + rsaDecryptedData);
    }
}