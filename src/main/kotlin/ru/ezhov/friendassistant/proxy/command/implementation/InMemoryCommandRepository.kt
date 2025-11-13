package ru.ezhov.friendassistant.proxy.command.implementation

import org.springframework.stereotype.Repository
import ru.ezhov.friendassistant.proxy.command.Command
import ru.ezhov.friendassistant.proxy.command.CommandRepository

@Repository
class InMemoryCommandRepository : CommandRepository {
    override fun all(): List<Command> =
        listOf(
            BackupActionCommand(),
            BackupPasswordCommand(),
            BoardCommand(),
            ru.ezhov.friendassistant.proxy.command.implementation.BranchCommand(),
            JiraTaskCommand(),
            SearchCommand(),
            ShowErrorsCommand(),
            MailActionCommand(),
            CleanTextFromBufferCommand(),
        )
}
