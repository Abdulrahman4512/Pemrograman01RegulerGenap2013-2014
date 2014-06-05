//created by: Abdul Rahman
//data		: 26 mei 2014

package Latihan09f.bin;

class Dosen extends Orang 
{
	private String NIDN = "";
	private String JJA = "";
	private float Honor;
	
	public Dosen (String NM, int UMR, String ALMT, String STS, String NT, String ND, String JA, float HN)
	{
		super(NM, UMR, ALMT, STS, NT);
		NIDN = ND;
		JJA  = JA;
		Honor= HN;
	}
	
	public void setNIDN(String ND)
	{
		this.NIDN = ND;
	}
	public void setJJA(String JA)
	{
		this.JJA = JA;
	}
	public void setHonor(float HN)
	{
		this.Honor = HN;
	}
	
	public String getNIDN()
	{
		return NIDN;
	}
	public String getJJA()
	{
		return JJA;
	}
	public float getHonor()
	{
		return Honor;
	}
	public String Disply()
	{
		return super.Disply() +"NIDN" +NIDN+"- JJA" +JJA+"-Gaji" +Honor;
	}
}