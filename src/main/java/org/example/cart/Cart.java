package org.example.cart;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Cart extends BaseEntity<UUID> {
    private UUID userId;
    private UUID restaurantId;
    private List<UUID> products;
    private LocalDate expirationDate;

    public Cart(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, UUID userId, UUID restaurantId, List<UUID> products, LocalDate expirationDate) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.products = products;
        this.expirationDate = expirationDate;
    }
}

