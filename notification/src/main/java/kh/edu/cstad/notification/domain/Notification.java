package kh.edu.cstad.notification.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "notifications")
public class Notification {

    @Id
    private String id;

    private String title;

    private String message;

    private String url;

    private LocalDateTime sentAt;

    @DBRef
    private RecipientInfo recipientInfo;


}
