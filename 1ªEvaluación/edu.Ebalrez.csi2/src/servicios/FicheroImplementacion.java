package servicios;

import java.io.FileWriter;
import java.time.LocalDate;

public class FicheroImplementacion implements FicheroInterfaz{

	@Override
	public void ficheroLog(String mensaje) {
		// TODO Auto-generated method stub
		
		try {
			
			LocalDate fechaHoy = LocalDate.now();
			
			String rutaFichero="C:\\Users\\csi22\\Documents\\DWS\\1ªEvaluación\\edu.Ebalrez.csi2\\src\\auditoria\\log-"+fechaHoy+".txt";
			
			FileWriter fw = new FileWriter(rutaFichero,true);
			fw.write(mensaje+"\n");
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	
		
	}
	

}
