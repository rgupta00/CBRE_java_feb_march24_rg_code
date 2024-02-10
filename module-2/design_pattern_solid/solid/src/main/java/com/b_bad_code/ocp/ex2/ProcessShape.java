package com.b_bad_code.ocp.ex2;

public class ProcessShape {
	public static void process(Object shape) {
		if(shape instanceof CircleShape) {
			((CircleShape) shape).drawCircle();
		}else if(shape instanceof SquareShape) {
			((SquareShape) shape).drawSquare();
		}else if(shape instanceof TriangleShape) {
			((TriangleShape) shape).drawTriangle();
		}
	}
}
