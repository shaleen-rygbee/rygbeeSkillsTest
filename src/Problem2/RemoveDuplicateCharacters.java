package Problem2;

public class RemoveDuplicateCharacters {

	String output;
	
	public RemoveDuplicateCharacters()
	{
		output = "";
	}
	
	public String removeDuplicateConsecutiveEntries(String input)
	{//This method adds the characters sequentially into the output String depending on the condition check return value
		for (int i=0; i<input.length(); ++i)
			if(this.checkCondition(input.charAt(i)))
				output += input.charAt(i);
		return output;
	}
	
	public boolean checkCondition(Character ch)
	{//This method return false if the last character in the output string is the same as the provided input character, otherwise false
		if(this.output.length() > 0)
			if(ch == this.output.charAt(this.output.length()-1))
				return false;
		return true;
	}
	
	
}
