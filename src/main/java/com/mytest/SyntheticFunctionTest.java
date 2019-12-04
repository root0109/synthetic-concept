/**
 * 
 */
package com.mytest;

import java.util.function.Function;

import lombok.Data;

/**
 * @author vaibhav
 *
 */
@Data
public class SyntheticFunctionTest
{
	public static final Function<String, String> returnString = new Function<String, String>()
	{
		public String apply(String value)
		{
			return "Synthetic Function " + value;
		}
	};

	public static void main(String[] args)
	{
		System.out.println(returnString.apply("Test"));
	}
}
