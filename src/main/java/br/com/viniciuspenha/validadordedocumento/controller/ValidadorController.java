package br.com.viniciuspenha.validadordedocumento.controller;

import br.com.viniciuspenha.validadordedocumento.model.ClienteDTO;
import br.com.viniciuspenha.validadordedocumento.service.ValidadorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validador")
public class ValidadorController {

    private final ValidadorService validadorService;

    public ValidadorController(ValidadorService validadorService) {
        this.validadorService = validadorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void validaDocumento(@RequestBody ClienteDTO clienteDTO) {
        validadorService.validaDocumento(clienteDTO);
    }
}