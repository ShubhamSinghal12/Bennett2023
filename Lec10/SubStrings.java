package Lec10;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String st = "abcd";
        for(int i = 0; i < st.length(); i++)
        {
        	for(int j = i; j < st.length(); j++)
        	{
        		System.out.println(st.substring(i,j+1));
        	}
        }
        
        
        

	}

}
