package com.example.volleydemopost;

public class Data_Model {
    int id;
    String userId;
    String title;
    String body;

    public Data_Model(int id, String userId,String title, String body ) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUserid() {
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userid;
    }

    public String getTitel() {
        return title;
    }

    public void setTitel(String titel) {
        this.title = titel;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
