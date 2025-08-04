package br.com.dio;

import br.com.dio.ui.custom.screen.MainScreen;

import java.util.HashMap;
import java.util.Map;

public class UiMain {

    public static void main(String[] args) {
        Map<String, String> gameConfig = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                gameConfig.put(row + "," + col, "0;false");
            }
        }

        MainScreen mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}