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
public class SyntheticAnonymousTest
{
	interface Callback<T>
	{
		String call(T value);
	}

	public static void main(String[] args)
	{
		System.out.println(new Callback<String>()
		{
			@Override
			public String call(String value)
			{
				return ("Synthetic Anonymous " + value);
			}
		}.call("Test"));

	}
}
