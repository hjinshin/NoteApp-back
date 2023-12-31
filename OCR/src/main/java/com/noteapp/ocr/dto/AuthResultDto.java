package com.noteapp.ocr.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResultDto {
    private boolean success;
    private String access_token;
    private String userId;
    private String message;
}
