package org.example.LearnSpringBoot.repository;

import org.example.LearnSpringBoot.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

/*  JpaRepository is a marker interface that allows the Spring Data Repository
    engine to recognize it and apply the necessary proxy classes to implement not only the base CRUD (Create,
    Read, Update, Delete) actions, but also some custom methods.
*/
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
