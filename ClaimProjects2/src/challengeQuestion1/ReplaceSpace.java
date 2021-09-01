package challengeQuestion1;

public class ReplaceSpace {
	
	public static char[] replaceSpaces(char[] strToChar, int trueLength) {
		  // write code here
		String strToString = "%20";
		int index = 2;
		char[] strToStrings = {} ;
		
		StringBuilder sb = new StringBuilder();		
		for(char chars: strToChar) {
			
			sb.append(chars);
			String myString = sb.toString();
			myString = myString.replaceAll("\\s", "");
			String myNewString = new String();
			for(int i = 0; i < myString.length(); i++) {
				myNewString  += myString.charAt(i);
				if (i == index) {
					myNewString += strToString;
				}
			}
				int index1 = 9;
				String myNewString1 = new String();
				
				for(int i = 0; i < myNewString.length(); i++) {
				myNewString1  += myNewString.charAt(i);
				if (i == index1) {
					myNewString1 += strToString;
					}
				}
				int index2 = 17;
				String myNewString2 = new String();
				
				for(int i = 0; i < myNewString1.length(); i++) {
				myNewString2  += myNewString1.charAt(i);
				if (i == index2) {
					myNewString2 += strToString;
					}
				}
				
				strToStrings = myNewString2.toCharArray();
			}				
		return strToStrings;		
			}		  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Mr. John Smith    ";
		    char[] strToChar = str.toCharArray();
		    int trueLength = strToChar.length  - 4;		    
		    System.out.println(replaceSpaces(strToChar, trueLength));    
		}
	}