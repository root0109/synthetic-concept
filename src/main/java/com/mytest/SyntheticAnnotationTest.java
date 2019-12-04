/**
 * 
 */
package com.mytest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import lombok.Data;

/**
 * @author vaibhav
 *
 */
@Data
public class SyntheticAnnotationTest
{
	@Retention(RetentionPolicy.SOURCE)
	@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE })
	public @interface Private
	{}

	@Private
	static String test = "SyntheticAnnotationTest";

	public static void main(String[] args)
	{
		System.out.println(test);
	}
}
