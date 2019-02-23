package cse360assign2;
/**
 * Student Name: Brian Trang
 * Class ID: 567
 * Description: Calculator.java gets the total, does addition, 
 * subtraction, multiplication, division, and gets the history 
 * of the mathematical operations
*/

public class Calculator 
{

	private int total;
	private String history = "0";
	
	/**
	 * Class constructor to instantiate the total to start at 0 
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total which can later be printed out 
	 * 
	 * @return	the total which for now is 0
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Takes the current total and adds using the users input
	 * Updates the history string afterward
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void add (int value) 
	{
		total += value;
		
		history += " + " + value;
	}
	
	/**
	 * Takes the current total and subtracts using the users input
	 * Updates the history string afterward
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void subtract (int value) 
	{
		total -= value;
		
		history += " - " + value;
	}
	
	/**
	 * Takes the current total and multiplies using the users input
	 * Updates the history string afterward
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void multiply (int value) 
	{
		total *= value;
		
		history += " * " + value;
	}
	
	/**
	 * Takes the current total and divides it using the users input
	 * Will make total 0 if users divides by 0
	 * Updates the history string afterward
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
		
		history += " / " + value;
	}
	
	/**
	 * Gets the history of the all the mathematical operations
	 * For now it will print an empty string
	 * 
	 * @return	the string "history" that has all the mathematical operations
	 */
	public String getHistory () 
	{
		return history;
	}
}