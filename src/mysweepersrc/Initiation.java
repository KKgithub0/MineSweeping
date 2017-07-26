package mysweeperframe;

import java.util.Random;

public class Initiation {

	
	
	Random r = new Random();
	
	public  int  Init(int t[][])
	{
	
		
	int a = 0; 
	int b = 0;
		for(int i=0;i<18;)
		{
			a =r.nextInt(17);
			b =r.nextInt(17);
			if(t[a][b]!=9)
			{
				t[a][b]=9;
				i++;
			}
		}
		
		
		return 0;
			
	}
}
