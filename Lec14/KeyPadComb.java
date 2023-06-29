package Lec14;

public class KeyPadComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lc("43", "");

	}
	
	static String[] combs = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	static public void lc(String dig,String ans) {
        
		if(dig.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			String st = combs[dig.charAt(0)-'0'];
			for(int i = 0; i < st.length(); i++)
			{
				lc(dig.substring(1), ans+st.charAt(i));
			}
		}
		
    }
	

}
