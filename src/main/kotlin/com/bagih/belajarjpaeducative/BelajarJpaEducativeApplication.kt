package com.bagih.belajarjpaeducative

import com.bagih.belajarjpaeducative.model.Player
import com.bagih.belajarjpaeducative.repository.PlayerDataRepository
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
	val repository: PlayerDataRepository
): CommandLineRunner{
	private val logger = LoggerFactory.getLogger(this::class.java)
	override fun run(vararg args: String?) {
//		logger.info("==========INSERT PLAYER===========")
//		logger.info(repository.insertOrUpdatePlayer(Player(name = "simbur", nationality = "jawa", birthDate = Date(1998, 11, 20), titles = 21)).toString())
//		logger.info(repository.insertOrUpdatePlayer(Player(name = "jambur", nationality = "jawa", birthDate = Date(1949, 6, 20), titles = 21)).toString())
//		logger.info(repository.getPlayerById(1).toString())
//		logger.info(repository.deletePlayerById(2).toString())
//		try {
//			logger.info(repository.getPlayerById(2).toString())
//		} catch (e: Exception){
//			logger.info("no such item in specific id")
//		}
//		logger.info("get all players: ${repository.getAllPlayers()}")

//		using PlayerDataRepository
//		a repo that extends from JpaRepository interface
//		this repo has builtin function ready to use
		logger.info("save player: ${repository.save(Player(name = "simbur", nationality = "jawa", birthDate = Date(1998, 11, 20), titles = 21))}")
		logger.info("save player: ${repository.save(Player(name = "sambur", nationality = "jawa", birthDate = Date(1989, 11, 20), titles = 20))}")
		logger.info("save player: ${repository.save(Player(name = "simbar", nationality = "jawa", birthDate = Date(1988, 11, 20), titles = 12))}")
		logger.info("updating player: ${repository.save(Player(id = 2, name = "jambar", nationality = "jawa", birthDate = Date(1988, 11, 20), titles = 12))}")
		logger.info("find player by id of 2: ${repository.findById(2)}")
		logger.info("delete player with id 2: ${repository.deleteById(2)}")
		logger.info("\n\nall players data: ${repository.findAll()}\n\n")

	}


}

fun main(args: Array<String>) {
	runApplication<BelajarJpaEducativeApplication>(*args)
}
