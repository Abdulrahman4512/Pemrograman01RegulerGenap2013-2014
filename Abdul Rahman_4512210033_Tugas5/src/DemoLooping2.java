//created by: ABDUL RAHMAN
//data		: 17 April 2014
//Perintah Control Flow/Struktur Kontrol
//Perintah pertama - contoh 01

package Latihan05c.sesi1.bin;
import java.util.Random;

public class DemoLooping2
{
	static boolean selesai = false;
	public static void main(String[] Abdul_Rahman)
	{
		Integer faktor =7;
		System.out.println("mencari kelipatan " +faktor + " dengan while");
		while (!selesai)
		{
			cariKelipatan(faktor);
		}
		System.out.println("SELESAI MENCARI KELIPATAN DENGAN WHILE");
		System.out.println();
		System.out.println();
		System.out.println("mencari kelipatan " +faktor + " dengan for");
		for(selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("SELESAI MENCARI KELIPATAN DENGAN FOR");
	}
	public static void cariKelipatan(Integer faktor)
	{
		Integer random = new Random().nextInt();
		System.out.println("Bilangan Random : " +random);
		
		if(random % faktor == 0)
		{
			System.out.println("Kelipatan " +faktor + " ditemukan, yaitu : " +random);
			selesai = true;
		}
	}
}