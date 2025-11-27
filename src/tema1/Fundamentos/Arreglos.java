//Arreglos esstáticos lineales

package tema1.Fundamentos;
import java.io.*;
    
public class Arreglos {
/*
*   datos
*   constructores
*   métodos
*/
    
    public static void main(String[] args) throws IOException {
        System.out.println(problemaJuan(args));
    }
    
    public static int problemaJuan(String[] args)throws java.io.IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(in.readLine());
        int countJuan = 0;
        String inputName;
        
        for(int i = 0; i < num; i++) {
            inputName = in.readLine();
            if(inputName.equalsIgnoreCase("juan"))
                countJuan++;
        }
        
        return countJuan;
    }
}
