package br.com.aquino.forum.controller

import br.com.aquino.forum.model.Curso
import br.com.aquino.forum.model.Topico
import br.com.aquino.forum.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping("/topicos")
class TopicoController {

    @GetMapping
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