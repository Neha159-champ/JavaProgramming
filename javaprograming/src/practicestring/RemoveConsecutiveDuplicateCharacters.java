package practicestring;

public class RemoveConsecutiveDuplicateCharacters {
	
	    public static void main(String[] args) {
	        String str="aaabbbccccdd";
	        StringBuilder result=new StringBuilder();
	        for(int i=0;i<str.length();i++){
	            if(i==0 || str.charAt(i)!= str.charAt(i-1))
	            {
	             // System.out.println(i);
	                result.append(str.charAt(i));
	            }
	        }
	        System.out.println(result);
	    }
	}

