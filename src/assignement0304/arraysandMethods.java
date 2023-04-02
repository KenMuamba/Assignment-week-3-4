package assignement0304;

public class arraysandMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1.a
		int[] ages= {3, 9, 23, 64, 2, 8, 28, 93, 90};
		int newAges = ages[ages.length-1]-ages[0];
		
		System.out.println(newAges);
// 1.b
		System.out.println(newAges);
		
		//1.c first, initialize the integer with value "0"
		int totalAges = 0;
		for (int i: ages) {
			totalAges+= i;
		}
		
		double averageAges = (double) totalAges / ages.length; 
		System.out.println("The average age is: " + averageAges);
		
//2.a
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//first, initialize the integer with value "0"
		int totalNumberOfLetter = 0;
		for (String name : names) {
			totalNumberOfLetter+= name.length();
			
		}
		double averageNumberOfLetter = (double) totalNumberOfLetter / names.length;
		System.out.println("The average number of letter is: " + averageNumberOfLetter);
		
// 2.b
		
		String concatinatedNames = " ";
		for (String name : names) {
			concatinatedNames+= name + " ";
		
		}
		
		System.out.println(concatinatedNames);
		//3.
		// to find the last element
			//int nameOfArray = nameOfArray[nameOfArray.length-1; 
	//4.
		//to find the first element
		    // int nameOfArray = nameOfArray[0];
		
	//5.
			int[] nameLengths = new int [names.length];
			
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();	
		 
					
	    }
	//6.
			int sumofelements = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sumofelements += nameLengths[i];
		}
			
			System.out.println("The Sum of elements: " + sumofelements);
			
	
	    }
	//7.
			public static String concatenateWord(String word, int n) {
				String result = "";
			for (int i=0; i<n; i++) {
				result += word;
		}
		    return result;
}	
	
	//8.
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
			
		}
		
	//9. 
		public static boolean intsArray(int[] nums) {
			int sum = 0;
			for (int num : nums) {
				sum += num;
			}
			return sum > 100;
		}
		
	// 10.
		public static double avgElements(double[] nums) {
			double sum = 0;
			for  (double num : nums) {
				sum += num;
			}
			
			return sum / nums.length;
			
		}
		
		
	// 11.
		public static boolean doubleArray(double[] first, double[] second) {
			int totalfirst = 0;
			int totalsecond = 0;
			for (double i : first) {
				totalfirst += i;
			}
			for (double i : second) {
				totalsecond += i;
			}
			double averageFirst = (double) totalfirst/first. length;
			double averageSecond = (double)totalsecond/second.length;
			 return averageFirst > averageSecond;
		}
		
	//12.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
	
		}
			
		
	//13.
		public static boolean pizzaSlice(double slice) {
			if (slice < 1.99) {
				return true;
			} else {
				return false;
			}
		}	
			
			
			
		}	
