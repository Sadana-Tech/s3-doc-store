package com.utkrashta.service;

import com.utkrashta.model.FileDetails;
import com.utkrashta.model.Response;

public interface FileStorageService {

  Response save(FileDetails fileDetails);

  Response getByFileName(String fileName);

  Response delete(String fileName);
}
