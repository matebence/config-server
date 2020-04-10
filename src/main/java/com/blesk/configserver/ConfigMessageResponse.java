package com.blesk.configserver;

public class ConfigMessageResponse {

    private String timestamp;

    private String message;

    private boolean error;

    public ConfigMessageResponse() {
    }

    public ConfigMessageResponse(String timestamp, String message, boolean error) {
        this.timestamp = timestamp;
        this.message = message;
        this.error = error;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return this.error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ConfigMessageResponse{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", error=" + error +
                '}';
    }
}