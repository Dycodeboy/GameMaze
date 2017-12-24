package com.wzu.core;

import javafx.scene.image.Image;

public interface Utils {

	// // 画布水平偏移
	// public int xOffset = 100;
	// // 画布垂直偏移
	// public int yOffset = 50;

	//迷雾范围
	public int FOGRANGE = 5;
	// 单元格行数
	public int ROWCOUNT =10;// 实际为x*2+1保证生成奇数 >3
	// 单元格列数
	public int COLCOUNT = 10;

	// 地图宽度
	public int MAPWIDTH =  1024;
	
	// 单元格大小
	public int ESIZE = MAPWIDTH/(COLCOUNT * 2 + 1);
	// 地图高度
	public int MAPHEIGHT = (ROWCOUNT * 2 + 1) * ESIZE;

	// 控制面板宽度
	public int CONTROLWIDTH = 200;
	// 控制面板高度
	public int CONTROLHEIGHT = MAPHEIGHT;
	// 游戏宽度
	public int SCREENWIDTH = MAPWIDTH + CONTROLWIDTH;
	// 游戏高度
	public int SCREENHEIGHT = MAPHEIGHT;

	// map颜色
	public int WALLCOLOR = 18;
	public int ROADCOLOR = 0;
	// map图
	public Image IMAGE_MAP = new Image(Utils.class.getResourceAsStream("/com/wzu/core/resource/images/map.png"));
	public int MAPESIZE = 32;// 地图单元格大小
	public int MAP_COLS = (int) (IMAGE_MAP.getWidth() / MAPESIZE);

	public Image IMAGE_ACTOR = new Image(Utils.class.getResourceAsStream("/com/wzu/core/resource/images/ACTOR.png"));

	// // 单元格图片
	// public String[] IMAGE_NAMES = { "images/1.jpg", "images/2.jpg",
	// "images/3.jpg", "images/4.jpg", "images/5.jpg", "images/6.jpg",
	// "images/7.jpg", "images/8.jpg", "images/9.jpg", "images/10.jpg" };
	// // logo
	// public Image iconImg = new Image(
	// Utils.class.getResourceAsStream("images/icon.jpg"));
	// // 背景图片
	// public Image[] BG_IMAGE_NAMES = new Image[] {
	// new Image(Utils.class.getResourceAsStream("images/bg1.jpg")),
	// new Image(Utils.class.getResourceAsStream("images/bg2.jpg")),
	// new Image(Utils.class.getResourceAsStream("images/bg3.jpg")),
	// new Image(Utils.class.getResourceAsStream("images/bg4.jpg")),
	// new Image(Utils.class.getResourceAsStream("images/bg5.jpg")),
	// new Image(Utils.class.getResourceAsStream("images/bg6.jpg")), };

}
