package view;

import java.io.PrintStream;

public class OutputDriver {

    private Object object;

    PrintStream printStream = System.out;

    public void print(Object object) {
        this.object = object;
        printStream.print(this.object);
    }

    @Override
    public String toString() {
        return "" + object + "";
    }
}
