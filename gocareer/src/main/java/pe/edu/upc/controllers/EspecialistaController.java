package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Especialista;
import pe.edu.upc.serviceinterfaces.IEspecialistaService;

@Named
@RequestScoped
public class EspecialistaController {
	
	@Inject
	private IEspecialistaService eService;
	
	private Especialista e;
	List<Especialista> listaEspecialista;
	
	@PostConstruct
	public void init() {
		this.listaEspecialista=new ArrayList<Especialista>();
		this.e=new Especialista();
		this.list();
	}
	
	public String newEspecialista() {
		this.setE(new Especialista());
		return "especialista.xhtml";
	}
	
	public void insert() {
		try {
			eService.insert(e);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Especialista");
		}
	}
	
	public void list() {
		try {
			eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Especialista");
		}
	}
	
	public Especialista getE() {
		return e;
	}
	public void setE(Especialista e) {
		this.e = e;
	}
	public List<Especialista> getListaEspecialista() {
		return listaEspecialista;
	}
	public void setListaEspecialista(List<Especialista> listaEspecialista) {
		this.listaEspecialista = listaEspecialista;
	}
	
	
}
