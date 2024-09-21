/**
 * 
 */
package br.com.vpelizzarisilva.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vpelizzarisilva.vendas.online.domain.Venda;

/**
 * @author Vinícius Pelizzari
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
