package com.techsaby.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techsaby.model.FileReaderModel;

@Repository
public interface FileReaderRepository extends MongoRepository<FileReaderModel, String> {

}
