package com.tolux.resumeapplicationwar.ErrorDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppError {

    private String errorMessage;
    private String errorCode;
    private String appName;
    private LocalDateTime localDateTime;
}
