package com.bagih.belajarjpaeducative.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "Player")
data class Player(
    @Id
    @GeneratedValue
    private var id: Int,
    private var name: String,
    private var nationality: String,
    private var birthDate: Date,
    private var titles: Int
)
