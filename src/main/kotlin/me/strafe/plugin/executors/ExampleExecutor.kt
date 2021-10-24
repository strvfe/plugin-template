@file:Suppress("unused")

package me.strafe.plugin.executors

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class ExampleExecutor: CommandExecutor {
  override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean {
    sender?.sendMessage("1, 2, 3... Hello, World!")
    return true
  }
}
