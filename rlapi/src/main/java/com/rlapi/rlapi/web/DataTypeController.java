package com.rlapi.rlapi.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.rlapi.rlapi.Entity.DataType;
import com.rlapi.rlapi.services.DataTypeService;


@RestController
@AllArgsConstructor
public class DataTypeController {

    DataTypeService dataTypeService;

    @GetMapping("/datatype")
    public ResponseEntity<List<DataType>> getAllDataTypes() {
        return new ResponseEntity<>(dataTypeService.getAllDataTypes(),HttpStatus.OK);
    }
    
  
    
}
