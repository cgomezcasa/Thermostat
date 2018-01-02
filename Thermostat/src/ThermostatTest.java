import static org.junit.Assert.*;

import org.junit.Test;

public class ThermostatTest {
	
	@Test
	public void test1() {
		Thermostat.up();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.HIGH));
		Thermostat.advance();
		assertTrue(Thermostat.getPartOfDay().equals(Thermostat.PartOfDay.SLEEP));
		Thermostat.up();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.HIGH));	
		Thermostat.down();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.LOW));
		Thermostat.down();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.LOW));
		Thermostat.advance();
		assertTrue(Thermostat.getPartOfDay().equals(Thermostat.PartOfDay.WAKE));
	}
	
	@Test
	public void test2() {
		Thermostat.down();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.LOW));
	}
	
	
	@Test
	public void test3() {
		Thermostat.advance();
		assertTrue(Thermostat.getPartOfDay().equals(Thermostat.PartOfDay.SLEEP));
		Thermostat.up();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.HIGH));	
		Thermostat.advance();
		assertTrue(Thermostat.getPartOfDay().equals(Thermostat.PartOfDay.WAKE));
		Thermostat.up();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.HIGH));
		Thermostat.down();
		assertTrue(Thermostat.getTemp().equals(Thermostat.temp.LOW));
	}
}
