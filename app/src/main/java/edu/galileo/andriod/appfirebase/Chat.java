package edu.galileo.andriod.appfirebase;

/**
 * Created by Usuario on 29/10/2016.
 */

public class Chat {
    private String username;
    private String message;

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    @SuppressWarnings("unused")
    public Chat() {
    }

    Chat(String username, String message) {
        this.username = username;
        this.message = message;
    }



}
