
public class FizzBuzz {
	public static void main (String[] args){
		for (int i = 1; i < 101; i++ ){
			if(i%3 == 0 && i%5 == 0){
				String a = "FizzBuzz";
				System.out.println(a);
			}else if (i%3 == 0 && i%5 != 0){
				String b = "Fizz";
				System.out.println(b);
			}else if (i%5 == 0 && i%3 != 0){
				String c = "Buzz";
				System.out.println(c);
			}else 
				System.out.println(i);
			}
		}
	
	}

			
			