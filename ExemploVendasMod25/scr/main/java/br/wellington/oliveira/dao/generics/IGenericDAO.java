package br.wellington.oliveira.dao.generics;

import java.util.Collection;

import br.wellington.oliveira.domain.Persistente;
import br.wellington.oliveira.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente> {

  
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

 
    public void excluir(Long valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(Long valor);


    public Collection<T> buscarTodos();
}