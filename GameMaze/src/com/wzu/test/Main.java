package com.wzu.test;
	
import com.wzu.core.GameApplication;
import com.wzu.core.Utils;
import com.wzu.core.screen.MainCanvas;

import javafx.stage.Stage;


public class Main extends GameApplication {

	
	@Override
	protected void after() {
		
		MainCanvas mCanvas = new MainCanvas(Utils.MAPWIDTH+200, Utils.MAPHEIGHT);
		this.getRoot().getChildren().add(mCanvas);
		this.getScene().getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		mCanvas.start();
		mCanvas.initEvents();
	}
	
	@Override
	protected void showStage(Stage stage) {
		super.showStage(stage);
		stage.setTitle("JavaFX游戏开发 迷宫");
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
