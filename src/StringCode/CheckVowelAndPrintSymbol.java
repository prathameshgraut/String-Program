package StringCode;

import java.util.Scanner;

public class CheckVowelAndPrintSymbol {
	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String: ");
		str=sc.next();
		String res="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				res=res+"#";
			}else {
				res=res+ch;
			}
	}
		System.out.println("My String :"+res);
}
	
}
