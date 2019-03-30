package com.knuforum.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class Message {
  private Long id;
  private String text;
  private LocalDateTime date;

  public Message(Long id, String text, LocalDateTime date) {
    this.id = id;
    this.text = text;
    this.date = date;
  }

}

