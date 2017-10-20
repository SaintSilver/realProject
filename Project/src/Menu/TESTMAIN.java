package Menu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TESTMAIN {

	public static void main(String[] args) {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String time = sf.format(new Date());
		
		String aa = time.substring(8,10);
		System.out.println(aa);

	}

}
