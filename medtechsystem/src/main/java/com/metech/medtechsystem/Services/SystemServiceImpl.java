package com.metech.medtechsystem.Services;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter;
import com.metech.medtechsystem.Repository.PatientRepository;
import com.metech.medtechsystem.modles.Patient;
import com.metech.medtechsystem.modles.RecordModel;
import com.metech.medtechsystem.modles.SystemModel;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SystemServiceImpl implements SystemService{

    private PatientRepository patientRepository;
    
    @Override 
    public void callRecordLocator(String nhi) throws IOException{
        // ## code that calls the Recordlocator API and posts a record to 
        // it with the NHI of the patient created in the system ##
        // ------------------------------------------
        // RecordModel record = new RecordModel();
        // record.setNhi(nhi);
        // record.setDataType(2L);
        // record.setSystemId(1L);
        // URL url = new URL("http://localhost:9090/rls/");
        // URLConnection con = url.openConnection();
        // HttpURLConnection http = (HttpURLConnection)con;
        // http.setRequestMethod("POST"); 
        // http.setDoOutput(true);
        // ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        // String jsonRecord = ow.writeValueAsString(record);
        // byte[] out =  jsonRecord.getBytes(StandardCharsets.UTF_8);
        // int length = out.length;
        // http.setFixedLengthStreamingMode(length);
        // http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        // http.connect();
        // try(OutputStream os = http.getOutputStream()) {
        //     os.write(out);
        // }
        System.out.println("this is the call that is made when posting to the record locator");
    
    }
    @Override
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
    @Override
    public Optional<Patient> getPatient(Long patientId){
        return patientRepository.findById(patientId);
    }

}
