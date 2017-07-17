import java.lang.*;
import java.io.*;
import java.util.*;
class CeaserCipher{
	int key;
	String plaintext,cipher;
	Scanner scr=new Scanner(System.in);
	
	public void encrypt(){
		cipher="";
		for(int i=0;i<plaintext.length();i++){
			int c=plaintext.charAt(i);
			System.out.println(c);
			c=(c+key) % 26;
			if(Character.isUpperCase(c))
			{
				if(c > 'Z')
					c=c-26;
			}	
			else{
				if(c > 'z')
					c=c-26;
			}
			cipher+=(char)c;
		}	
		
		System.out.println(cipher);	
	}
	
	public void decrypt(){
		plaintext="";
		for(int i=0;i<cipher.length();i++){
			int c=cipher.charAt(i);
			c=c-(key % 26);
			if(Character.isUpperCase(c))
			{
				if(c < 'A')
					c=c+26;
			}	
			else{
				if(c < 'a')
					c=c+26;
			}
			
			plaintext+=(char)c;
		}	
		
		System.out.println(plaintext);
			
	}
	public static void main(String args[]){
		CeaserCipher c=new CeaserCipher();
		System.out.println("Enter Plain Text: ");
		c.plaintext=c.scr.nextLine();
		System.out.println("Enter Shift Key value: ");
		c.key=c.scr.nextInt();
		c.encrypt();
		c.decrypt();
	}
}
