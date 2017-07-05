package helpers;

public interface Constants {

	
	public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static final int GAMEMAKER_PANEL_WIDTH = 400;
    public static final int GAMEMAKER_PANEL_HEIGHT = 600;
    public static final int GAME_PANEL_WIDTH = 400;
    public static final int GAME_PANEL_HEIGHT = 600;
    
    //Game Maker Panel Sprites postions
	public static final int MAKER_BRICK_X = 50;
    public static final int MAKER_BRICK_Y = GAMEMAKER_PANEL_HEIGHT/2;
	public static final int MAKER_BALL_X = 100;
    public static final int MAKER_BALL_Y = GAMEMAKER_PANEL_HEIGHT/2;
    public static final int MAKER_PADDLE_X = 150;
    public static final int MAKER_PADDLE_Y = GAMEMAKER_PANEL_HEIGHT/2;
    
    //images
	 public static final String PIC_BACKGROUND = "/background.jpg";
	 public static final String PIC_GAMEMAKER = "/gameMaker.jpg";
    
	//Game Panel ball
	 public static final int BALL_X_START = 245;
	 public static final int BALL_Y_START = 245;
	 public static final String PIC_BALL = "/ball.png";
	 public static final int SLOWDOWN = 5;
	 
	 //Game Panel paddle
	 public static final String PIC_PADDLE ="/paddle.png";
	 public static final int PADDLE_X_START = 225;
	 public static final int PADDLE_Y_START = 450;
	 
	 //Game Panel brick
	 public static final String PIC_BRICK = "/brick.png";
	 
	 //Game Panel clock
	 public static final int MILLISEC_TO_SEC = 1000;
	 
}
