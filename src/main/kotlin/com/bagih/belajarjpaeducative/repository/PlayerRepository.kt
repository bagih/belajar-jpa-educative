package com.bagih.belajarjpaeducative.repository

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
@Transactional
class PlayerRepository {
    @PersistenceContext
    lateinit var entitiyManager: EntityManager
}