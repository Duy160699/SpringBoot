package com.example.AdminBE.Product;

public class ResponseObject {
    private boolean message;
    private Object data;

    public ResponseObject() {
    }
    public ResponseObject(boolean message, Object data) {
        this.message = message;
        this.data = data;
    }
    public boolean isMessage() {
        return message;
    }
    public void setMessage(boolean message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
