package com.mutlu.turgay.soaptest.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "soap:Body", strict = false)
public class ResponseBody {

    @Element(name = "AddResponse", required = false)
    private ResponseData addResponse;

    public ResponseData getAddResponse() {
        return addResponse;
    }

    public void setAddResponse(ResponseData addResponse) {
        this.addResponse = addResponse;
    }
}
