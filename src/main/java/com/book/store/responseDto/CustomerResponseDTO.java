package com.book.store.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO extends UserResponseDTO {
    private List<AddressResponseDTO> addresses; // Assuming AddressResponseDTO exists
    private CartResponseDTO cart;              // Assuming CartResponseDTO exists
}

