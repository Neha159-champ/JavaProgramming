package practicestring;

public class PracticeBasics {
public static void main(String[] args) {
	String s="Neha";
	System.out.println("It will store in string constant pool area"+s);//string constant pool ares
	
	String s1=s.concat("Gupta");//heapArea
	System.out.println("It will store into heap area"+s1);//NehaGupta
	
	String s2=new String("Neha");//ha
	System.out.println("It will store into heap area"+s2);//Neha
	
	//compare
	System.out.println(s1==s2);//false
	System.out.println(s==s2);//false
	
	String s3=s2;
	System.out.println(s==s2);
	
	s2=s2.intern();//heap to scpa
	System.out.println(s==s2);//comparing ref var address
	System.out.println(s==s3);
	System.out.println(s2==s3);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s.equals(s3));//compare value
	System.out.println(s1.contains(s3));
	String s4="i am don";
	System.out.println(s4.endsWith("don"));
	System.out.println(s4.startsWith("i"));
	System.out.println(s4.toUpperCase());
	System.out.println(s4.concat("ji"));
	System.out.println(s4.indexOf("m"));
	System.out.println(s4.charAt(0));
	char ch= s4.charAt(0);
	char c=99;
	System.out.println("print character:"+(ch));
	System.out.println(s4.contains("d"));
	
	
}

}
