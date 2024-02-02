package com.dp.structural.c.proxy;

public class Main {

	public static void main(String[] args) {
		Magician magician=new MagicianProxy();
		magician.doMagic();
	}
}
