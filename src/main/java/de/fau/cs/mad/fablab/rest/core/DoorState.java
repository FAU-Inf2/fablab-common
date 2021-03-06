package de.fau.cs.mad.fablab.rest.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * POJO to represent the door state
 * (inout)data should be in format <timestamp>:<state>
 * where <timestamp> is a unix timestamp
 * and <state> is either open or close
 */
@Entity
@Table(name="DoorState")
public class DoorState implements Serializable
{
    public final static String DATA_REGEX = "^\\d+:(open|close)$";
    public final static String DELIMITER = ":";
    public enum State
    {
        invalid,
        open,
        close
    }

    /**
     * Default constructor which represents an invalid door state
     */
    public DoorState ()
    {
        time = 0;
        state = State.invalid;
    }

    /**
     * Constructor class for DoorState which parses the string into a POJO
     * @param input String for input data
     */
    public DoorState(String input)
    {
        if (!input.matches(DATA_REGEX))
            throw new IllegalArgumentException("Data must be in format <timestamp>:<state>");

        String dataArray[] = input.split(DELIMITER);

        if (dataArray.length != 2)
            throw new IllegalArgumentException("Data must be in format <timestamp>:<state>");

        time = Integer.valueOf(dataArray[0]);
        state = State.valueOf(dataArray[1]);
    }

    /**
     * Unix Timestamp of the request
     */
    @Id
    @Column(name = "time")
    public long time;

    /**
     * State which can be open or close
     */
    @Column(name = "state")
    public State state = State.invalid;

    @Override
    public String toString() {
        return state.toString() + " : " + String.valueOf(time);
    }
}
