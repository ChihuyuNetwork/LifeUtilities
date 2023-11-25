package love.chihuyu.lifeutilities

import love.chihuyu.lifeutilities.command.commands.ImhereCommand
import love.chihuyu.lifeutilities.command.commands.SuicideCommand
import love.chihuyu.lifeutilities.recipe.CustomRecipes
import org.bukkit.plugin.java.JavaPlugin

class LifeUtilitiesPlugin: JavaPlugin() {
    companion object {
        lateinit var LifeUtilitiesPlugin: JavaPlugin
    }

    init {
        LifeUtilitiesPlugin = this
    }

    override fun onEnable() {
        super.onEnable()
        listOf(
            ImhereCommand,
            SuicideCommand
        ).forEach {
            it.register()
        }

        listOf(
            CustomRecipes.gapple
        ).forEach {
            server.addRecipe(it)
        }
    }
}