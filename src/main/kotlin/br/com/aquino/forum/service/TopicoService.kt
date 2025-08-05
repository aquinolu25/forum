package br.com.aquino.forum.service

import br.com.aquino.forum.model.Curso
import br.com.aquino.forum.model.Topico
import br.com.aquino.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoService {

    fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"),
            autor = Usuario(
                id = 1,
                nome = "Luiz Aquino",
                email = "luiz@gmail.com")
        )
        return Arrays.asList(topico, topico, topico)
    }

}