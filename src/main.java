import java.util.ArrayList;


public class main {
	public static void main(String[] args) {
       
		String firstWord = "unfortunate";
		String secondWord = "motivation";
		int largestWord = 0;
		
		  
        // Creates the arrays of the given strings
        char[] firstArray = new char[firstWord.length()];
        char[] secondArray = new char[secondWord.length()];
        
 // --------------------------------------------------------------
        // Copy character by character into array
        for (int i = 0; i < firstWord.length(); i++) 
        {
            firstArray[i] = firstWord.charAt(i);
        }
        
        for (int i = 0; i < secondWord.length(); i++) 
        {
            secondArray[i] = secondWord.charAt(i);
        }
 //---------------------------------------------------------------
        //find which passed word is the largest 
        if(firstWord.length() >= secondWord.length())
        {
        	System.out.println(firstWord + " has more characters than " + secondWord);
        	largestWord = firstWord.length();
        }
        else
        {
        	System.out.println(secondWord + " has more characters than " + firstWord);
        	largestWord = secondWord.length();
        }
        
        
        //This is the main logic it figures out how many characters if a certain type each word has and then finds how many of those letters are shared between the two words
 //----------------------------------------------------------------
        //find how many of each character are in a word
        int[] numCharOne = new int[26];
        int[] numCharTwo = new int[26];
        int[] numCharFin = new int[26];
        char[] englishAlphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' , 'j' , 'k' , 'l' , 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        
        //founds out the number and type of characters in the first word
        for(int i = 0; i < 26; i++)
        {
        	char holder = englishAlphabet[i];
        	long count = firstWord.chars().filter(ch -> ch == holder).count();
        	numCharOne[i] = (int) count;
        }
        
        //founds out the number and type of characters in the second word
        for(int i = 0; i < 26; i++)
        {
        	char holder = englishAlphabet[i];
        	long count = secondWord.chars().filter(ch -> ch == holder).count();
        	numCharTwo[i] = (int) count;
        }
       
        
        //prints out how many characters and of which type each word has ignoring letters not in the two given words 
        System.out.println(firstWord + " has ");
        for(int i = 0; i < 26; i++)
        {
        	if(numCharOne[i] == 0)
        	{
        		
        	}
        	else
        	{
        	  System.out.println(numCharOne[i] + " " + englishAlphabet[i] + "'s");
        	}
        	
        	
        }
        
        System.out.println(secondWord + " has ");
        for(int i = 0; i < 26; i++)
        {
        	if(numCharTwo[i] == 0)
        	{
        		
        	}
        	else
        	{
        	  System.out.println(numCharTwo[i] + " " + englishAlphabet[i] + "'s");
        	}
        }
        
        
       //this finds and then prints out how many and of what kind of each character the two words share with each other 
        System.out.println(firstWord + " and " + secondWord + " share");
        for(int i = 0; i < 26; i++)
        {
        	if(numCharOne[i] > numCharTwo[i])
        	{
        		numCharFin[i] = numCharTwo[i];
        	}
        	else if(numCharOne[i] < numCharTwo[i])
        	{
        		numCharFin[i] = numCharOne[i];
        	}
        	
        	if(numCharFin[i] == 0)
        	{
        		
        	}
        	else 
        	{
        		System.out.println(numCharFin[i] + " " + englishAlphabet[i] + "'s");
        	}
        }
      
        
 //----------------------------------------------------------------
        // Printing content of array
        for (char c : firstArray)
        {
           // System.out.print(c + " ");
        }
        
        System.out.println();
        
        for (char c : secondArray)
        {
           // System.out.print(c + " ");
        }
 //-------------------------------------------------------------------       
    }
}
