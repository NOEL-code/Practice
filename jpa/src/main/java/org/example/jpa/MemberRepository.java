package org.example.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member1 member) {
        em.persist(member);
        return member.getId();
    }

    public Member1 find(Long id) {
        return em.find(Member1.class, id);
    }
}
