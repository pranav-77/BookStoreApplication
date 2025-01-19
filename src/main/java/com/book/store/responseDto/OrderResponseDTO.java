package com.book.store.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {
    private Long orderId;
    private int totalQuantity;
    private double totalPrice;
    private double discount;
    private double discountPrice;
    private double totalPayableAmount;
    private LocalDate orderDate;
    private List<BookResponseDTO> books;
    private AddressResponseDTO address;
}

