package Problem1;

public class RemoveDuplicateCharacters {

	String output;
	
	public RemoveDuplicateCharacters()
	{
		output = "";
	}
	
	public String removeDuplicateEntries(String input)
	{	//Add the characters into the output string on the basis of the condition check return value
		for (int i=0; i<input.length(); ++i)
			if(this.checkCondition(input.charAt(i)))
				output += input.charAt(i);
		
		return output;
	}
	
	public boolean checkCondition(Character ch)	
	{
		//This method returns true if the provided character is not found in the current output string, otherwise false.
		for(int i=0; i<this.output.length(); ++i)
			if(ch == this.output.charAt(i))
				return false;
		return true;
	}
	
}
