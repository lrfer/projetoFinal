package trabalhoFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArquivoBinario<T> implements IArquivoBinario<T> {
	
	  
	public void GerarArquivoBinario(ArrayList<T> lista,String nomeArquivo) {
	    	String path = "C:/" + nomeArquivo;
	    	File filename = new File(path+".bin");
	    	
	    	try {
	    		FileWriter fw = new FileWriter(filename);
                        try (Writer output = new BufferedWriter(fw)) {
                            int sz = lista.size();
                            for(int i = 0; i < sz; i++)
                            {
                                output.write(lista.get(i).toString() + "\n");
                            }
                        }
	    	}
	    	catch(IOException e)
	    	{
	    		JOptionPane.showMessageDialog(null,"Nao foi possivel criar o arquivo");
	    	}    	
	    }

}
