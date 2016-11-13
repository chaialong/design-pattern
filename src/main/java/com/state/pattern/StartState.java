package com.state.pattern;

public class StartState implements State {
    @Override
    public String toString() {
        return "Start state";
    }

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
