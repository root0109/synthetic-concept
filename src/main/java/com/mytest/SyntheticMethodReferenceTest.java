/**
 * 
 */
package com.mytest;

import java.util.function.Supplier;

import lombok.Data;

/**
 * @author vaibhav
 */
/**
 * @author singvai2
 *
 */
@Data
public class SyntheticMethodReferenceTest
{
	private static class Greeter
	{
		public static String sayHi()
		{
			return "Synthetic Hi!";
		}
	}

	public static void main(String[] args)
	{
		Supplier<String> supplierHi = Greeter::sayHi;
		System.out.println(supplierHi.get());
		System.out.println(supplierHi);
	}
}
