package com.spring.boot.design.pattern.command.head.first;

/**
 * <p>Title: MacroCommand </p>
 * <p>Description: MacroCommand </p>
 * Date: 2018年06月07日 下午3:11 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年06月07日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
