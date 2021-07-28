package com.example.demo.beans;

public class SaySomethingConfigurableService implements SaySomethingService {
    private String whatToSay = "";

    public void SetWhatToSay(String whatToSay) {
        this.whatToSay = whatToSay;
    }

    @Override
    public String saySomething() {
        return whatToSay;
    }
}
