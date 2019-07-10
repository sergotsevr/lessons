package ru.cinimex.java.se.test.service;

import com.Package.OperationType;

import java.io.*;

public class SerializeServiceImpl implements SerializeService{
private String typesFileUrl;
    public SerializeServiceImpl(String typesFileUrl){
        this.typesFileUrl=typesFileUrl;
    }
    @Override
    public void serializeOperationType (OperationType operationType) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(typesFileUrl);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(operationType);
        objectOutputStream.close();
    }

    @Override
    public OperationType deserializeOperationType() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        OperationType operationType = (OperationType) objectInputStream.readObject();

       return operationType;
    }
}
