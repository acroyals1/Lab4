/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class Car {
    private int Speed = 0;
	private String Make = "Chevy";
	private int yearModel = 2000;
		
	public Car (String n, int Model)
	{	
		Make = n;
		yearModel = Model; 
	}
	
	public int getyearModel ()
	{
		return yearModel;
	}
	
	public String getMake ()
	{
		return Make;
	}
	
	public int getSpeed ()
	{
		return Speed;
	}	
		
	public void accelerate ()
	{
		if (Speed !=90)
			Speed = Speed +5;
	}
	
	public void brake ()
	{
		if (Speed !=0)
			Speed = Speed -5;
	}
}
