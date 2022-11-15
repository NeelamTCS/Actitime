package Java_Imp_Program;

public class Count_Uppercase_Lowercase {
	public static void main(String[] args) {
		
		String s1="Neelam Mahendra Jadhav";
		int uppercount=0;
		int lowercount=0;
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'&& s1.charAt(i)!=' ') {
				uppercount++;
				
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z'&& s1.charAt(i)!=' ')
			{
				lowercount++;
				
			}
			
			
		}System.out.println(uppercount +"and"+ lowercount);
		
		
		
	
	}

}
