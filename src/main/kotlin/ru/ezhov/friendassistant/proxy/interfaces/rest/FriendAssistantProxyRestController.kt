package ru.ezhov.friendassistant.proxy.interfaces.rest

import mu.KotlinLogging
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ezhov.friendassistant.proxy.command.CommandDispatcher

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/api")
class FriendAssistantProxyRestController(
    private val commandDispatcher: CommandDispatcher
) {
    @PostMapping("/talk")
    fun talk(@RequestBody request: Text) {
        logger.info { request.text }
        commandDispatcher.doCommand(request.text)
    }
}

data class Text(
    val text: String
)
