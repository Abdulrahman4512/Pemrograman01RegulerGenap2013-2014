//created by: ABDUL RAHMAN
//data		: 10 Juni 2014

package praktikum10.bin;

public class MainPersegiPanjang
{
	public static void main(String[] Abdulrahman)
	{
		PersegiPanjang pp = new PersegiPanjang();
		pp.setPanjang(10);
		pp.setLebar(20);
		System.out.println("panjang : "+ pp.getPanjang());
		System.out.println("lebar : "+ pp.getLebar());
		System.out.println("luas : "+ pp.getLuas());
	}
}