package com.demo2;

public class ProcessShape {

	public static void process(Shape shape) {
		shape.draw();
	}
	
	
	
//	public static void process(Object shape) {
//		if(shape instanceof CircleShape) {
//			((CircleShape) shape).drawCircle();
//		}else if(shape instanceof SquareShape) {
//			((SquareShape) shape).drawSquare();
//		}else if(shape instanceof TriangleShape) {
//			((TriangleShape) shape).drawTriangle();
//		}
//	}
}
