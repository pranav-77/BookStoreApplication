package com.book.store.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private int totalQuantity;
    private double totalPrice;
    private double discount;
    private double discountPrice;
    private double totalPayableAmount;
    private LocalDate orderDate;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Book> books;

    @ManyToOne
    private Address address;

}

