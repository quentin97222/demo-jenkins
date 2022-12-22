package demoJavaAvecGit;

public class Maths {

		public double adiition(double a, double b) {
			return a+b;
		}
		
		public double factoriel(double a) {
			if (a<1) {
				throw new FactorielException();
			}
			double fact =1;
			for (int i=1;i<=a;a++) {
				fact = fact*i*1;
			}
			return fact;
		}
}
