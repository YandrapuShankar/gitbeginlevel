package com.olive.loan.app.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipUtil {
	
	
	public static String decompress(String str) {
		try {
		if (str == null || str.length() == 0) {
		return str;
		}
		System.out.println("Input String length : " + str.length());
		GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(str.getBytes("ISO-8859-6"))));
		BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "ISO-8859-6"));
		String outStr = "";
		String line;
		while ((line=bf.readLine())!=null) {
		outStr += line;
		}
		System.out.println("Output String lenght : " + outStr.length());
		return outStr;
		}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
		}
		return null;
		}
		public static String compress1(String str){
		try {
		if (str == null || str.length() == 0) {
		return str;
		}
		System.out.println("String length : " + str.length());
		ByteArrayOutputStream obj=new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(obj);
		gzip.write(str.getBytes("ISO-8859-6"));
		gzip.close();
		byte[] enc=obj.toByteArray();
		String outStr = Base64.getEncoder().encodeToString(enc);
		System.out.println("Output String length : " + outStr.length());
		System.out.println("Output String:"+outStr);
		return outStr;
		}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
		}
		return null;
		}
		
	
	
	public static void main(String[] args) {
		
		
		
		
		
		compress1("Petty Traders:\r\n"
				+ "\r\n"
				+ "Benefits:\r\n"
				+ "\r\n"
				+ "1.Both Term loan & Working capital facility.\r\n"
				+ "2.Capital for business expansion.\r\n"
				+ "3.Diversification of products and services.\r\n"
				+ "4.Enhancing competitiveness\r\n"
				+ "5.Job creation\r\n"
				+ "\r\n"
				+ "Eligibility:\r\n"
				+ "\r\n"
				+ "1.The applicant should have account with the Bank.\r\n"
				+ "2.Only one member in a family is eligible for the finance.\r\n"
				+ "3.Business should be in viability.\r\n"
				+ "4.Minimum CIBIL Score – 650\r\n"
				+ "5.No CIBIL score required for loan amount less than ₹50,000/-\r\n"
				+ "\r\n"
				+ "Features:\r\n"
				+ "\r\n"
				+ "1.Quantum of loan up to ₹2.00 lakh.\r\n"
				+ "2.CC limit is valid for one year.   \r\n"
				+ "3.Term Loan maximum repayment period is 36 months.\r\n"
				+ "4.Flexible repayments(daily/weekly/monthly).\r\n"
				+ "5.Low processing charges.\r\n"
				+ "6.No Prepayment Charges.\r\n"
				+ "7.CGTMSE Coverage.\r\n"
				+ "\r\n"
				+ "Rate of Interest: 11% p.a\r\n"
				+ "");
	}
	
	
	
}
