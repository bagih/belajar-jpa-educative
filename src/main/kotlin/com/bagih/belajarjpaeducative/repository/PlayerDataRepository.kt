package com.bagih.belajarjpaeducative.repository

import com.bagih.belajarjpaeducative.model.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerDataRepository: JpaRepository<Player, Int>{
    fun findByNationality(nationality: String): List<Player>
}