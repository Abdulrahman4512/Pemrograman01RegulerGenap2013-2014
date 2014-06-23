package Latihan12e;
public class TestMobil
{
	public static void main (String[] Abdulrahman)
	{
		Mobil mobil = new Mobil()
		{
			public void injakPedalGas()
			{
			System.out.println("Mobil berjalan...");
			}
		};
			Kijang kijang = new Kijang();
			BMW bmw = new BMW();
			
			mobil.injakPedalGas();
			
			mobil = kijang;
			mobil.injakPedalGas();
			mobil = bmw;
			mobil.injakPedalGas();
	}
}