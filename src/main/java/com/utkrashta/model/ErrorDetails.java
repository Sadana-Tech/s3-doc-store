package com.utkrashta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorDetails {

  private int errorCode;
  private String errorMsg;

}
