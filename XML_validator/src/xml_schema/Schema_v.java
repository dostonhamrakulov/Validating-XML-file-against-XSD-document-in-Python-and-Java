package xml_schema;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.xml.sax.SAXException;
//import java.io.File; // if you use File
import java.io.IOException;

public class Schema_v {
    public static void main(String[] args) {
        System.out.println("Valid: "+
                validateXMLSchema("/home/doston/Partation/Java_projects/XML_validator/XML_files/schema6.xsd",
                        "/home/doston/Partation/Java_projects/XML_validator/XML_files/Example_6_1.xml"));
//        System.out.println("EmployeeResponse.xml validates against Employee.xsd? "+validateXMLSchema("Employee.xsd", "EmployeeResponse.xml"));
//        System.out.println("employee.xml validates against Employee.xsd? "+validateXMLSchema("Employee.xsd", "employee.xml"));

    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath){

        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
}
