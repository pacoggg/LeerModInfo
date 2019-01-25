package versionessax;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class VersionesHandler extends DefaultHandler{
    private ArrayList<Version> versiones = new ArrayList();
    private Version version;
    private StringBuilder buffer=new StringBuilder();

    public ArrayList<Version> getVersiones() {
        return versiones;
    }
    
    
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch(qName){
           
            
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch(qName){
            case "Name":
                version = new Version();
                versiones.add(version);
                version.setName(attributes.getValue("value"));
                break;
            case "Description":
                //version = new Version();
                //versiones.add(version);
                version.setDescription(attributes.getValue("value"));
                break;
            case "Author":
                //version = new Version();
                //versiones.add(version);
                version.setAuthor(attributes.getValue("value"));
                break;
            case "Version":
                //version = new Version();
                //versiones.add(version);
                version.setVersion(Double.parseDouble(attributes.getValue("value")));
                break;
            case "Website":
                //version = new Version();
                //versiones.add(version);
                version.setWebsite(attributes.getValue("value"));
                break;
        }
    }
    
}
