package love.chihuyu.lifeutilities.command.commands

import dev.jorel.commandapi.kotlindsl.commandAPICommand
import dev.jorel.commandapi.kotlindsl.playerExecutor
import love.chihuyu.lifeutilities.command.Command

object SuicideCommand: Command {
    override fun register() {
        commandAPICommand("suicide") {
            playerExecutor { player, _ ->
                player.health = .0
            }
        }
    }
}