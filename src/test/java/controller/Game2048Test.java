package controller;

import controller.Game2048;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Game2048Test {

    private Game2048 game2048 = new Game2048();
    private PopUpMessage popUpMessage = mock(PopUpMessage.class);

    @Test
    void shouldPopUpMessageYouWonWhen2048TileAppearsInGrid() {
        game2048.play();
        assertTrue(popUpMessage.won);
    }
}
