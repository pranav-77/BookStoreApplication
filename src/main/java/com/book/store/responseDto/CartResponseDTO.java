package com.book.store.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponseDTO {
    private Long cartId;
    private BookResponseDTO book;
    private int selectedQuantity;
}

