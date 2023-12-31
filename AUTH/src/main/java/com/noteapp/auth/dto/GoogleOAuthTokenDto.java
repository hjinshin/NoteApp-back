package com.noteapp.auth.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoogleOAuthTokenDto {
    private String access_token;
    private String refresh_token;
    private Integer expires_in;
    private String scope;
    private String token_type;
    private String id_token;
}