
package copybytestexto;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class copybytes {
   
    
    public void read() throws IOException{
        
    
         try(FileInputStream fis=new FileInputStream("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/texto1.txt")){
            FileOutputStream fos = new FileOutputStream("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/texto2.txt",true);
            int valor=0;
            while((valor=fis.read())!=-1){
                 fos.write(valor);
            }
            fis.close();
            fos.close();
         }
        catch (IOException ex) {
            Logger.getLogger(copybytes.class.getName()).log(Level.SEVERE, null, ex);
            
                }
         
         }
  

}
