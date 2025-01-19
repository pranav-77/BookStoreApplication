package com.book.store.responseDto;

import com.book.store.enums.AvailabilityStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private String bookDescription;
    private Double bookPrice;
    private Integer bookQuantity;
    private AvailabilityStatus availabilityStatus;
}

