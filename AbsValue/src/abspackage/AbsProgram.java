package abspackage;

public class AbsProgram {
	public boolean nearHundred(int n) {

		int value1 = 100 - n;
		int value2 = 200 - n;
		if (Math.abs(value1)<=10)
			return true;
		else if(Math.abs(value2) <= 10)
			return true;
		else
			return false;
	}
}
