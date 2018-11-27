package d;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDe {
	public static void main(String[] args) {
		//Double a = 1.0E-4;
		Double b =199.00;
		//BigDecimal bd = new BigDecimal(a); 
		DecimalFormat df = new DecimalFormat("#0.000");
        //System.out.println(bd);
		System.out.println(df.format(b));
	}

}
