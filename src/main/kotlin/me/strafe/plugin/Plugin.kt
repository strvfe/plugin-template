package me.strafe.plugin

import me.strafe.plugin.executors.ExampleExecutor
import org.bukkit.command.Command
import org.bukkit.command.CommandSender

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class Plugin: JavaPlugin() {
  override fun onEnable() {
    this.getCommand("example").executor = ExampleExecutor()
  }
}
