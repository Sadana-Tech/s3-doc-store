package com.utkrashta.model;


import java.io.Serializable;
import lombok.Data;


@Data
public class FileDetails implements Serializable {

  private int id;
  private String fileName;
  private String filePath;
  private String version;
  private byte[] file;

}
