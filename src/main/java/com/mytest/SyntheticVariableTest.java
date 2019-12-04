/**
 * 
 */
package com.mytest;

import lombok.Data;

/**
 * @author vaibhav
 *
 */
@Data
public class SyntheticVariableTest
{
	public static void main(String[] args)
	{
		SyntheticVariableTest syntheticTest = new SyntheticVariableTest();
		NestedClass nestedClass = syntheticTest.new NestedClass();
		System.out.println(nestedClass.testString);
		System.out.println(nestedClass.getTestString());
	}

	private final class NestedClass
	{
		private String testString = "Synthetic Variable Test : ";

		public String getTestString()
		{
			return testString;
		}
	}
}
