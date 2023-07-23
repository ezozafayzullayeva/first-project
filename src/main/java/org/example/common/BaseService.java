package org.example.common;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<REPOSITORY, ENTITY, ID> implements Service<REPOSITORY, ENTITY, ID>{
    @Override
    public REPOSITORY getRepository() {
        return null;
    }

    @Override
    public Optional<ENTITY> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public List<ENTITY> findAll() {
        return null;
    }

    @Override
    public void add(ENTITY entity) {

    }

    @Override
    public void delete(ID id) {

    }
}
