package com.example.nondb.model;


import java.time.LocalDateTime;

public class Entry {


    private int messageId;
    private final String username;
    private final String content;
    int creationOrder;
    private int likes;

    //Constructor for entry
    public Entry(String username, String content, int messageId) {
        if (content.isEmpty() || content.length() >= 128){
            throw new IllegalArgumentException("Invalid Entry");
        }
        this.username = username;
        this.content = content;
        this.likes = 0;
        this.messageId = messageId;
    }

    //Get the username of the entry
    public String getUsername() {
        return username;
    }

    //Get content of an Entry
    public String getContent() {
        return content;
    }

    //Get Likes of an entry
    public int getLikes() {
        return likes;
    }

    //Like an Entry
    public void like(){
        this.likes += 1;
    }

    //Get the message ID of an Entry
    public int getMessageId(){
        return this.messageId;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "messageId=" + messageId +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}