package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Especialista;

public interface IEspecialistaDao {
	public void insert(Especialista a);
	public List<Especialista>list();
}
