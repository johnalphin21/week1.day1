package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 12;
		boolean flag=false;
		for (int i =2; i<=a/2; i++) {
		if (a % i == 0) {
			flag = true;
			break;
		}
			
			
		} if (flag = false) {
			System.out.println("Prime number");
			
		} else {
System.out.println("not a prime number");
		}			
			
		}
		

	}

