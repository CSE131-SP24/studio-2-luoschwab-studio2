package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		int money = startAmount;
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		int gameCount = 0;
		for(int i = 1;i<=totalSimulations;i++) {
			while(money<winLimit&&money>0)
			{
				if(Math.random()>winChance)
				{
					money -=1;
					gameCount ++;

				}
				else
				{
					money +=1;
					gameCount ++;
				}
			}
			if(money==0) {
				System.out.println("Simulation "+i+": "+gameCount+" "+"lose");
			}
			else {
				System.out.println("Simulation "+i+": "+gameCount+" "+"win");
			}
			gameCount=0;
			money = startAmount;
		}

	}

}
