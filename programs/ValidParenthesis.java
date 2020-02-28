/*
	ValidParenthesis
*/

public class ValidParenthesis{
	public static void main(String[] args){
		ValidParenthesis v = new ValidParenthesis();
		System.out.println(v.isValid("))"));
	}
	public boolean isValid(String s){
		if(s==null || s.length() == 1){
			return false;
		}
        if(s.isBlank())
        {
            return true;
        }
		char[] inChar = new char[s.length()];
		int count = 0; 
		for (char c : s.toCharArray()) {
			switch(c){
				case  '(':
					inChar[count]=c;
					count++;
				break;

				case  ')':
					if(count == 0){
						return false;
					}
					else if(inChar.length == 0){
						return false;
					}
					else if( inChar[count-1] != '(' ){
						return false;
					}
					else{
						count--;
					}
				break;

				case  '{':
					inChar[count]=c;
					count++;
				break;

				case  '}':
					if(count == 0){
						return false;
					}
					else if(inChar.length == 0){
						return false;
					}
					else if( inChar[count-1] != '{' ){
						return false;
					}
					else{
						count--;
					}
				break;

				case  '[':
					inChar[count]=c;
					count++;
				break;
				case  ']':
					if(count == 0){
						return false;
					}
					else if(inChar.length == 0){
						return false;
					}
					else if( inChar[count-1] != '[' ){
						return false;
					}
					else{
						count--;
					}
				break;
				default:
					return false;
			}
		}
		if(count != 0)
		{
			return false;
		}
		return true;
	}
}