package com.state.pattern;

public class StopState implements State {
    @Override
    public String toString() {
        return "Stop state";
    }

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
