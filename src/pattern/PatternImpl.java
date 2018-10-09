package pattern;

public class PatternImpl {

	public static void main(String[] args)
	{
		//pattern
		System.out.println("1st pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.println(" ");
		}
		System.out.println("2nd pattern");
		for(int i=0;i<5;i++)
		{
			for(int k=5;k>i+1;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("3rd pattern");
		System.out.println();
		System.out.println("4th pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		//		System.out.println("5th pattern");
		//		int j=0;
		//		for(int i=1;i<=5;i++)
		//		{
		//			for(;j<=i+1;j++)
		//			{
		//				System.out.print(i+j);
		//			}
		//			System.out.println(" ");
		//		}
		System.out.println();
		System.out.println("5th pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("6th pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		for(int i=4;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("7th pattern");
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}

			System.out.println(" ");
		}
		//System.out.println("1");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
				System.out.println("8th pattern 4 copy");
				for(int i=5;i>=1;i--)
				{
					for(int j=i;j>=1;j--)
					{
						System.out.print(" "+j);
					}
		
					System.out.println(" ");
				}
				for(int i=1;i<=5;i++)
				{
					for(int j=i;j<=i && j!=0;j--)
					{
						System.out.print(" "+j);
					}
					System.out.println(" ");
				}
		System.out.println();
		System.out.println("9th pattern");
		int d=0,c=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j<=c && j!=d;j--)
			{
				System.out.print(" "+j);
			}
			d++;
			System.out.println(" ");

		}
		System.out.println();
		System.out.println("10th pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=5,l=1;l<=i;l++,j--)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");			
		}
		System.out.println();
		System.out.println("11th pattern");
		for(int i=5;i>=1;i--)
		{
			for(int j=1,l=1;l<=i;l++,j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");	
		}
		System.out.println();
//		System.out.println("12th & 9th copy pattern");
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=i+1;j>=i;j--)
//			{
//				System.out.print(" "+j);
//			}
//			System.out.println(" ");
//		}


	}

}
