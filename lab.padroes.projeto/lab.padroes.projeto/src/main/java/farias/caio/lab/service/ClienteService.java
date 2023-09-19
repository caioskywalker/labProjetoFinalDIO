package farias.caio.lab.service;


import farias.caio.lab.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscartTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
	

}
