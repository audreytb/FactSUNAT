package facturador;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author audreytb
 */
public class main {
    public static void main(String[]args) {
        crearXML();
}
public static void crearXML(){
    try{
        Facturador f1=new Facturador ();
        f1.setNumBol(1234234);
        f1.setNombCli("Pepe");
        f1.setDirCli("Calle Buenaventura M-3");
        f1.setDNICli(75644345);
        f1.setFecha("13/23/45");
    
        JAXBContext ctx = JAXBContext.newInstance(Facturador.class);
        Marshaller ms = ctx.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(f1, new File("D:\\documentos\\Universidad\\XMLS\\"+f1.getNumBol()));
    }
    catch(JAXBException ex){
        Logger.getLogger(main.class.getName()).log(Level.SEVERE,null,ex);
    }
}
}