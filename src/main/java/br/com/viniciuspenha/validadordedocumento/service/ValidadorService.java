package br.com.viniciuspenha.validadordedocumento.service;

import br.com.viniciuspenha.validadordedocumento.model.ClienteDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ValidadorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidadorService.class);

    public void validaDocumento(ClienteDTO clienteDTO) {
        // Apenas uma simulação de validação do documento
        LOGGER.info("ValidadorService.validaCriacaoDeConta - Iniciando validação de documento");
        // Pode baixar a imagem do CPF do S3 e comparar com as informações informadas pelo cliente
        LOGGER.info("ValidadorService.validaCriacaoDeConta - Baixando foto do CPF... {}", clienteDTO.getUrlCpfFoto());
        LOGGER.info("ValidadorService.validaCriacaoDeConta - Validando dados pessoais: {} {}", clienteDTO.getDadosPessoaisDTO().getNome(), clienteDTO.getDadosPessoaisDTO().getSobrenome());
        LOGGER.info("ValidadorService.validaCriacaoDeConta - Validando numero do CPF: {}", clienteDTO.getDadosPessoaisDTO().getCpf());
        LOGGER.info("ValidadorService.validaCriacaoDeConta - Validando informações de endereço");
        LOGGER.info("ValidadorService.validaCriacaoDeConta - {} - {}, {} - {}",
                clienteDTO.getEnderecoDTO().getRua(),
                clienteDTO.getEnderecoDTO().getBairro(),
                clienteDTO.getEnderecoDTO().getCidade(),
                clienteDTO.getEnderecoDTO().getEstado());
    }
}