package com.bagih.belajarjpaeducative.repository

import com.bagih.belajarjpaeducative.model.Player
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import jakarta.persistence.TypedQuery
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
@Transactional
class PlayerRepository {
    @PersistenceContext
    lateinit var entitiyManager: EntityManager

    fun insertOrUpdatePlayer(player: Player): Player{
        return entitiyManager.merge(player)
    }

    fun getPlayerById(id: Int): Player{
        return entitiyManager.find(Player::class.java, id)
    }

    fun deletePlayerById(id: Int){
        val player: Player = entitiyManager.find(Player::class.java, id)
        entitiyManager.remove(player)
    }

    fun getAllPlayers(): List<Player>{
        val getAll: TypedQuery<Player> = entitiyManager.createNamedQuery("get_all_players", Player::class.java)
        return getAll.resultList
    }

}