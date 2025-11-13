package ru.ezhov.friendassistant.proxy.command

interface CommandRepository {
    fun all(): List<Command>
}
