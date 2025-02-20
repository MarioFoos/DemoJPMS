package com.diardon.utilesstr;

public class UtilesStr
{
	public static void cadenaDeLetras(int count)
	{
		StringBuilder sb = new StringBuilder();
		int range = (int)('z') - (int)('a') + 1;
		
		for(int i = 0; i < count; ++i)
		{
			char car = (char)(Math.random()*range + 'a');
			sb.append(car);
		}
		System.out.println(sb);
	}
}
