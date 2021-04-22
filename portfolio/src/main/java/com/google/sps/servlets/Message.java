package com.google.sps.servlets;

public final class Message {

  private final String name;
  private final String email;
  private final String title;

  public Message (String name, String email, String title) {
    this.name = name;
    this.email = email;
    this.title = title;
  }
}