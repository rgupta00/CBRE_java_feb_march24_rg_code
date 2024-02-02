package com.dp.structural.c.proxy;

public class MagicianProxy extends Magician{

	private Audiance audiance=new Audiance();

	@Override
	public void doMagic() {
		super.doMagic();
		audiance.clapping();
	}
	
	
}
