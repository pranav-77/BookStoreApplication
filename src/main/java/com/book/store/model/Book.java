package com.book.store.model;


import com.book.store.enums.AvailabilityStatus;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookid;

    private String bookName;
    private String bookAuthor;

    @Column(length = 5000)
    private String bookDescription;

    private Double bookPrice;
    private Integer bookQuantity;

    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availabilityStatus;

}


