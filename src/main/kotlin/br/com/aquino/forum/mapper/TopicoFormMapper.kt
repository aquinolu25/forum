package br.com.aquino.forum.mapper

import br.com.aquino.forum.dto.NovoTopicoForm
import br.com.aquino.forum.model.Topico
import br.com.aquino.forum.service.CursoService
import br.com.aquino.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
            private val cursoService: CursoService,
            private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }

}
