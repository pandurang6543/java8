package com.nt;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
public static void main(String[] args) {
	UnaryOperator<String> u1=s->s.concat(" Hello !!");
	System.out.println(u1.apply("Pandurang"));
	
	IntUnaryOperator u2=i1->i1+10;
	System.out.println(u2.applyAsInt(10));
	
	LongUnaryOperator u3=i1->i1+20;
	System.out.println(u3.applyAsLong(10));
	
	DoubleUnaryOperator u4=i1->i1+30;
	System.out.println(u4.applyAsDouble(10));
}
}
