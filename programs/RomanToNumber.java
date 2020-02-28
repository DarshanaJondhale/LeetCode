public class RomanToNumber{
	public static void main(String[] args){
		System.out.println(romanToInt("III"));
	}
	public static int romanToInt(String s) {
    	Map<Character, Integer> r2m =new HashMap<Character, Integer>();
    	r2m.put('I', 1);
    	r2m.put('V', 5);
    	r2m.put('X', 10);
    	r2m.put('L', 50);
    	r2m.put('C', 100);
        r2m.put('D', 500);
    	r2m.put('M', 1000);
    	int res = 0 ;
    	for(int i = s.length()-1 ; i >= 0 ; i--)
    	{
            int cur= r2m.get(s.charAt(i));
    		if(i > 0 ) {
    			int next=r2m.get(s.charAt(i-1));
    			res += cur ;
    			if(cur > next) {
    				res -= next;
                    i--;
    			}
    		}
    		else 
    			res += cur;
    	}
    	System.out.println(res);
		return res;
    }
}