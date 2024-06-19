public class MathLib {

	//Declaration of global variables
		
	
	public static boolean isPrime(int value) {
		boolean b=true;
		for(int i=2;i<value;++i) {
			if(value%i==0) {
				b=false;
			}
		}
		return b;
	}
	
	
	public static StringBuffer getPrimes(int target) {
	
		StringBuffer sb = new StringBuffer();
		
		for(int i=2;i<target;++i) {
			if(isPrime(i)) {
				if(sb.toString().equals("")) {
				sb.append(i);	
				}else {
				sb.append(", "+i);
				}
			}
		}
		return sb;
	}
	public static void main(String[] args) {
	 	
     System.out.println(isPrime(15));
     System.out.println(getPrimes(20));
	}

}
