package com.ivoronline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // CREATE TABLE
  //=========================================================================================================
  public void createTable() {

    //CREATE STATEMENTS
    String statement = " CREATE TABLE TEST.PERSON (                   "+
                       "   ID   NUMBER  GENERATED ALWAYS AS IDENTITY, "+
                       "   NAME NVARCHAR2(100),                       "+
                       "   AGE  NUMBER                                "+
                       " )                                            ";

    //EXECUTE STATEMENT
    jdbcTemplate.execute(statement);

  }

}

