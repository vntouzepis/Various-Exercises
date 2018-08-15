package caesar_cipher;

import java.util.Scanner;

public class TestCaesar {

	public static void main(String[] args) {
System.out.println("give plaintext (english alphabet):");
Scanner sc=new Scanner(System.in);
String alfar=sc.nextLine();
System.out.println("give fixed number of positions:");
int numOfShifts=sc.nextInt();
CaesarsCipher klasi=new CaesarsCipher();
System.out.println("\n"+"cipher:");
System.out.println(klasi.cipher(alfar, numOfShifts)+"\n");
System.out.println("decipher:");
System.out.println(klasi.decipher(alfar, numOfShifts));
System.out.println();
	}

	

}
