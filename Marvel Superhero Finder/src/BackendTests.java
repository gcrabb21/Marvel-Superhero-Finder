import java.lang.reflect.Method;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class BackendTests {
	APIConnection b; 
	
	@Before 
	public void setUp() {
		b = new APIConnection(); 
	}
	
//	@Test
//	public void constructURLTest() {
//		String expected = "08761489ec308dcf9d9ffc2f325cb15c"; 
//		Backend b = new Backend(); 
//		try {
//			Class c = b.getClass(); 
//			Method method = c.getDeclaredMethod("generateHashKey", null); 
//			method.setAccessible(true);
//			Object res = method.invoke(b, null); 
//			Assert.assertEquals(expected, res);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
