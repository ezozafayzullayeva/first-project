package org.example.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;
import org.example.common.BaseRepository;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepository extends BaseRepository<User, UUID> {
    //    private final List<User> users = new ArrayList<>();
    private static final UserRepository repository = new UserRepository();

    public static UserRepository getInstance(){
        return repository;
    }
}
