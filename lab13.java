package lab13;
import java.util.*;
import java.io.*;

public class lab13 
{
		ArrayList<Integer> list = new ArrayList<>();
		public void readData(String filename)
		{
			try
			{
				BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
				String inn;
				while((inn = input.readLine()) != null);
				{
					list.add(Integer.parseInt(inn.trim()));
				}
				input.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
				System.exit(0);
			}
		}
		
		public long getTotalCount()
		{
			return list.stream().count();
		}
		
		public long getOddCount()
		{
			return list.stream().filter(x -> x % 2 == 1).count();
		}
		
		public long getEvenCount()
		{
			return list.stream().filter(x -> x% 2 == 0).count();
		}
		public long getDistinctGreaterThanFiveCount()
		{
			return list.stream().filter(x -> x > 5).distinct().count();
		}
		
		public Integer[] getResult1()
		{
			return list.stream().filter(x -> x % 2 == 0).filter(x -> x > 5 && x < 50).sorted().toArray(Integer[] :: new);
		}
		public Integer[] getResult2()
		{
			return list.stream().limit(50).map(x -> (x*x) * 3).toArray(Integer[] :: new);
		}
		public Integer[] getResult3()
		{
			return list.stream().filter(x -> x % 2 == 1).map(x -> x * 2).sorted().skip(20).distinct().toArray(Integer[] :: new);
		}
	}

	

