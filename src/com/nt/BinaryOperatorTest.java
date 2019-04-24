package com.nt;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperator<String> b1 = (s3, s4) -> s3 + s4;
		System.out.println(b1.apply("Hello ", "Pandurang !!"));

		IntBinaryOperator b3 = (i1, i2) -> i1 + i2;
		System.out.println(b3.applyAsInt(10, 20));

		LongBinaryOperator b4 = (i1, i2) -> i1 + i2;
		System.out.println(b4.applyAsLong(10, 20));

		DoubleBinaryOperator b5 = (i1, i2) -> i1 + i2;
		System.out.println(b5.applyAsDouble(10, 20));
	}
}
