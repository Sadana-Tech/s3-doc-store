package com.utkrashta.model;

public enum ErrorHttpStatus {
  RESOURCE_NOT_FOUND_EXCEPTION(600, "Resource not found"),
  FILE_STORAGE_EXCEPTION(601, "Exception while storing resources.");
  private final int value;
  private final String reasonPhrase;

  ErrorHttpStatus(int value, String reasonPhrase) {
    this.value = value;
    this.reasonPhrase = reasonPhrase;
  }

  public int value() {
    return this.value;
  }

  public String getReasonPhrase() {
    return this.reasonPhrase;
  }


}
