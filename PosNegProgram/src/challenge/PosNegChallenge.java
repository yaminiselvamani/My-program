package challenge;

public class PosNegChallenge {
	public boolean posNeg(int a, int b, boolean value) {
		if(a*b==-1 && value==false)
			return true;
		else if(a==-1 && b==-1 && value==true)
			return true;
		else 
			return false;
	}
}
