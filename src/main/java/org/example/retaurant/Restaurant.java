package org.example.retaurant;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.user.User;

import java.time.LocalDateTime;
import java.util.UUID;

@Data

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Restaurant extends BaseEntity<UUID> {
    private String name;
    private String location;

    public Restaurant(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, String name, String location) {
        super(id, created, modified, createdBy, modifiedBy);
        this.name = name;
        this.location = location;
    }
}