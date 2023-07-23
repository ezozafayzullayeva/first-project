package org.example.common;

import java.util.List;
import java.util.Optional;

public interface Service<REPOSITORY, ENTITY, ID>{
    REPOSITORY getRepository();
    Optional<ENTITY> findById(ID id);
    List<ENTITY> findAll();
    void add(ENTITY entity);
    void delete(ID id);
}