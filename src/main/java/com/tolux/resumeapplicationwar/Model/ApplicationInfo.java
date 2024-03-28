package com.tolux.resumeapplicationwar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplicationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer applicationId;
    @NonNull
    private String companyName;

    private LocalDate applicationDate;
    @NonNull
    private String resumeFile;

    @NonNull
    private String comments;


    @PrePersist
    private void prePersist(){
        if(applicationDate==null){
            applicationDate=LocalDate.now();
        }
    }

}
