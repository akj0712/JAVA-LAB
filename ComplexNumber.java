//Java Program to add or subtract two complex number

class CN{
	double r, i;
	
	CN(){
		r = 0;
		i = 0;
	}
	
	CN(double var){
		r = var;
		i = 0;
	}
	
	CN(double var1, double var2){
		r = var1;
		i = var2;
	}
	
	CN(CN obj){
		r = obj.r;
		i = obj.i;
	}
	
	void add(CN obj1, CN obj2) {
		r = obj1.r + obj2.r;
		i = obj1.i + obj2.i;
		System.out.print("Sum: "+r+" + i"+i);
	}
	
	void sub(CN obj1, CN obj2) {
		r = obj1.r - obj2.r;
		i = obj1.i - obj2.i;
		System.out.print("\nDifference: "+r+" - i"+i);
	}
}



public class ComplexNumber {

	public static void main(String[] args) {
		CN C1 = new CN();
		CN C2 = new CN(10);
		CN C3 = new CN(20, 30);
		CN C4 = new CN(C1);
		C1.add(C1, C2);
		C2.sub(C3, C4);
	}

}
