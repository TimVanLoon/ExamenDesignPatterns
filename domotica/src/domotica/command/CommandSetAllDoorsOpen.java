package domotica.command;

import domotica.model.ElectricityException;
import domotica.model.Room;

/**
 * Created by Tim on 30/08/2017.
 */
public class CommandSetAllDoorsOpen implements Command{

    private Room room;

    public CommandSetAllDoorsOpen(Room room){
        this.room = room;
    }

    public void execute() throws ElectricityException {
        room.setDoorsClosed(false);
    }
}
