package third_week;

public class dowhileloop {
	/* There is a lonely monkey in the island
	 * He needs to eat 4 bababas every day
	 * there are just 165 bananas in that island
	 * create following variables and find how many days
	 * monkey can survive
	 * Use do while loop, increment and decrement and if statements
	 * int numbersOfBananas = 165, survivalDays = 1;
	 * boolean monkeyAlive = true;
	 */
	
	
	public static void main(String[] args) {
		int numbersOfBananas = 165, survivalDays = 1;
		boolean monkeyAlive = true;
		
		do {
			System.out.println("Monkey eats 4 bananas every day");
			numbersOfBananas -= 4;
			
			if(numbersOfBananas <= 0) {
				monkeyAlive = false;
				System.out.println("Today is day "+survivalDays+" and there is no more food for monkey and monkey is dead.");
			}else {
				survivalDays ++;
				System.out.println("Today is day "+survivalDays+" and Monkey is alive !");
			}
			
		}while(monkeyAlive);
		
		System.out.println("Today days monkey days monkey has survived : " + survivalDays);
	}

}
