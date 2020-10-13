package br.com.viniciuspenha.validadordedocumento.rabbit;

import br.com.viniciuspenha.validadordedocumento.model.ClienteDTO;
import br.com.viniciuspenha.validadordedocumento.service.ValidadorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoQueueConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacaoQueueConsumer.class);

    private final ValidadorService validadorService;
    private final ObjectMapper mapper;

    public ValidacaoQueueConsumer(ValidadorService validadorService, ObjectMapper mapper) {
        this.validadorService = validadorService;
        this.mapper = mapper;
    }

    @RabbitListener(queues = {"${validacao.queue}"})
    public void receive(@Payload String mensagem) {
        try {
            LOGGER.info("ContaConsumer.receive - Mensagem {}", mensagem);
            ClienteDTO clienteDTO = mapper.readValue(mensagem, ClienteDTO.class);
            validadorService.validaDocumento(clienteDTO);
        } catch (Exception e) {
            LOGGER.error("ContaConsumer.receive - Falha ao receber mensagem: {}", e.getMessage());
        }
    }
}