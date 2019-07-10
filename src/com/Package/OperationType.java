package com.Package;
import java.io.Serializable;

public class OperationType implements Serializable {
    private transient Integer operTypeNumber;
    private int id;
    private String operationTypeName;
    private Integer operTypeCode;
    OperationType(Integer operTypeNumber, Integer id,String operationTypeName,Integer operTypeCode){
        this.operTypeNumber=operTypeNumber;
        this.id=id;
        this.operationTypeName = operationTypeName;
        this.operTypeCode = operTypeCode;
        this.operTypeNumber=operTypeNumber;
    }
    public Integer getOperTypeNumber() {
        return operTypeNumber;
    }

    public void setOperTypeNumber(Integer operTypeNumber) {
        this.operTypeNumber = operTypeNumber;
    }
    protected void getPrintString(){
        System.out.println("id="+this.id+"  operTypeNumber="+this.operTypeNumber);
    }
    protected void getInfo()
    {
        System.out.println("id="+this.id+" operationTypeName="+this.operationTypeName+" operTypeCode="+this.operTypeCode);
    }


}
