package com.knuforum.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Post {

  @Id
  @GeneratedValue
  private Long id;
  private String text;

  private LocalDateTime date;

  public Post(String text, LocalDateTime date) {
    this.text = text;
    this.date = date;
  }
}
