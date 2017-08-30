package domotica.command;

import domotica.model.ElectricityException;
import domotica.model.Room;

/**
 * Created by Tim on 30/08/2017.
 */
public class CommandSetAllDoorsClosed implements Command{

    private Room room;

    public CommandSetAllDoorsClosed(Room room){
        this.room = room;
    }

    public void execute() throws ElectricityException {
        room.setDoorsClosed(true);
    }
}
