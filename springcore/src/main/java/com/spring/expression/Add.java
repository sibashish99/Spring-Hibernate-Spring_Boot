package com.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Add{
	
	@Value("#{23+8}")
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Add [x=" + x + ", y=" + y + "]";
	}

}
