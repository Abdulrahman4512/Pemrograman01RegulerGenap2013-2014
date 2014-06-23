//created by: ABDUL RAHMAN
//data		: 22 Juni 2014

package latihan.bin;

import latihan.bin.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{
	
	public Integer tambah (int bil1, int bil2){
		return bil1 + bil2;
	}
	
	
	public Integer kurang (int bil1, int bil2){
		return bil1 - bil2;
	}
	
	
	public Integer kali (int bil1, int bil2){
		return bil1 * bil2;
	}
	
	
	public Integer bagi (int bil1, int bil2){
		return bil1 / bil2;
	}
}