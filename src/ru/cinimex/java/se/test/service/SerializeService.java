package ru.cinimex.java.se.test.service;
import com.Package.OperationType;
public interface SerializeService {
    void serializeOperationType(OperationType operationType);
    OperationType deserializeOperationType();
}
