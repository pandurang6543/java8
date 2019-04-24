package com.nt;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class PrimitiveConsumerFunctinalInterfaces {
public static void main(String[] args) {
	IntConsumer c1=(i1)->System.out.println(i1);
	c1.accept(10);
	
	LongConsumer c2=(i1)->System.out.println(i1);
	c2.accept(10);
	
	DoubleConsumer c3=(i1)->System.out.println(i1);
	c3.accept(10);
	
	ObjIntConsumer<String> c4=(s,i)->System.out.println("Name :"+s+" age :"+i);
	c4.accept("Pandurang", 25);
	
	ObjLongConsumer<String> c5=(s,i)->System.out.println("Name :"+s+" age :"+i);
	c5.accept("Pandurang", 25);
	
	ObjDoubleConsumer<String> c6=(s,i)->System.out.println("Name :"+s+" age :"+i);
	c6.accept("Pandurang", 25);
	
}
}
