
package com.example.util;

import java.security.MessageDigest;
import java.util.Base64;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChecksumUtil {
	
		
	public static String generateCheckSum(String payload) {
        //
		System.out.println("payload{}"+payload);
        String finalCheckSum;
     //  String msgid = Utilities.getInstance().getTransactionID();
    //   setCheckSumMsgid(msgid);
      // setTimeStmp(timeStamp);
//        log.debug("payload{}",payload);
        String shaPayload= payload;
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] out = digest.digest(shaPayload.getBytes());
            out = digest.digest(out);
            finalCheckSum= Base64.getEncoder().encodeToString(out);
//            Log.d("genarted Checksum:{}",finalCheckSum);
            System.out.println("checksum:::{}"+finalCheckSum);

//            log.debug("checksum:::{}",finalCheckSum);
            return finalCheckSum.trim();
        } catch (Exception e) {
//            Log.d("genarted printStackTrace:{}","");
            e.printStackTrace();
        }
//        Log.d("genarted printStackTrace:{}","");
        return null;
    }
	
	public static String generateCheckSumOTP(String payload,String mobile) {
        //
        String finalCheckSum;
        String shaPayload=mobile+payload;
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA256");
            byte[] out = digest.digest(shaPayload.getBytes());
            out = digest.digest(out);
            finalCheckSum= Base64.getEncoder().encodeToString(out);
            return finalCheckSum.trim();
        } catch (Exception e) {
        }
//        Log.d("genarted printStackTrace:{}","");
        return null;
    }


	public static boolean validateChecksum(String checksum, String payload,String enableCheckSum) {
		String generatedChecksum = generateCheckSum(payload);
		if(enableCheckSum.equalsIgnoreCase("Y")) {
		if(checksum.equals(generatedChecksum)) {
			return true;
		}
		return false;
		}else return true;
	}
	public static void main(String[] args) {
		generateCheckSum("01Your password is incorrectccde317f-2ab3-4a96-b7ec-c81fba4e6330");
	}
}
