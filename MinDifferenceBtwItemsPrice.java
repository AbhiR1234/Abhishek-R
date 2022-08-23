package edu.jsp.heca48.programming;

	import java.util.*;

	public class MinDifferenceBtwItemsPrice 
	{

		public static void main(String[] args)
		{

			int array[] = { 7980, 22349, 999, 2799, 229900, 11101, 9999, 2195, 9800, 4999 };

			String items[] = { "MI Band: 999", "Sandwich Toaster: 2195", "Cult Pass: 2799", "Scale: 4999",
					"Fitbit Plus: 7980", "Microwave Oven: 9800", "Alexa: 9999", "Digital Camera: 11101", "IPods: 22349",
					"Macbook Pro: 229900" };

			int N = array.length;

			System.out.print("Enter the no of employees = ");
			Scanner s = new Scanner(System.in);
			int M = s.nextInt();
			int result = minDifference(array, N, M);
			s.close();

			System.out.println("\nNumber of the employees : " + M);

			int startindex = getAns(result, array, N, M);

			System.out.println("Here the goodies that are selected for distribution are:");

			for (int i = startindex; i < startindex + M; i++)
				System.out.println(items[i]);
			System.out
					.println("And the difference between the chosen goodies with highest price and the lowest price is:"
							+ result);
		}

		static int minDifference(int arr[], int n, int m) 
		{
			int ans = Integer.MAX_VALUE;
			Arrays.sort(arr);
			for (int i = 0; i <= n - m; i++)
	 ans = Math.min(ans, arr[i + m - 1] - arr[i]);
			return ans;
		}

		static int getAns(int res, int arr[], int n, int m) 
		{
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i <= n; i++) 
			{
				ans = Math.min(ans, arr[i + m - 1] - arr[i]);
				if (res == ans) return i;
			}
			return 0;
		}
	}
