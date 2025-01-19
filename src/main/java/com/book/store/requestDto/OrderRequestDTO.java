package com.book.store.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
    private List<Long> bookIds;
    private Long addressId;
    private int totalQuantity;
    private double totalPrice;
    private double discount;
}

