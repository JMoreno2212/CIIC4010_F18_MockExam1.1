public class QuadraticPolynomial {
    private double a; // quadratic coefficient
    private double b; // linear coefficient
    private double c; // constant coefficient
    //Getters
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
        // Setters
        public void setA(double a) { this.a = a; }
        public void setB(double b) { this.b = b; }
        public void setC(double c) { this.c = c; }
        //Constructors
        public QuadraticPolynomial(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
	    public QuadraticPolynomial(double abc) {
	    	this.a = abc;
	    	this.b = abc;
	    	this.c = abc;
	    			
	    }
	    public double eval(double x) {
            double result = (this.a * x * x) + (this.b * x) + this.c;
    return result;
	    }
	    public double discriminant() {
	    	double theDiscriminant = (this.b * this.b) - (4 * this.a * this.c);
	        return theDiscriminant;
	    }
	    public QuadraticPolynomial scale(double scalar) {
	    	double scalarA = this.a * scalar;
	    	double scalarB = this.b * scalar;
	    	double scalarC = this.c * scalar;
	        QuadraticPolynomial scalarPolynomial = new QuadraticPolynomial(scalarA, scalarB, scalarC); 
	    	return scalarPolynomial;
	    }
	    public QuadraticPolynomial add(QuadraticPolynomial p) {    
	    	double secondA = p.a;
	    	double secondB = p.b;
	    	double secondC = p.c;
	    	QuadraticPolynomial thePolynomial = new QuadraticPolynomial(this.a + secondA, this.b + secondB, this.c + secondC);
	        return thePolynomial;
	        
	    }
}