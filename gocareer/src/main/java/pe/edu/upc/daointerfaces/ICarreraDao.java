package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Carrera;

public interface ICarreraDao {
	public void insert(Carrera a);
	public List<Carrera>list();
}
