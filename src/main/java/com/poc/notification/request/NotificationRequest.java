package com.poc.notification.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private String title;

    private String body;

    private String topic;

    private String token;
}
