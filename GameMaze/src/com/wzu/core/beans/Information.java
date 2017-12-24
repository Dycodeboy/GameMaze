package com.wzu.core.beans;

import com.wzu.core.GameObject;
import com.wzu.core.Utils;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Information extends GameObject {
	
	private static Information instance = new Information();
	
	public static Information getInstance() {
		return instance;
	}

	private Information() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillText("Instructions：\n"
				+ "Press 'R' to Automatic routing\n"
				+ "Press 'N' to Restart game\n"
				+ "Press 'S' to Open Maze's Fog\n"
				+ "Pink point:EndPoint", Utils.MAPWIDTH, 100);
//		gc.fillText("积分：" + getScore(), FFContants.WIDTH - 100, 40);
//		gc.fillText("P键暂停", FFContants.WIDTH - 100, 60);
//		gc.fillText("S键重新开始", FFContants.WIDTH - 100, 80);
	}

	@Override
	public void update() {
		
	}

}
