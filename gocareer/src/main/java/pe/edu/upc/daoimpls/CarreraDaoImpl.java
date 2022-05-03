package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICarreraDao;
import pe.edu.upc.entities.Carrera;

public class CarreraDaoImpl implements ICarreraDao {
	@PersistenceContext(unitName = "gocareer")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Carrera a) {
		try {
			em.persist(a);
		} catch (Exception e) {
			System.out.println("Error al insertar en carrera dao");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carrera> list() {
		List<Carrera> listaCarrera = new ArrayList<Carrera>();
		try {
			Query jpql2 = em.createQuery("from Carrera a");
			listaCarrera = (List<Carrera>) jpql2.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar carrera en el dao");
		}
		return null;
	}

}
