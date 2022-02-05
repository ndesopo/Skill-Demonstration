import static org.junit.Assert.*;
import org.junit.*;
//necessary JUnit imports

public class SkillDemoTest {
	@Test
	public void testGoodEnoughSkills() { //assertTrue test will pass if the boolean method returns true, will fail if it returns false
		assertTrue("Should be able to show the skills required for the skill demonstration", 
			SkillDemo.goodEnoughSkills("Can make eggs", "Can ride a bike", "Can play chess"));
		// Fails at first, correct skills:
		// "Can ssh and scp", "Can use github repositories", "Can create JUnit tests"
	}
}