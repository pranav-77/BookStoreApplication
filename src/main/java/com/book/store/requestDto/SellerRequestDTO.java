package com.book.store.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequestDTO extends UserRequestDTO {
    private String storeName;
    private String storeDescription;
    private String storeWebsite;
    private String storePhoneNumber;
}

