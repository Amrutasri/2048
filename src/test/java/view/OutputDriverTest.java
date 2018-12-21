package view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.doNothing;

class OutputDriverTest {

    private OutputDriver outputDriver = new OutputDriver();

    @BeforeEach
    void init() {
        outputDriver.printStream = Mockito.spy(new PrintStream(System.out));
        doNothing().when(outputDriver.printStream).print("Welcome");
    }

    @DisplayName("should print Welcome")
    @Test
    void shouldPrintMessage() {
        outputDriver.printStream.print("Welcome");
        Mockito.verify(outputDriver.printStream, Mockito.times(1)).print("Welcome");
    }
    
}