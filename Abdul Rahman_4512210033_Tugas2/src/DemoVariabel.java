//created by: Abdul Rahman
//data		: 10 April 2014

package Praktikum03d;

public class DemoVariabel
{
	public static void main(String[] Abdulrahman)
	{
		int x =10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke type yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		
		//tidak bisa complie(error)
		//char w=x;
		//System.out.println("Nilai W adalah " +x);
		
		//type casting
		char v=(char) x;
		System.out.println("Nilai W adalah " +v);
		System.out.println("Baris Selanjutnya");
		
	}
	public static void coba(){
		//System.out.println("Nilai V adalah " +);
	}
}