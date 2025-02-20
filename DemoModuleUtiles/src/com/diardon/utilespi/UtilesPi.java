package com.diardon.utilespi;

public class UtilesPi
{
	public static void multiplosDePi(int count)
	{
		StringBuilder sb = new StringBuilder("{");
		
		for(int i = 1; i < count; ++i)
		{
			sb.append(String.format("%.2f, ", Math.PI*i));
		}
		sb.append(String.format("%.2f}", Math.PI*count));

		System.out.println(sb);
	}
}
