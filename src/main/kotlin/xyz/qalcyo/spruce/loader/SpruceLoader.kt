package xyz.qalcyo.spruce.loader

import net.minecraft.client.main.Main

fun main(args: Array<String>) { SpruceLoader.load(args) }

object SpruceLoader {
    fun load(args: Array<String>) {
        println("Hello World from Spruce!")
        Main.main(args)
    }
}