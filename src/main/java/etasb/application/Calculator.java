package etasb.application;

public class Calculator {
	public double doAdd(double a, double b) {
		return a + b;
	}

	public double doSub(double a, double b) {
		return a - b;
	}

	public double doMul(double a, double b) {
		return a * b;
	}

	public double doDiv(double a, double b) {
		return a / b;
	}
	
	public double doPower(double n, int exp) {
		if (exp == 0) return 1.0;
		double halfPower = doPower(n, exp / 2);
		if (exp % 2 == 0) return halfPower * halfPower;
		return n * halfPower * halfPower;
	}

}
