package com.inendev.websocketdemo.config;

public class OutputMessageDto {
    private String time;
    private String from;
    private String text;

    public OutputMessageDto(String from, String text, String time) {
        this.time = time;
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
