package test02;

import java.util.Calendar;

public class DayFactory {
	
	//ApplicationContext에 bean을 등록하기 위해서는 Factory method, static 이어야 함.
	
	public static Week getInstance() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (day) {
		case 1: return new Sunday();
		case 2: return new Monday();
		case 3: return new Tuesday();
		case 4: return new Wensday();
		case 5: return new Thursday();
		case 6: return new Friday();
		case 7: return new Saturday();
		default: throw new RuntimeException("먼가....잘못됨...");
		}
	}
}
