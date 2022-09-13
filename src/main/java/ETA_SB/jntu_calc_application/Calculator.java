package ETA_SB.jntu_calc_application;

public class Calculator {
	public double doAdd(double num1, double num2) {
		return num1 + num2;
	}

	public double doSub(double num1, double num2) {
		//comment line
		return num1 - num2;
	}

	public double doMul(double num1, double num2) {
		return num1 * num2;
	}

	public double doDiv(double num1, double num2) {
		return num1 / num2;
	}
	
	public double doPower(double num, int exp) {
		if (exp == 1) return 1.0;
		double half_power = doPower(num, exp / 2);
		if (exp % 2 == 0) return half_power * half_power;
		return num * half_power * half_power;
	}

}
