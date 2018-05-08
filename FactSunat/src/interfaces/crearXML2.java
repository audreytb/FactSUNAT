package interfaces;
/**
 *
 * @author AudreyTb
 */
//import factsunat.classUsuarios;
//import herramientas.conexion;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.jar.Attributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
 
import javax.xml.*;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class crearXML2 {
    public void crearXML2() throws ParserConfigurationException, TransformerConfigurationException, TransformerException{
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
DOMImplementation implementation = builder.getDOMImplementation();
 
Document document = implementation.createDocument(null, "Configuracion", null);
document.setXmlVersion("1.0");
 
Element raiz = document.getDocumentElement();
 /*
Element nodoServidor = document.createElement("Servidor"); //creamos un nuevo elemento
Text nodoValorServidor = document.createTextNode(this.txtServer.getText()); //Ingresamos la info
nodoServidor.appendChild(nodoValorServidor);
raiz.appendChild(nodoServidor); //pegamos el elemento a la raiz "Documento"
 
Element nododb = document.createElement("DB"); //creamos un nuevo elemento
Text nodoValorDB = document.createTextNode(this.txtBase.getText()); //Ingresamos la info
nododb.appendChild(nodoValorDB);
raiz.appendChild(nododb); //pegamos el elemento a la raiz "Documento"
 
Element nodoUsuario = document.createElement("Usuario"); //creamos un nuevo elemento
Text nodoValorUsuario = document.createTextNode(this.txtUsuario.getText()); //Ingresamos la info
nodoUsuario.appendChild(nodoValorUsuario);
raiz.appendChild(nodoUsuario); //pegamos el elemento a la raiz "Documento"
 
Source source = new DOMSource(document);
StreamResult result = new StreamResult(new
 
java.io.File("Conexion.xml"));//nombre del archivo
Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.transform(source, result);
}
    private void cmdAccesarActionPerformed(java.awt.event.ActionEvent evt) {
 try {
 // TODO add your handling code here:
 
// File archivoConexion = new File("Conexion.xml");
//
// if (archivoConexion.exists())
// System.out.println("El fichero");
// else
 crearXML2();
 
 conexion con = new conexion();
 con.strServidor=this.txtServer.getText();
 con.strPSWSQL="";
 con.strUsuarioSQL="root";
 con.strBaseDeDatos=this.txtBase.getText();
 
 con.conectado();
 leerConfiguracion();
 frmPrincipal principal= new frmPrincipal();
 classUsuarios usuarios = new classUsuarios();
 if (usuarios.blnChecaUsuarioContra("SELECT * FROM Usuarios where Usuario='"+this.txtUsuario.getText() +"' and Contra='"+this.pswContraseña.getText()+"'")==true){
 this.setVisible(false);
 principal.setVisible(true);
 }
 else
 JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTO"+this.pswContraseña.getText());
 System.out.println("SELECT * FROM Usuarios where Usuario='"+this.txtUsuario.getText() +"' and Contra='"+this.pswContraseña.getText()+"'");
 } catch (ParserConfigurationException ex) {
 Logger.getLogger(frmLogueo.class.getName()).log(Level.SEVERE, null, ex);
 } catch (TransformerException ex) {
 Logger.getLogger(frmLogueo.class.getName()).log(Level.SEVERE, null, ex);
 }
 */
 }
}
