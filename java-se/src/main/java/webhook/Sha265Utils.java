package webhook;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Classname Sha265Utils
 * @Description TODO
 * @date 2020/11/19 4:51 下午
 * @author by yorua
 */
public class Sha265Utils {

    public static String HMACSHA256(String data, String key) throws Exception {

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();

        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();

    }


}
