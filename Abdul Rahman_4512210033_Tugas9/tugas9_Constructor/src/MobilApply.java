//created by: Abdul Rahman
//data		: 26 mei 2014

package Latihan09e.bin;

public class MobilApply
{
	public static void main (String[] Abdul_rahman)
	{
		Jeep Mobil1 = new Jeep("Jeep Tentara", "B-63-ATO", 180);
		Jeep Mobil2 = new Jeep("Jeep Gunung", "B-66-CAN", 200);
		Jeep Mobil3 = new Jeep("Jeep Pantai", "B-6663-TOC", 150);
		
		Mobil1.JenisMobil();Mobil1.Disply();
		System.out.println();
		Mobil2.JenisMobil();Mobil2.Disply();
		System.out.println();
		Mobil3.JenisMobil();Mobil3.Disply();
	}
}