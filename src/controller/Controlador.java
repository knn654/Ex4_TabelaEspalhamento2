package controller;

import javax.swing.JOptionPane;

import model.Departamento;
import model.Lista;

public class Controlador {
	
	Lista[] tabelaEspalhamento;
	
	public Controlador(int andares) {
		tabelaEspalhamento = new Lista[andares];
		
		for (int i = 0; i < andares; i++) {
			tabelaEspalhamento[i] = new Lista();
		}
	}
	
	public void inserir(Departamento dept) throws Exception {
		int hash = hashCode(dept);
		Lista l = tabelaEspalhamento[hash];
		l.addLast(dept);
	}
	
	public Departamento consultar(Departamento dept) throws Exception {
		int hash = hashCode(dept);
		Lista l = tabelaEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Departamento d = (Departamento) l.get(i);
			if(d.getAndar() == dept.getAndar() && d.getNome().equals(dept.getNome())) {
				return d;
			}
		}
		JOptionPane.showMessageDialog(null, "Departamento não encontrado!");
		return null;
		
	}
	
	public void remover(Departamento dept) throws Exception {
		int hash = hashCode(dept);
		Lista l = tabelaEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Departamento d = (Departamento) l.get(i);
			if(d.getAndar() == dept.getAndar() && d.getNome().equals(dept.getNome())) {
				l.remove(i);
				JOptionPane.showMessageDialog(null, "Departamento deletado com sucesso!");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Departamento não encontrado!");
	}
	
	private int hashCode(Departamento dep) {
		return dep.getAndar() * 1;
	}
}
