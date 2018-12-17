package controller;

import controller.Game2048;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Game2048Test {

    private Game2048 game2048 = new Game2048();
    PopUpMessage popUpMessage = mock(PopUpMessage.class);

    @Test
    void shouldPopUpMessageYouWonWhen2048TileAppearsInGrid() {
        game2048.play();
        assertTrue(popUpMessage.won);
    }
}
