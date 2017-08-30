package domotica.command;

import domotica.model.ElectricityException;

/**
 * Created by Tim on 30/08/2017.
 */
public interface Command {

    void execute() throws ElectricityException;
}
