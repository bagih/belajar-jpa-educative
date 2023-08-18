package com.bagih.belajarjpaeducative

import com.bagih.belajarjpaeducative.model.Player
import com.bagih.belajarjpaeducative.repository.PlayerRepository
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.util.*

@SpringBootApplication
@Slf4j
class BelajarJpaEducativeApplication(
	@Autowired
	val repository: PlayerRepository
): CommandLineRunner{
	private val logger = LoggerFactory.getLogger(this::class.java)
	override fun run(vararg args: String?) {
		logger.info("==========INSERT PLAYER===========")
		logger.info(repository.insertOrUpdatePlayer(Player(name = "simbur", nationality = "jawa", birthDate = Date(1998, 11, 20), titles = 21)).toString())
		logger.info(repository.insertOrUpdatePlayer(Player(name = "jambur", nationality = "jawa", birthDate = Date(1949, 6, 20), titles = 21)).toString())
		logger.info(repository.getPlayerById(1).toString())
		logger.info(repository.deletePlayerById(2).toString())
		try {
			logger.info(repository.getPlayerById(2).toString())
		} catch (e: Exception){
			logger.info("no such item in specific id")
		}
		logger.info("get all players: ${repository.getAllPlayers()}")
	}


}

fun main(args: Array<String>) {
	runApplication<BelajarJpaEducativeApplication>(*args)
}
