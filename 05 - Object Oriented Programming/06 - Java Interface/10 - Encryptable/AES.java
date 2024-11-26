import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AES implements Encryptable {

    private static final String ALGORITHM = "AES";
    private SecretKey secretKey;
    private static final Logger logger = Logger.getLogger(AES.class.getName());

    public AES() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
            keyGenerator.init(128);
            this.secretKey = keyGenerator.generateKey();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error initializing AES encryption", e);
        }
    }

    @Override
    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error encrypting data with AES", e);
            return null;
        }
    }

    @Override
    public String decrypt(String encryptedData) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error decrypting data with AES", e);
            return null;
        }
    }
}
