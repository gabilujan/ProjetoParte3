package com.example.approomaula.model

import com.example.approomaula.controller.Tipos

data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val Sobrenome: String = "",
    val telefone: String = "",
    val adicionarContato: Boolean = false,
    val tipos: Tipos = Tipos.nome
)
