// ternary and logical  operator , number prefixed with zero
class Tester
{
	public static void main(String s[])
	{
		int x=2,y=3;
		int r = (x>y)?x:y;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		System.out.println("r = " +r);
		System.out.println((x>2)&&(y>2));
 		System.out.println((x>2)||(y>2));
		int a=350;
		int b=0350; 
// numbers prefixed with 0 are evaluated based on octal number system
// b= 0*8^3+3*8^2+5*8^1+0*8^0 = 0*512+3*64+5*8+0*1 = 0+192+40+0 = 232
		System.out.println("a = " +a);
		System.out.println("b = " +b);

	}
}