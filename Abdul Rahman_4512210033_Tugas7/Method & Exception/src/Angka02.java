//created by: ABDUL RAHMAN
//data		: 3 Mei 2014

package Latihan06e.sesi1.bin;

public class Angka02
{
	public static void main(String[] Abdul_Rahman)
	{
		double Penyebut = 9;
		double Pembilang = 2;
		try
		{
			System.out.println("hasil Pembagiannya Adalah " +Penyebut/Pembilang);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Pekerjaan Dengan Angka 0...");
		}
		System.out.println("Selesai");
	}
}