package br.com.aquino.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
