package com.mutlu.turgay.soaptest.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soap12:Body", strict = false)
public class RequestBody {
    @Element(name = "Add",required = false)
    private RequestData add;

    public RequestData getAdd() {
        return add;
    }

    public void setAdd(RequestData add) {
        this.add = add;
    }
}
