package com.anoncrypt.actions;

import com.anoncrypt.services.SymAES;


public class SymDecrypt  {

	private String decrypt;
	private String decrypted;
	private String password;
	boolean TEMP;
	
	
	public String execute() throws Exception {
		
		SymAES ob=new SymAES();
		ob.start(getPassword());
		
		setDecrypted( ob.decode(getDecrypt()));
		
		 System.out.println("into the action class  "+getDecrypted());
		 if(!getDecrypted().equals("no"))
			 return "success";
		 else 
			 return "error";
		
	}


	public String getDecrypt() {
		return decrypt;
	}


	public void setDecrypt(String decrypt) {
		this.decrypt = decrypt;
	}


	public String getDecrypted() {
		return decrypted;
	}


	public void setDecrypted(String decrypted) {
		this.decrypted = decrypted;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
