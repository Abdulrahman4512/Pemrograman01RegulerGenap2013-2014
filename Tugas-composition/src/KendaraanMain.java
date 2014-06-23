//created by: ABDUL RAHMAN
//data		: 22 Juni 2014

package latihan.bin;
public class KendaraanMain{
	public static void main(String[] Abdulrahman){
		Motor motor = new Motor();
		Mobil mobil = new Mobil();
		
		motor.jumping();
		System.out.println("Roda motor : " + motor.roda);
		mobil.mundur();
		System.out.println("Roda mobil : " + mobil.roda);

	}
}