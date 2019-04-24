package com.nt;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSupplierFunctinalInterfaces {
	public static void main(String[] args) {
		IntSupplier s1 = () -> 10;
		System.out.println(s1.getAsInt());

		LongSupplier s2 = () -> 10;
		System.out.println(s2.getAsLong());

		DoubleSupplier s3 = () -> 10;
		System.out.println(s3.getAsDouble());

		BooleanSupplier s4 = () -> true;
		System.out.println(s4.getAsBoolean());
	}
}
