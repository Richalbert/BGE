package comm.phdareys.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {
	public String getCurrentDate() {
		Date today = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");
		return formater.format(today);
	}
}
