class Tester
{
	public static void main(String s[])
	{
		//int da[][]=new int[][]{{1,2,3,4},{1,3,5,7},{2,4,6,8}};
		int da[][]=new int[][]{{1,2,3,4},{1,3},{2}};
		int [][] dayno=new int[7][2];
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<4;c++)
			{
			System.out.print (da[r][c]+" ");
			}
			System.out.println("\n");
		}

	}
}