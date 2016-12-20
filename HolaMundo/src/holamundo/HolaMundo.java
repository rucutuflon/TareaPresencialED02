package holamundo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola Mundo");
		
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Hora: "+hourFormat.format(date));
	
	}

}
