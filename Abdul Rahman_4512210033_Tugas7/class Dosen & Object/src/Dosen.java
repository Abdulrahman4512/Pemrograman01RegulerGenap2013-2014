//created by: ABDUL RAHMAN
//data		: 3 Mei 2014

//Perintah Class & Object - Dosen
package Latihan06c.sesi1.bin;

public class Dosen
{
	String nama;
	String email;
	
	public Dosen(String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	
	public Dosen(){}
	
	public void info()
	{
		System.out.println("Nama Dosen	: " +nama);
		System.out.println("Email Dosen	: " +email);
		System.out.println();
		System.out.println();
	}
}