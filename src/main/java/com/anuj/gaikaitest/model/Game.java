package com.anuj.gaikaitest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement
public class Game {

  @XmlElement(name = "title")
  private String title;
  @XmlElement(name = "score")
  private String score;

  public Game(String title, String score) {
    this.title = title;
    this.score = score;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }
  
  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
