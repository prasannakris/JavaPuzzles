package JavaPuzzles;
import java.lang.String;




public class PallinDrome{
	
		    public static void main(String[] args)
	    {
	        System.out.println( isPalindromeString("howtodoinjava") );
	        System.out.println( isPalindromeString("abcba") );
	    }
	     
	

		public static boolean isPalindromeString(String originalString) {
			
			String reverse = "";
			int length = originalString.length();
			for(int i=length-1; i>=0; i--)
			{
				
				reverse = reverse + originalString.charAt(i);
				
			}
	        return originalString.equals(reverse);
		}

		

}
