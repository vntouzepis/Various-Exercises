package caesar_cipher;

import java.util.*;

public class CaesarsCipher {
	ArrayList<String> mylist=new ArrayList<String>(Arrays.asList("a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H","i","I","j","J",
			"k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z"));
	
	String cipher(String message, int numOfShifts){
		char[] pin=message.toCharArray();
		String[] alfar=new String[message.toCharArray().length];
		ArrayList<String> mylist2=new ArrayList<String>();

		for (int i=0;i<message.toCharArray().length;i++){
			 alfar[i]=String.valueOf(pin[i]);}
		
		numOfShifts=2*numOfShifts;
		if (numOfShifts>=52)
			numOfShifts=(numOfShifts%50)-2;			
		
		
		for (int i=0;i<alfar.length;i++){
			if (mylist.contains(alfar[i])){
			for (int j=0;j<mylist.size();j++){
			if (alfar[i].equals(mylist.get(j))){
				if ((j+numOfShifts)<=51)
				mylist2.add(mylist.get(j+numOfShifts));
				else
				mylist2.add(mylist.get(numOfShifts-2-(50-j)));	
			}}}
			
			else
				mylist2.add(alfar[i]);}
		
		
		String[] alfar1=new String[mylist2.size()];
		for (int i=0;i<alfar1.length;i++){
			alfar1[i]=mylist2.get(i);}
		
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<alfar1.length;i++){
			sb.append(alfar1[i]);}
		
		String alfar2=new String(sb);
	
		return alfar2;
	}
	
	
	String decipher(String message, int numOfShifts){
		numOfShifts=26-numOfShifts;
		String str1=cipher(message,numOfShifts);
	
		return str1;	}
	
}
