package recapDemo1;

public class Main {

	public static void main(String[] args) {
	int num1=56;
	int num2=89;
	int num3=23;
	int theBiggest=num1;
	if (theBiggest<num2) {
		theBiggest=num2;
	}
	if (theBiggest<num3) {
		theBiggest=num3;
	}
    System.out.println("The biggest is=" +theBiggest);
	}
	
}
