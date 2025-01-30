package org.example.State;

public interface State {
    String approve();
    String decline();
    String process();
    String archive();
}
