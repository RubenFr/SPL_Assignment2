package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;

import java.util.HashMap;
import java.util.List;

public class AgentsAvailableEvent implements Event<HashMap<String, Object>> {

    private List<String> serialNumbers;
    private int expired;

    public AgentsAvailableEvent(List<String> serialNumbers, int expired) {
        this.serialNumbers = serialNumbers;
        this.expired = expired;
    }

    public List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

    public int getExpired() {
        return expired;
    }
}
