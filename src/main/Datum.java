package main;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;
	
	public Datum()
	{
		int dag = 0;
		int maand = 0;
		int jaar = 0;
	}
	
	public Datum(int dag, int maand, int jaar)
	{
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	
	public boolean bestaatDatum(int dag, int maand, int jaar)
	{
		if ((dag >= 1) && (maand > 0 && maand <= 12) && (jaar >= 1900 && jaar <= 2100))
		{
			if (maand == 2 && jaar%4 == 0 && dag <= 29)
			{
				return true;
			} 
			if (maand == 2 && jaar%4 != 0 && dag <= 28)
			{
					return true;
			}
			if(maand == 1 || maand == 3 || maand == 5 || maand == 7 || maand == 8 || maand == 10 || maand == 12)
			{
				if(dag <= 31)
				{
					return true;
				}
			}
			else {
				if(dag <= 30)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public String getDatumAsString()
	{
		return Integer.toString(dag) + "-" + Integer.toString(maand) + "-" + Integer.toString(jaar);
	}
	
	public int getDag()
	{
		return dag;
	}
	
	public int getMaand()
	{
		return maand;
	}
	
	public int getJaar()
	{
		return jaar;
	}
}
