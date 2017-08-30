package domotica.command;

import domotica.model.ElectricityException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 30/08/2017.
 */
public class Switch {

    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(final Command cmd) {
        this.history.add(cmd); // optional
        try {
            cmd.execute();
        } catch (ElectricityException e) {
            e.printStackTrace();
        }
    }
}
