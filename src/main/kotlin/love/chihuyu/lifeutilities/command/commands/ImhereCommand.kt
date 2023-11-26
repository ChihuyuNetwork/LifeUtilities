package love.chihuyu.lifeutilities.command.commands

import dev.jorel.commandapi.kotlindsl.commandAPICommand
import dev.jorel.commandapi.kotlindsl.playerExecutor
import love.chihuyu.lifeutilities.command.Command
import net.kyori.adventure.text.Component

object ImhereCommand : Command {
    override fun register() {
        commandAPICommand("imhere") {
            withPermission("lifeutilities.imhere")
            playerExecutor { player, _ ->
                player.server.broadcast(Component.text("${player.name}の現在地: X:${"%.1f".format(player.location.x)}, Y: ${"%.1f".format(player.location.y)}, Z: ${"%.1f".format(player.location.z)}"))
            }
        }
    }
}
