
public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
		    for(int j = 3-i;j<3;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j =(4-i);j>0;j--)
		    {
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
	}
}
