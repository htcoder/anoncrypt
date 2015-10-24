package com.anoncrypt.services;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class SymAES
{

	private static final String ALGORITHM = "AES";
	private static byte[] keyValue= new byte[] { 'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y' };
	

 public  String encode(String valueToEnc) throws Exception {
	 System.out.println("The Key byte value"+keyValue );
	
    Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGORITHM);
    c.init(Cipher.ENCRYPT_MODE, key);
    byte[] encValue = c.doFinal(valueToEnc.getBytes());
    String encryptedValue = new BASE64Encoder().encode(encValue);
    return encryptedValue;
}

public  String decode(String encryptedValue) throws Exception {
   try{
	Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGORITHM);
    c.init(Cipher.DECRYPT_MODE, key);
    byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
    byte[] decValue = c.doFinal(decordedValue);
    String decryptedValue = new String(decValue);
    return decryptedValue;
   }
   catch(Exception e)
   {
	   String decryptedValue = new String("no");
	    return decryptedValue;
   }
}

private static Key generateKey() throws Exception {
	
	System.out.println("The Key byte value inside genkey"+keyValue );
	Key key = new SecretKeySpec(keyValue, ALGORITHM);
    return key;
    
    
   
}
public  void start(String passcode)throws Exception
{
	int temp=passcode.length();
	for(int i=temp;i<32;i++)
	{
		passcode=passcode+'a';
	}
	System.out.println("Updated byte "+passcode);
	
	 	keyValue = passcode.getBytes();
		System.out.println("passcode"+passcode);	
	System.out.println("The Key byte value inside start"+keyValue );
		
		
	
}



}