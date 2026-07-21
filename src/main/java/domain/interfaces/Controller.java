package domain.interfaces;

import domain.commands.Command;

import java.util.List;

public interface Controller {
    void registerCommands(List<Command> commands);
    void readInputs();
}
