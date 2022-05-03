package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Especialista;

public interface IEspecialistaService {
	public void insert(Especialista a);
	public List<Especialista>list();
}
