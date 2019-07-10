package ru.cinimex.java.se.test.service;
import com.Package.OperationType;

import java.io.IOException;

public interface SerializeService {
    void serializeOperationType(OperationType operationType) throws IOException;
    OperationType deserializeOperationType() throws IOException, ClassNotFoundException;
}
