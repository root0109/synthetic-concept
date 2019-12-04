/**
 * 
 */
package com.mytest;

import java.util.Date;

import lombok.Data;

/**
 * @author vaibhav
 *
 */
@Data
public class SyntheticTest
{
	public static void main(String[] args)
	{
		SyntheticTest syntheticTest = new SyntheticTest();
		NestedClass nestedClass = syntheticTest.new NestedClass();
		System.out.println(nestedClass.testString);
		System.out.println(nestedClass.getTestString());
		System.out.println(nestedClass.getData());
		System.out.println(nestedClass.getData1());
	}

	private final class NestedClass
	{
		private String	testString	= "Synthetic Nested Class : ";
		private Date	testDate	= new Date();

		private String getData()
		{
			return (testString + testDate);
		}

		private String getData1()
		{
			return (getTestString() + getTestDate());
		}

		public String getTestString()
		{
			return testString;
		}

		public Date getTestDate()
		{
			return testDate;
		}
	}
}
