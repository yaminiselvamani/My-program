package abspackage;

public class AbsMain {

	public static void main(String[] args) {
		AbsProgram absprogram = new AbsProgram();

		boolean expected1 = true;
		boolean expected2 = false;
		boolean expected3 = true;
		boolean expected4 = true;
		boolean expected5 = false;
		boolean expected6 = false;
		boolean expected7 = true;
		boolean expected8 = true;
		boolean expected9 = false;
		boolean expected10 = false;

		boolean result1 = absprogram.nearHundred(93);
		boolean result2 = absprogram.nearHundred(89);
		boolean result3 = absprogram.nearHundred(110);
		boolean result4 = absprogram.nearHundred(209);
		boolean result5 = absprogram.nearHundred(250);
		boolean result6 = absprogram.nearHundred(211);
		
		//Boundary cases
		boolean result7 = absprogram.nearHundred(100);
		boolean result8 = absprogram.nearHundred(200);
		boolean result9 = absprogram.nearHundred(0);
		boolean result10 = absprogram.nearHundred(-100);
		
		if (expected1 == result1)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected2 == result2)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected3 == result3)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected4 == result4)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected5 == result5)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected6 == result6)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected7 == result7)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected8 == result8)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected9 == result9)
			System.out.println("pass");
		else
			System.out.println("fail");
		if (expected10 == result10)
			System.out.println("pass");
		else
			System.out.println("fail");
	
	}
}
