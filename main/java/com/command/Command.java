package com.command;


public interface Command {
    public CommandResult<String>  execute(String[] args);
}
