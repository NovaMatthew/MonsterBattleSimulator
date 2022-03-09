import java.util.Random;
import java.util.Scanner;

public class Monster 
{
	private String name;
	private double health, strength;
	
	
	
	public Monster()
	{
		this.name = "";
		this.health = 0.0;
		this.strength = 0.0;
	}
	
	public Monster(String name, double health, double strength)
	{
		this.name = name;
		this.health = health;
		this.strength = strength;
			
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getHealth() 
	{
		return health;
	}
	
	public double getStrength()
	{
		return strength;
	}
	
	public void setName (String name)
	{
		this.name = name;	
	}
	
	public void setHealth(double health)
	{
		this.health = health;
	}
	
	public void setStrength(double strength)
	{
		this.strength = strength; 
	}
	
	public void takeDamage(double damage)
	{
		health = health - damage;
	}
	
	public double attack()
	{

		
	double damage = Math.random() * strength;
	return damage;
		
	}
	
	public boolean isAlive()
	{
		if (health <= 0.0)
		{
		return false;
		}
		
		return true;
	}
	
	public String toString()
	{
		return (name + " (health: " + String.format("%.2f", health) + ", strength: " + String.format("%.2f", strength)+")");
	}
	
}
