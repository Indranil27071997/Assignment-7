package Assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter runs Scored by: \nmunai:\nabc:\nleo:\ncr7:");
		for (int i = 1; i < array.length; i++)
			array[i] = scan.nextInt();

		map.put("munai", array[1]);
		map.put("abc", array[2]);
		map.put("leo", array[3]);
		map.put("cr7", array[4]);

		int maximimScore = 0, sum = 0;

		for (Map.Entry<String, Integer> me : map.entrySet()) {
			
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
			if (maximimScore < me.getValue()) {
				maximimScore = me.getValue();
			}
			sum = sum + me.getValue();
		}
		System.out.println("The total Score is: "+sum);
		System.out.println("The max run scored is"+ maximimScore);
		scan.close();
		
		

	}

}