package com.anoncrypt.actions;


import com.anoncrypt.services.AES;
import com.anoncrypt.services.SdmsInsert;

public class SdmsEncrypt  {

	private String encrypt;
	private String encrypted;
	boolean TEMP;
	
	
	public String execute() throws Exception {
		
	     setEncrypted(AES.encode(getEncrypt()));	
		System.out.println(getEncrypted());
		TEMP=SdmsInsert.insert(getEncrypted());
		if(TEMP)
		{
			return "success";
		}
		else
			return "error";
		
	}


	public String getEncrypted() {
		return encrypted;
	}


	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}


	public String getEncrypt() {
		return encrypt;
	}


	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}

	

}
