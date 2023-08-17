package com.bagih.belajarjpaeducative.model

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "Player")
data class Player(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int? =  null,
    private var name: String,
    private var nationality: String,
    private var birthDate: Date,
    private var titles: Int
)
