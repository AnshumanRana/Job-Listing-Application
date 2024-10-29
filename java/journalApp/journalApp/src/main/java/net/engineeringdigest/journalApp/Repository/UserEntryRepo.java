package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserEntryRepo implements UserRepository{
    public User findByUserName(String username) {
        return null;
    }

    public void deleteByUserName(String username) {

    }

    public <S extends User> S insert(S entity) {
        return null;
    }

    public <S extends User> List<S> insert(Iterable<S> entities) {
        return null;
    }

    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public <S extends User> S save(S entity) {
        return null;
    }

    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<User> findById(ObjectId objectId) {
        return Optional.empty();
    }

    public boolean existsById(ObjectId objectId) {
        return false;
    }

    public List<User> findAll() {
        return null;
    }

    public List<User> findAllById(Iterable<ObjectId> objectIds) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(ObjectId objectId) {

    }

    public void delete(User entity) {

    }

    public void deleteAllById(Iterable<? extends ObjectId> objectIds) {

    }

    public void deleteAll(Iterable<? extends User> entities) {

    }

    public void deleteAll() {

    }

    public List<User> findAll(Sort sort) {
        return null;
    }

    public Page<User> findAll(Pageable pageable) {
        return null;
    }
}
