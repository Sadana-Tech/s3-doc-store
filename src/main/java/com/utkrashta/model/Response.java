package com.utkrashta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.utkrashta.entity.FileMeta;
import java.io.Serializable;
import lombok.Data;

@Data
public class Response implements Serializable {

  private int statusCode;
  private int statusMsg;
  @JsonIgnore
  private FileMeta fileMeta;
  @JsonIgnore
  private ErrorDetails errorDetails;

}
