package starsprinting;

public class Bufferclass {
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("trinadh");
		s.append("vatyam");
		s.insert(3,"v");
		s.replace(5, 6, "ss");
	    System.out.println(s);
	}

}
