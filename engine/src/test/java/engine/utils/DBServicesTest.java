package engine.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DBServicesTest {
	@Test
	public void testSimpleSelect() {
		DBServices dbServices = new DBServices();
		assertTrue(dbServices.executeQuery("select * from role").size() > 0);
	}
}
