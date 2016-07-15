
public class DataTypeexception {
public static void main(String args[])
{
	
	try{
		int num1=Integer.parseInt("51234");
		System.out.println("num1="+num1);
		int num=Integer.parseInt("XYZ");
		System.out.println("num="+num);
	}
	catch(Exception e)
	{
		System.out.println("Check the data type");
	}
}
}
