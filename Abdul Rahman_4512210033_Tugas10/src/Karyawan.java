//created by: ABDUL RAHMAN
//data		: 6 Juni 2014

package Latihan10c.bin;

public class Karyawan extends KomunitasPT
{
	private int noKaryawan;
	private int Gapok;
	
	Karyawan(String NAMA, String ALAMAT, String JK, int NOKARYAWAN, int GAPOK)
	{
		super(NAMA, ALAMAT, JK);
		noKaryawan = NOKARYAWAN;
		Gapok=GAPOK;
	}
	public void Tampilkan2()
	{
		System.out.println("Nomer Karyawan = " +noKaryawan);
		System.out.println("Gaji Pokok = " +Gapok);
	}
}