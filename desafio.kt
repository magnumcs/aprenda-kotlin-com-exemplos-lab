// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val cpf: String)

data class ConteudoEducacional(var nome: String, val nivel: Nivel, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val usuario1 = Usuario("Harry Potter", "09655788888")

    val cont1 = ConteudoEducacional("Logica", Nivel.BASICO)
    val cont2 = ConteudoEducacional("Programacao", Nivel.INTERMEDIARIO)
    val cont3 = ConteudoEducacional("Estrutura de Dados", Nivel.DIFICIL)

    val listCont: List<ConteudoEducacional> = mutableListOf(cont1, cont2, cont3)

    val form1 = Formacao("Dev", listCont)

    form1.matricular(usuario1)

    println("nome: ${form1.nome}")
    print("conteúdos: ")
    form1.conteudos.forEach {
        println(it.nome)
        println(it.nivel)
        println(it.duracao)
    }
    print("inscritos: ")
    form1.inscritos.forEach {
        println(it.nome)
        println(it.cpf)
    }

}
