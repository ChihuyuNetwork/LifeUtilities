package love.chihuyu.lifeutilities.recipe

import love.chihuyu.lifeutilities.LifeUtilitiesPlugin.Companion.LifeUtilitiesPlugin
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe

object CustomRecipes {
    val gapple = ShapedRecipe(NamespacedKey(LifeUtilitiesPlugin, "Gapple"), ItemStack(Material.ENCHANTED_GOLDEN_APPLE)).apply {
        shape("GGG", "GAG", "GGG")
        setIngredient('G', Material.GOLD_BLOCK)
        setIngredient('A', Material.APPLE)
    }
}