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
	/**
	 * Class constructor creating the total to start at 0 and
	 * keep track of further totals
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
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void add (int value) 
	{
		total += value;
	}
	
	/**
	 * Takes the current total and subtracts using the users input
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void subtract (int value) 
	{
		total -= value;
	}
	
	/**
	 * Takes the current total and multiplies using the users input
	 * 
	 * @param value		an integer that the user inputs
	 */
	public void multiply (int value) 
	{
		total *= value;
	}
	
	/**
	 * Takes the current total and divides it using the users input
	 * Will make total 0 if users divides by 0
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
	}
	
	/**
	 * Gets the history of the all the mathematical operations
	 * For now it will print an empty string
	 * 
	 * @return	an empty string
	 */
	public String getHistory () 
	{
		return "";
	}
}