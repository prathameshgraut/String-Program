package StringCode;

import java.util.Scanner;

public class CheckPalindroem {
	static void print(String str) {
		String store=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(store.equals(res)) {
			System.out.println("String Is Palindrome :"+res);
		}else {
			System.out.println("String Not Palindrome :"+store);
		}
	}
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.print("Enter A String : ");
	String str="";
	str=Sc.next();
	print(str);
}
}
