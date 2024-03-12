package com.utkrashta.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class FileStorageException extends Exception {

  private int errorCode;
  private int errorMsg;


}
