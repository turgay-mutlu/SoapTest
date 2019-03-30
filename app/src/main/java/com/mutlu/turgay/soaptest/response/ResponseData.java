package com.mutlu.turgay.soaptest.response;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "AddResponse", strict = false)
@Namespace(reference = "http://tempuri.org/")
public class ResponseData {

    @Element(name = "AddResult", required = false)
    int addResult;

    public int getAddResult() {
        return addResult;
    }

    public void setAddResult(int addResult) {
        this.addResult = addResult;
    }
}
