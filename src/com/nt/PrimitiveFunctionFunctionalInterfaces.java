package com.nt;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class PrimitiveFunctionFunctionalInterfaces {
	public static void main(String[] args) {
		IntFunction<String> f1 = i -> i + " Hello";
		System.out.println(f1.apply(10));

		LongFunction<String> f2 = i -> i + " Hello";
		System.out.println(f2.apply(10));

		DoubleFunction<String> f3 = i -> i + " Hello";
		System.out.println(f3.apply(10));

		ToIntFunction<String> f4 = s -> s.length();
		System.out.println(f4.applyAsInt("Pandurang"));
		
		ToLongFunction<String> f5 = s -> s.length();
		System.out.println(f5.applyAsLong("Pandurang"));
		
		ToDoubleFunction<String> f6 = s -> s.length();
		System.out.println(f6.applyAsDouble("Pandurang"));
	
		IntToLongFunction f7=i->i;
		System.out.println(f7.applyAsLong(10));

		IntToDoubleFunction f8=i->i;
		System.out.println(f8.applyAsDouble(10));
		
		LongToIntFunction f9=i->(int)i;
		System.out.println(f9.applyAsInt(10));
		
		LongToDoubleFunction f10=i->i;
		System.out.println(f10.applyAsDouble(10));
		
		DoubleToIntFunction f11=i->(int)i;
		System.out.println(f11.applyAsInt(10));
		
		DoubleToLongFunction f12=i->(long)i;
		System.out.println(f12.applyAsLong(10));
		
		ToIntBiFunction<String, String> f13=(s1,s2)->s1.length()+s2.length();
		System.out.println(f13.applyAsInt("Pandurang", "Mane"));
		
		ToLongBiFunction<String, String> f14=(s1,s2)->s1.length()+s2.length();
		System.out.println(f14.applyAsLong("Pandurang", "Mane"));
		
		ToDoubleBiFunction<String, String> f15=(s1,s2)->s1.length()+s2.length();
		System.out.println(f15.applyAsDouble("Pandurang", "Mane"));
	}
}
