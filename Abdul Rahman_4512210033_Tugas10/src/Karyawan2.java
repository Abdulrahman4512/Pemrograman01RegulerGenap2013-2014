//created by: ABDUL RAHMAN
//data		: 6 Juni 2014

package Latihan10d.bin;

public class Karyawan2 extends KomunitasPT2
{
	private int noKaryawan;
	private int Gapok;
	
	Karyawan2(String NAMA, String ALAMAT, String JK, int NOKARYAWAN, int GAPOK)
	{
		super(NAMA, ALAMAT, JK);
		noKaryawan = NOKARYAWAN;
		Gapok=GAPOK;
	}
	public void Tampilkan2()
	{
		super.Tampilkan3();
		System.out.println();
		System.out.println("Nomer Karyawan = " +noKaryawan);
		System.out.println("Gaji Pokok = " +Gapok);
	}
}