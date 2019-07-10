package com.Package;

import ru.cinimex.java.se.test.service.SerializeServiceImpl;

import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
class somth{

}
public class Main {

    public static void main(String []args) {

        OperationType first = new OperationType(1,1, "Name1",1);
        OperationType second = new OperationType(2,2, "Name2",2);
        OperationType third = new OperationType(3,3, "Name3",3);
        SerializeServiceImpl ser = new SerializeServiceImpl("C:\\save.txt");

        try {
            ser.serializeOperationType(third);
            OperationType firstDes = ser.deserializeOperationType();
            firstDes.getPrintString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
