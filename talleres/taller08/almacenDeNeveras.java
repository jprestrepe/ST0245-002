   public class almacenDeNeveras{
   
   public static void asignarSolicitudes(Stack<Nevera> listaNev, Queue<Solicitud> listaSol){		
	  String res = "[";
		for(int k = listaSol.size();k>0;k--){
			Solicitud sol = listaSol.remove();		
			res+="('"+sol.getEntidad()+"' ,[";		
			for(int i = 0;i<sol.getCantidadNeveras();i++){	
			if(listaNev.size() == 0) break;
			if(i==sol.getCantidadNeveras()-1 || listaNev.size() == 1)
			res+=listaNev.pop().imprimirNevera();
			else res+=listaNev.pop().imprimirNevera()+",";					
		}			
			res+="])";		
			if(listaNev.size() == 0) break;
			else res+=",\n";
		}
		res+="]";	
		System.out.println(res);
	}
  }
