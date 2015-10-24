package com.anoncrypt.actions;

import com.anoncrypt.services.SymAES;


public class SymEncrypt  {

	private String encrypt;
	private String encrypted;
	private String password;
	
	
	
	boolean TEMP;
	
	
	public String execute() throws Exception {
		
		SymAES ob=new SymAES();
		ob.start(getPassword());
		
		setEncrypted( ob.encode(getEncrypt()));
	
		 System.out.println("into action class "+getEncrypted());
		 
		 if(!getEncrypted().equals(null))
			 return "success";
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

}
