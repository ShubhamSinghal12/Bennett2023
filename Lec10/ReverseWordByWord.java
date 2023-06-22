package Lec10;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "The Sky is Blue";
		String ans = "";
		
		int lo = st.lastIndexOf(" ");
		while(lo != -1)
		{
			ans = ans+st.substring(lo+1)+" ";
			st = st.substring(0,lo);
			lo = st.lastIndexOf(" ");
		}
		ans += st;
		System.out.println(ans);

	}

}
