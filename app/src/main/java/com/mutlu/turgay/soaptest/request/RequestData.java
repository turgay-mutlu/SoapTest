package com.mutlu.turgay.soaptest.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;


@Root(name = "Add", strict = false)
@Namespace(reference = "http://tempuri.org/")
public class RequestData {
    @Element(name = "intA", required = false)
    int intA;
    @Element(name = "intB", required = false)
    int intB;

    public int getIntA() {
        return intA;
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public int getIntB() {
        return intB;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }
}
