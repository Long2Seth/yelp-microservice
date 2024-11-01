package kh.edu.cstad.notification.domain;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipient_info")
public class RecipientInfo {

    private String id;

    private String recipientId;

    private String profileUrl;

    private String email;

    private String phone;

    private String address;

}
