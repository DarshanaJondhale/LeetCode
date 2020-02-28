public class ValidParenthesis{
	public static void main(String[] args){
		System.out.println(isPalindrome("121"));
	}
	public boolean isPalindrome(int x){
    	if(x<0){
    	    return false;
    	}
		int divisor = 1 ;
		while(x/divisor >= 10 ){
			divisor *=10;
		}
		while(x > 0){
			int head = x/divisor;
			int tail = x%10;
			if(head != tail)
			{
				return false;
			}
			x=(x%divisor)/10;
			divisor = divisor/100;
		}
		return true;
    }
}