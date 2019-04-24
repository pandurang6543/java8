package com.nt;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.compose(f1).apply("Pandurang"));

		Consumer<String> c1 = s -> System.out.println(s + " First");
		Consumer<String> c2 = s -> System.out.println(s + " Second");
		c1.andThen(c2).accept("Pandurang");

		Predicate<String> p1 = s -> s.length() > 10;
		if (p1.test("Pandurang11")) {
			System.out.println("Success");
		}
		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());

		BiPredicate<Integer, Integer> p3 = (i1, i2) -> (i1 + i2) > 10;
		System.out.println(p3.test(1, 5));

		BiPredicate<Integer, Integer> p4 = (i1, i2) -> (i1 + i2) < 20;
		System.out.println(p4.test(1, 5));

		System.out.println(p3.and(p4).test(10, 11));

		BiFunction<Integer, Integer, Integer> f3 = (i1, i2) -> i1 + i2;
		Function<Integer, Integer> f4 = i -> i;
		System.out.println(f3.andThen(f4).apply(10, 20));

		BiConsumer<Integer, Integer> c3 = (i1, i2) -> System.out.println(i1 + "  " + i2);
		c3.accept(10, 20);

	}

}
