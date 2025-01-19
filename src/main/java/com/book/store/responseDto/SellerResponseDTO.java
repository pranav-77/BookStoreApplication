package com.book.store.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerResponseDTO extends UserResponseDTO {
    private String storeName;
    private String storeDescription;
    private String storeWebsite;
    private String storePhoneNumber;
    private List<BookResponseDTO> books;
}

