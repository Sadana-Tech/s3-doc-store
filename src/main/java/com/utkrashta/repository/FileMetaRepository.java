package com.utkrashta.repository;

import com.utkrashta.entity.FileMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMetaRepository extends JpaRepository<Integer, FileMeta> {


}
