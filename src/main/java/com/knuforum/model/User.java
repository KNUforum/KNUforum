package com.knuforum.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
  private @Id @GeneratedValue Long id;

  public User(String nickname, String password, String email) {
    this.nickname = nickname;
    this.password = password;
    this.email = email;
  }

  String nickname;

  String password;

  String email;
}
