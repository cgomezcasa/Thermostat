public class Thermostat 
{	
	
	public enum Temp {
		LOW, HIGH
	}
	
	public enum PartOfDay {
		WAKE, SLEEP
	}
	
	static Temp temp = Temp.LOW;
	static PartOfDay partOfDay = PartOfDay.WAKE;
	
	public static void up()
	{
		temp = Temp.HIGH;
	}
	
	public static void down()
	{
		temp = Temp.LOW;
	}
	
	public static void advance()
	{
		if (partOfDay == PartOfDay.WAKE){
			partOfDay = PartOfDay.SLEEP;
		}else {
			partOfDay = PartOfDay.WAKE;
		}
	}
	
	public static Temp getTemp(){
		return temp;
	}
	
	public static PartOfDay getPartOfDay(){
		return partOfDay;
	}
}
