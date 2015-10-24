package com.anoncrypt.actions;
import com.anoncrypt.services.AES;
import com.anoncrypt.services.SdmsCheck;

public class SdmsDecrypt {
	
	private String decrypt;
	private String decrypted;
	boolean TEMP;
	
	
	public String execute() throws Exception
	{
		System.out.println(decrypt);
		TEMP=SdmsCheck.select(getDecrypt());
		
		if(TEMP)
		{
			
			setDecrypted(AES.decode(getDecrypt()));
			System.out.println("The Decrypted Message "+decrypted);
			
			return "success";
		}
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
	

}
