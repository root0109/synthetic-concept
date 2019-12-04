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
public class SyntheticGenericTest<A extends CharSequence, B extends Date>
{
	public static void main(String[] args)
	{
		NestedClass<String, Date> nestedClass = new NestedClass<>();
		System.out.println(nestedClass.getData());
	}

	private static final class NestedClass<A, B>
	{
		private A	testA;
		private B	testB;

		private Object getData()
		{
			return getTestString() + "-" + getTestDate();
		}

		public A getTestString()
		{
			return testA;
		}

		public B getTestDate()
		{
			return testB;
		}
	}
}
