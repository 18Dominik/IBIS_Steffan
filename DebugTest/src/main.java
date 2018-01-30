
public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int p= 30;	 
		long pow = sumpowthree(p);
		//System.out.println(pow3(3));
		System.out.println(sumpowthree(p));

		
		//int i = sumpowthree(3,p);
		//System.out.println(i);
		
		//int p= 5;	 
		//int i = sumPowThree(3,2);
		}

	
	
	public static long pow3 (int k){
		long res = 1;
		for(int i = 0; i < k; i++) {
			res=res*3;
		}
		return res;
	}
	
	
	public static long sumpowthree ( int k){
		long res = 0;
		for(int i = 0; i <= k; i++) {
			
			res = res + pow3( i);
		}
		return res;
		
	}
	
	
	}
	


