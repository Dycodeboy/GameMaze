package com.wzu.core.operation;

import java.awt.Point;
import java.util.Stack;

public interface MapOperation {
	public void initMap(int height,int width);
	public void resetMap();
	public Stack<Point> getStack(int x,int y);
}
