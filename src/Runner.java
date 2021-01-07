
public class Runner {

	static int a;
	static int b;
	static int sum;
	static boolean sumCheck;
	
	public static int parameters() {
		
		if(sumCheck == true) {
			
			sum = a + b;
			
		}else {
			
			sum = a * b;
			
		}
		
		return sum;
		
	}
	
	public static void flowchart () {
		
		if(a>2000) {
			
			System.out.println("A");
			
			if(a>6000) {
				
				System.out.println("C");
				
			}else {
				
				System.out.println("B");
				
				if(a>4000) {
					
					System.out.println("D");
					
				}else {
					
					System.out.println("E");
					
				}
				
			}
			
		}else {
			
			System.out.println("1");
			
			if(a>100) {
				
				System.out.println("3");
				
				if(a>600) {
					
					System.out.println("5");
					
				}else {
					
					System.out.println("4");
					
					if(a>500) {
						
						System.out.println("6");
						
					}else {
						
						System.out.println("7");
						
					}
					
				}
				
			}else {
				
				System.out.println("2");
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		flowchart();

	}

}
