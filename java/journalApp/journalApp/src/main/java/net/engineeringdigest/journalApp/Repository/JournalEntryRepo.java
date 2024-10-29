package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JournalEntryRepo implements JournalEntryRepository{
    public <S extends JournalEntry> S insert(S entity) {
        return null;
    }

    public <S extends JournalEntry> List<S> insert(Iterable<S> entities) {
        return null;
    }

    public <S extends JournalEntry> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    public <S extends JournalEntry> List<S> findAll(Example<S> example) {
        return null;
    }

    public <S extends JournalEntry> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    public <S extends JournalEntry> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    public <S extends JournalEntry> long count(Example<S> example) {
        return 0;
    }

    public <S extends JournalEntry> boolean exists(Example<S> example) {
        return false;
    }

    public <S extends JournalEntry, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public <S extends JournalEntry> S save(S entity) {
        return null;
    }

    public <S extends JournalEntry> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<JournalEntry> findById(ObjectId objectId) {
        return Optional.empty();
    }

    public boolean existsById(ObjectId objectId) {
        return false;
    }

    public List<JournalEntry> findAll() {
        return null;
    }

    public List<JournalEntry> findAllById(Iterable<ObjectId> objectIds) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(ObjectId objectId) {

    }

    public void delete(JournalEntry entity) {

    }

    public void deleteAllById(Iterable<? extends ObjectId> objectIds) {

    }

    public void deleteAll(Iterable<? extends JournalEntry> entities) {

    }

    public void deleteAll() {

    }

    public List<JournalEntry> findAll(Sort sort) {
        return null;
    }

    public Page<JournalEntry> findAll(Pageable pageable) {
        return null;
    }
}
