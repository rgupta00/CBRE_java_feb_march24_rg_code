package com.demo;

public class EngineFactory {

	public static Engine getEngine() {
		return new TurboEngine();
	}
}
