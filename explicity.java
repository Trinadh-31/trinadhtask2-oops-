package starsprinting;

public class explicity {
	public static void main(String[] args)
	{
		byte b;
		int i=2;
		double c=35.678;
		b=(byte)i;
		i=(int)c;
		b=(byte)c;
		System.out.println("i"+i+"b"+b);
		System.out.println("c"+c+"i"+i);
		System.out.println("d"+c+"b"+b);
	}

}
