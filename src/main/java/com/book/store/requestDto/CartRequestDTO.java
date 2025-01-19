package com.book.store.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartRequestDTO {
    private Long bookId;
    private int selectedQuantity;
}

