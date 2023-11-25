package love.chihuyu.lifeutilities

import org.bukkit.plugin.java.JavaPlugin

class LifeUtilitiesPlugin: JavaPlugin() {
    companion object {
        lateinit var LifeUtilitiesPlugin: JavaPlugin
    }

    init {
        LifeUtilitiesPlugin = this
    }
}