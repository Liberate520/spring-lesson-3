package ru.gb.springlesson2.demo;

import org.springframework.context.ApplicationEvent;

public class DatabaseConnectionSetupEvent extends ApplicationEvent {

  public DatabaseConnectionSetupEvent(Object source) {
    super(source);
  }

}
