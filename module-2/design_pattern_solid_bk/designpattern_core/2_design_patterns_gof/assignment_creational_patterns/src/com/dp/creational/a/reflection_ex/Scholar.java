package com.dp.creational.a.reflection_ex;

public @interface Scholar {
	public String scholarType() default "BASIC";
	public boolean isScholar() default false;
}
