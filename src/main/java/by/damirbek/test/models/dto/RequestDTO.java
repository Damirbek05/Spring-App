package by.damirbek.test.models.dto;

import lombok.Data;

@Data
public class RequestDTO {
    private String product;
    private int quantity;
    private String deliveryAddress;
    private String phoneNumber;
}
