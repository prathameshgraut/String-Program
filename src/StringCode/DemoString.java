package StringCode;

public class DemoString {
	static void print() {
		String str="Prathamesh ";
		String str2=str.concat("Raut");
		System.out.println("use Concat Method: "+str2);
		
		String s1="Prathamesh ";
		System.out.println("\nCheck Content Using Equals Methdod: "+str.equals(s1));
		
		System.out.println("\nUsing Lower Case Method: "+str.toLowerCase());
		
		System.out.println("\nUsing Uppear Case Method: "+str.toUpperCase());
		
		System.out.println("\nUsing HashCode Method: "+str.hashCode());
		
		System.out.println("\nUsing Length Method: "+str.length());
		
		
		System.out.println("\nUsing == Check Refernce Method: ");
		System.out.println(str==s1);
		
		
		StringBuffer sb=new StringBuffer();
		sb.append("Vaibhav");
		System.out.println("\nUsing StringBuffer: "+sb);
		
		System.out.println("\nUsing Reverse Method: "+sb.reverse());
		
		System.out.println("\nUsing ToString: "+sb.toString());
		
		System.out.println("\nUsing CharAt() : "+sb.charAt(0));
		
		System.out.println("\nUsing Append : "+sb.append(" Raut"));
		
		System.out.println("\nUsing Compare: "+sb.compareTo(sb));
	}
public static void main(String[] args) {
	print();
}
}
