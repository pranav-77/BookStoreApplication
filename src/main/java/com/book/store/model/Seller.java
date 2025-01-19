package com.book.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Seller extends User{
    private String storeName;
    private String storeDescription;
    private String storeWebsite;
    private String storePhoneNumber;

    @OneToMany
    private List<Book> books;
}
