package Java_Imp_Program;

public class Noof_spaces_String {

	public static void main(String[] args) {
		String s1="Pruthviraj balasaheb pawar";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
				
			}
			
		}
		System.out.println(count);
		/*
		String s1="neelam mahendra jadhav";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
			
		}
		System.out.println(count);*/
	}
}
