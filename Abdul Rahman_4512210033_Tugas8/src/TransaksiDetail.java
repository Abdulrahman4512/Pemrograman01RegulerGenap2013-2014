//created by: ABDUL RAHMAN
//data		: 19 Mei 2014

package latihan08a.bin;
import java.math.BigDecimal;

public class TransaksiDetail {
	private Barang barang;
	private Integer jumlah;
	
	public BigDecimal subtotal(){
		return barang.getHarga().multiply(new BigDecimal(jumlah));
	}
}