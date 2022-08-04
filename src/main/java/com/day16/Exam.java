package com.day16;

public class Exam {
    private String username;
    private Integer score;

    public Exam() {
    }

    public Exam(String username, Integer score) {
        this.username = username;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam{" + "username=" + username + ", score=" + score + '}';
    }
    
    
}
