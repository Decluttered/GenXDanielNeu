package Referenznummern;

public class Refereznummern {
	
	public static int Referenznummer()
	{
		int minimum = 111111;
		int maximum = 999999;
		// TODO Auto-generated method stub
		int x = (int) ((Math.random() * (maximum - minimum)) + minimum);
		System.out.println(x);
		
		return x;
	}

	public static void main(String[] args) {
		
		
		Referenznummer();
	}

}
