package bridgelabparticepogram;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int n = 20, firstTerm = 0, secondTerm = 1;
	       
	    System.out.println("Fibonacci Series Upto " + n + ": ");
	   
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
		    
}
}


	}


