package org.sergei.ws;

import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class SOAPElementSample {

    public static void main(String[] args) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();

        SOAPHeader soapHeader = soapEnvelope.getHeader();
        soapHeader = soapMessage.getSOAPHeader();

        SOAPBody soapBody  = soapMessage.getSOAPBody();

        SOAPFactory soapFactory = SOAPFactory.newInstance();
        Name bodyName  = soapFactory.createName("getEmployeeDetails","ns1","urn:MySoapServices");

        SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);
        Name childName = soapFactory.createName("param1");

        SOAPElement order = purchaseLineItems.addChildElement(childName);
        order.addTextNode("1016577");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        soapMessage.writeTo(outputStream);

        System.out.println(new String(outputStream.toByteArray()));
    }

}
