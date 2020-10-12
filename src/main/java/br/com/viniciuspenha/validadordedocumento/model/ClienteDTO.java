package br.com.viniciuspenha.validadordedocumento.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDTO {

    @JsonProperty("cliente")
    private DadosPessoaisDTO dadosPessoaisDTO;

    @JsonProperty("endereco")
    private EnderecoDTO enderecoDTO;

    @JsonProperty("urlCpfFoto")
    private String urlCpfFoto;
}