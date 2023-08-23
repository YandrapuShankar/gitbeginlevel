package com.example.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import net.bytebuddy.utility.RandomString;

public class Util {
	
	public static String getmaskedAccNum(String Acc) {
		return (Acc.replaceAll(".(?=.{6})", "X"));
	}
	public static String getmasked4(String Acc) {
		return "XX" + (Acc!=null && (Acc.length() > 4) ? Acc.substring(Acc.length() - 4) : "");
	}
	public static String getBase64Encoded(String otp) throws IOException {
		 ByteArrayOutputStream obj=new ByteArrayOutputStream();
	      GZIPOutputStream gzip = new GZIPOutputStream(obj);
	      gzip.write(otp.getBytes("ISO-8859-6"));
	      gzip.close();
	      byte[] enc=obj.toByteArray();
	      String outStr = Base64.getEncoder().encodeToString(enc);
	      return outStr;
	}
	public static String getBase64Decoded(String otp) throws UnsupportedEncodingException, IOException {
		 GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(otp.getBytes("ISO-8859-6"))));
	      BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "ISO-8859-6"));
	      String outStr = "";
	      String line;
	      while ((line=bf.readLine())!=null) {
	          outStr += line;
	      }
	      return outStr;
	}
	
	public static Date getDateAfter(String valid) {
			Date date =new Date();
			long validTime=Long.parseLong(valid);
			long timeInSecs = date.getTime();
			Date afterAdding10Mins = new Date(timeInSecs + (validTime * 60 * 1000));

			return afterAdding10Mins;
	}
	
	public static long getMinutesTimeDiff(Date startTime, Date endTime) {

	    long difference = endTime.getTime() - startTime.getTime();
	    long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(difference);
		System.out.println(diffInMinutes);
	    return diffInMinutes;
	}
	
	public static int getSecondDiff(Date startTime, Date endTime) {
		int sec=(int) (Math.abs(startTime.getTime()-startTime.getTime())/1000);
		System.out.println(sec);
		return sec;
	}
	
	public static String getHash(String pwd) {
        try {
          MessageDigest digest = MessageDigest.getInstance("SHA-256");  
               byte[] hash = digest.digest(pwd.getBytes());  
               
               String imageHash = new String(Base64.getEncoder().encode(hash));  
               // String encodedPwd = passwordEncoder.encode(finalNewPassword);  
               // user.setPassword(encodedPwd);  
               System.out.println("<<<<<<<<<<<<<<<<<<SHA256 AFTER>>>>>>>>>>>>>" + imageHash);  
               return imageHash;
          }catch(Exception e) {
           e.printStackTrace();
          }
        return null;
        }
	public static String getUUID() {
		System.out.println(RandomString.make(8));
	return 	RandomString.make(8);
	}
	
	 public static Date getLastweek(Date date) {
			
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.set(Calendar.HOUR_OF_DAY, -168);
	        calendar.set(Calendar.MINUTE, 00);
	        calendar.set(Calendar.SECOND, 00);
	        calendar.set(Calendar.MILLISECOND, 00);
	        return calendar.getTime();
		    }

	 public static Date getBackwardDate(int min) {
		Date oneMinuteAgoDate = new Date(System.currentTimeMillis() - (min*60 * 1000));
		DateTime customDateTimeFromJavaDate = new DateTime(oneMinuteAgoDate);
		return customDateTimeFromJavaDate.toDate();
	}
	public static long getFeatureDate(Date createdDate, int min) {
		long addMin= createdDate.getTime()+(min*60 * 1000);
//		Date oneMinuteAgoDate = new Date(System.currentTimeMillis() - (min*60 * 1000));
		DateTime expectedTime = new DateTime(addMin);
		DateTime curent= new DateTime();
		Duration duration = new Duration(curent, expectedTime);
		//aready excced the intervel
		return duration.getStandardMinutes();
	}
	
	 public static String getSuccessCheckSum(String msgId) {
		 return ChecksumUtil.generateCheckSum("00"+"SUCCESS"+msgId);
	}
	public static String getFailureCheckSum(String msgId) {
		 return ChecksumUtil.generateCheckSum("01"+"FAILURE"+msgId);
	}
	public static String getBlockedCheckSum(String msgId) {
		 return ChecksumUtil.generateCheckSum("25"+"BLOCKED"+msgId);
	}
	public static String getCheckSum(String code,String result,String msgId) {
		 return ChecksumUtil.generateCheckSum(code+result+msgId);
	}
	

	public static String getChecksumMismatch(String msgId) {
		 return ChecksumUtil.generateCheckSum("91"+"checksum mismatch"+msgId);
	}
public static void main(String[] args) {
	getHash("7dO60Gg9");
}
}
