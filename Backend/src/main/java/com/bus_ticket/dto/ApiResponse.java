package com.bus_ticket.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private LocalDateTime timestamp;
    private boolean success;
    
    public ApiResponse(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.success = true;
    }
    
    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.success = success;
    }
}
