package APIRest;

import java.util.ArrayList;
import java.util.List;

import aspects.Logger;
import aspects.LoggerDAOhiberJPA;

public class StatService {
	
	LoggerDAOhiberJPA loggerDao;
	
	public StatService() {
		loggerDao = new LoggerDAOhiberJPA();
	}
	
	
	public List<Stat> getStatAsList(String entidad) {
		String[] operations = {"alta","baja","modificacion"};
		List<Stat> listaStats = new ArrayList<Stat>();
		for(String elemento : operations){
			List<Logger> logList = new ArrayList<Logger>();
			logList.addAll(loggerDao.getLogsFromOperationAndEntity(elemento,entidad));
			listaStats.add(new Stat(elemento,logList.size()));
		}
		return listaStats;
	}


}
	
