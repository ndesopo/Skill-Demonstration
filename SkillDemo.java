public class SkillDemo {
    //boolean method returns true if the right skills in the right order are used as arguments
	public static boolean goodEnoughSkills(String skill1, String skill2, String skill3) {
		if(skill1.equals("Can ssh and scp") && 
		   	skill2.equals("Can use github repositories") && 
		   		skill3.equals("Can create JUnit tests")) 
		{ return true; }
		return false;
	}
}