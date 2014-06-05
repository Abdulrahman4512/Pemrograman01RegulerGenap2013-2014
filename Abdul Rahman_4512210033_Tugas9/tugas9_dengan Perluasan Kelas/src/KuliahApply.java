//created by: Abdul Rahman
//data		: 26 mei 2014

package Latihan09f.bin;
public class KuliahApply
{
	public static void main(String[] Abdul_Rahman)
	{
		Dosen DOS = new Dosen("EDY", 30, "Depok", "Menikah", "006", "03","Lektor Kepala",1500000);
		Mahasiswa MH = new Mahasiswa("Nadia",20,"Jakarta","Mahasiswa","4512210033", "2012",3);
		
		System.out.println(DOS.Disply());
		System.out.println(MH.Disply());
	}
}