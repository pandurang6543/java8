package com.nt;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateFunctinalInterfaces {
	public static void main(String[] args) {
		IntPredicate p1=i1->i1>10;
		System.out.println(p1.test(11));
		
		LongPredicate p2=i1->i1>10;
		System.out.println(p2.test(11));
		
		DoublePredicate p3=i1->i1>10;
		System.out.println(p3.test(11));

	}
}
