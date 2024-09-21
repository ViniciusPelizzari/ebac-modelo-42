/**
 * 
 */
package br.com.vpelizzarisilva.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vpelizzarisilva.vendas.online.domain.Cliente;

/**
 * @author Vinícius Pelizzari
 *
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
