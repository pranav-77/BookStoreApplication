package com.book.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User{
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    @OneToMany
    private List<Order> orders;

    @OneToOne
    private Cart cart;

}
