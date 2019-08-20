package com.stackroute.pocsocketconnection.domain;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String userName;
    private String message;
    private String toUser;
}
