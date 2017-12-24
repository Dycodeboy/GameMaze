package com.wzu.core.screen;

import com.wzu.core.GameScreen;
import com.wzu.core.beans.Actor;
import com.wzu.core.beans.Information;
import com.wzu.core.beans.MazeMap;
import com.wzu.core.beans.ShortestPath;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainCanvas extends GameScreen {

	private MazeMap myMap = MazeMap.getInstance();
	private Actor myActor = Actor.getInstance();
	private Information myInf = Information.getInstance();
	private ShortestPath sPath = ShortestPath.getInstance();
	

	public MainCanvas(double width, double height) {
		super(width, height);
		
		addObject(myMap);
		addObject(sPath);
		addObject(myActor);
		addObject(myInf);

		mGameState = GameState.GAME_START;
	}

	@Override
	public void onKeyPressed(KeyEvent event) {
		super.onKeyPressed(event);
		KeyCode tmpCode = event.getCode();
		if(mGameState == GameState.GAME_START){
			if (tmpCode == KeyCode.UP){
				myActor.moveUp();
			}else if(tmpCode == KeyCode.DOWN){
				myActor.moveDown();
			}else if(tmpCode == KeyCode.LEFT){
				myActor.moveLeft();
			}else if(tmpCode == KeyCode.RIGHT){
				myActor.moveRight();
			}
		}
	}

	@Override
	public void onKeyReleased(KeyEvent event) {
		super.onKeyReleased(event);
		KeyCode tmpCode = event.getCode();
		if(tmpCode==KeyCode.P){
			if (mGameState == GameState.GAME_START) {
				mGameState = GameState.GAME_PAUSE;
			}else{
				mGameState = GameState.GAME_START;
			}
		}else if(tmpCode == KeyCode.N){
			this.initObject();
		}else if(tmpCode == KeyCode.R){
			if(myActor.isUpdate()){
				sPath.setVisible(false);
				myActor.setUpdate(false);
			}else{
				myActor.setUpdate(true);
			}
		}else if(tmpCode == KeyCode.S){
			myMap.setMaze(myMap.isMaze()^true);
		}
	}

	@Override
	public void draw(GraphicsContext gc) {
		// 暂停
		if (mGameState == GameState.GAME_PAUSE) {
			return;
		}
		super.draw(gc);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}

}
