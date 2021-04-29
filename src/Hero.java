/**
 * Class representing a superhero
 * @author timmy
 *@version 2019-1-17
 */
public class Hero 
{
	/**
	 * Name of the superhero, capitalized
	 */
	private String name;
	
	/**
	 * Statistics about the superhero
	 * -Height
	 * -Weight
	 * -BMI
	 */
	private String[] stats;
	/**
	 * Constructor for the Hero class. 
	 * Takes in informaitno and stores it in the variables.
	 * 
	 * @param informaiton Input string of the formant:
	 * "Name/Height/Weight"
	 */
	public Hero(String informaiton)
	{
		//Split the input string:
		String[] temp = informaiton.split("/");
		
		//Assign inputs to variables:
		name = temp[0].toUpperCase();
		
		stats = new String[3];
		stats[0] = temp[1];
		stats[1] = temp[2];
		
		//Calculate and store the BMI:
		double height = Double.parseDouble(temp[1]);
		double weight = Double.parseDouble(temp[2]);
		double bmi = weight / (height * height) * 10000;
		stats[2] = "" + bmi;
	}
	
	/**
	 * toString for Hero class. Returns a string of the format:
	 * "Name: (name), Height: (height), Weight: (weight), BMI: (bmi)"
	 */
	public String toString()
	{
		return String.format("Name: %s, Height: %s, Weight: %s, BMI: %s", name, stats[0], stats[1], stats[2]);
	}
}
