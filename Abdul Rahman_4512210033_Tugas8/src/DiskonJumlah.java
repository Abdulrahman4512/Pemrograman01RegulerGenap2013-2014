//created by: ABDUL RAHMAN
//data		: 19 Mei 2014

package latihan08a.bin;
import java.math.BigDecimal;

public class DiskonJumlah implements Diskon {
	private BigDecimal persentase;
	private BigDecimal nilaiMinimum;
	
	public BigDecimal hitung(Transaksi t){
		if(t.hitungTagihan().compareTo(nilaiMinimum) > 0)	{
			return persentase.multiply(t.hitungTagihan());
		}
		else	{
			return BigDecimal.ZERO;
		}
	}
}