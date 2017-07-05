package models;

public class GameStatus {
	
	private static boolean gamePanelBackground = false;

	public static boolean isGamePanelBackground() {
		return gamePanelBackground;
	}

	public static void setGamePanelBackground(boolean gamePanelBackground) {
		GameStatus.gamePanelBackground = gamePanelBackground;
	}
	
	
}
