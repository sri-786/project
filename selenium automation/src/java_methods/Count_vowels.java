package java_methods;

public class Count_vowels {

	public static void main(String[] args) {

	String s="Srikanth";
	String e=s.toLowerCase();
	int r1=0;
	for(char i:e.toCharArray()) {
		System.out.println(i);
		
		
		if(i== 'a' || i== 'e' || i=='i'||i=='o' || i=='u') {
			r1++;
		}
	}
	System.out.println("Vowels"+r1);
}
}

