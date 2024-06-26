package com.eaproc.tutorials.librarymanagement.web.response.auth;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogoutResponse {
    private Long userId;
    private String message;
}
