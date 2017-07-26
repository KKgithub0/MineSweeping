package mysweeperframe;


public class Sweep {
	
	public int show(int m,int n,int t[][]){
		int num = 0;
		if(t[m][n]!=9)
		{
		if(m>=1&&m<17&&n>=1&&n<17)
		{
			for(int i=m-1;i<m+2;i++)
				for(int j=n-1;j<n+2;j++)
				{
					if(t[i][j]==9)
					{
						num++;
					}
						
				}
		}
		if(m==0&&n==0)
		{
			if(t[1][0]==9) num++;
			if(t[1][1]==9) num++;
			if(t[0][1]==9) num++;
		}
		if(m==17&&n==0)
		{
			if(t[16][0]==9) num++;
			if(t[16][1]==9) num++;
			if(t[17][1]==9) num++;
		}
		if(m==0&&n==17)
		{
			if(t[0][16]==9) num++;
			if(t[1][16]==9) num++;
			if(t[1][17]==9) num++;
		}
		if(m==17&&n==17)
		{
			if(t[17][16]==9) num++;
			if(t[16][16]==9) num++;
			if(t[16][17]==9) num++;
		}
		if(m==0&&n>0&&n<17)
		{
			for(int i = m;i<m+2;i++)
				for(int j=n-1;j<n+2;j++)
					if(t[i][j]==9)
					{
						num++;
					}
		}
		if(m==17&&n>0&&n<17)
		{
			for(int i=m-1;i<m+1;i++)
				for(int j=n-1;j<n+2;j++)
					if(t[i][j]==9)
					{
						num++;
					}
		}
		if(n==0&&m>0&&m<17)
		{
			for(int i=m-1;i<m+2;i++)
				for(int j=n;j<n+2;j++)
					if(t[i][j]==9)
					{
						num++;
					}
		}
		if(n==17&&m>0&&m<17)
		{
			for(int i=m-1;i<m+2;i++)
				for(int j=n-1;j<n+1;j++)
					if(t[i][j]==9)
					{
						num++;
					}
		}
		if(num!=0) return num;
		else return 10;
		}
		else return 9;
		
	}
	
}
