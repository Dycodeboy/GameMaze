package com.wzu.core.beans;

import com.wzu.core.GameObject;
import com.wzu.core.Utils;
import com.wzu.core.operation.impl.ActorOperationImpl;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Actor extends GameObject{
	
//	private enum Direction {  
//        Left, Right, Up, Down  
//    };
	
	private static Actor instance = new Actor();

	private Actor(){
		
	}
	
	public static Actor getInstance() {
		return instance;
	}

	private int xCoordinate = 1;
	private int yCoordinate = 0;
	//private Direction direction = Direction.Down; 
	
	public int getxCoordinate() {
		return xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	private int actorImage = 0;
	
	@Override
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.RED);  
		gc.fillRoundRect(this.xCoordinate*Utils.ESIZE, this.yCoordinate*Utils.ESIZE
				, Utils.ESIZE, Utils.ESIZE, 60, 100);		
	}
	
	@Override
	public void update() {
		new ActorOperationImpl().autoFindWay();
	}

	@Override
	public void init() {
		this.xCoordinate = 1;
		this.yCoordinate = 0;
		this.setUpdate(false);
		this.setVisible(true);
	}

	public int getActorImage() {
		return actorImage;
	}

	public void setActorImage(int actorImage) {
		this.actorImage = actorImage;
	}

	public boolean moveLeft() {
		if(this.xCoordinate-1>=0 && MazeMap.getInstance().getMapPoint(this.xCoordinate-1, this.yCoordinate)){
			this.xCoordinate--;
			return true;
		}
		return false;
	}

	public boolean moveRight() {
		if(this.xCoordinate+1<MazeMap.getInstance().getMapWidth() && 
				MazeMap.getInstance().getMapPoint(this.xCoordinate+1, this.yCoordinate)){
			this.xCoordinate++;
			return true;
		}
		return false;
	}

	public boolean moveUp() {
		if(this.yCoordinate-1>=0 &&
				MazeMap.getInstance().getMapPoint(this.xCoordinate, this.yCoordinate-1)){
			this.yCoordinate--;
			return true;
		}
		return false;
	}

	public boolean moveDown() {
		if(this.yCoordinate+1<=MazeMap.getInstance().getMapHeight() && 
				MazeMap.getInstance().getMapPoint(this.xCoordinate, this.yCoordinate+1)){
			this.yCoordinate++;
			return true;
		}
		return false;
	}


}
