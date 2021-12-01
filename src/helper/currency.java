
package helper;

import java.text.NumberFormat;
import java.util.Locale;

public class currency {
    public static String toCurrency(double tienTe){
        Locale lc = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
        return nf.format(tienTe);
    }
    
    public static int toInt(String tienTe){
        String x = "";
        for (int i = 0; i < tienTe.length(); i++) {
            if(!tienTe.substring(i,i+1).equals(".") && !tienTe.substring(i,i+1).equals("đ") && !tienTe.substring(i,i+1).equals(" ")){
                x += tienTe.substring(i,i+1);
            }
        }
        return Integer.parseInt(x);
    }
}
