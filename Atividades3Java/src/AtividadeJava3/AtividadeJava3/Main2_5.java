package Java4;
import java.util.Date;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = "yyyy/MMMM/dd";
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern(date);
		System.out.println("yyyy/MMMM/dd-->"+dtf4.format(LocalDateTime.now()));
				
	}

}
