package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,sum;
		System.out.println(+a +b);
			for (int i = 2; i <= 8; i++) {
				sum=a+b;
				//sum=0+1=1
				a=b;
				
				b=sum;
				
				System.out.println(sum);
				
				
			}
			
			
			
		}

	}

  