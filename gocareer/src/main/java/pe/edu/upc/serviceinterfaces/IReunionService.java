package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Reunion;

public interface IReunionService {
	public void insert(Reunion reu);
	public List<Reunion> list();
}
