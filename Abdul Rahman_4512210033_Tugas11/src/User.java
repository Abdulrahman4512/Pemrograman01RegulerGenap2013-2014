package Praktikum11a.bin;
class User
{
	public static void main(String[] Alfian)
	{
		TV02 tv02 = new TV02();
		TV01 tv01 = new TV01();
		Remote RM = new Remote();
		
		RM.PerintahTV(Remote.PINDAHLINE, tv01, 4);
		RM.PerintahTV(Remote.VOLBESAR, tv01, 10);
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE, tv02, 2);
		RM.PerintahTV(Remote.VOLKECIL, tv02, 3);	
	}
}
