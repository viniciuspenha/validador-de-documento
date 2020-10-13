package br.com.viniciuspenha.validadordedocumento.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("cliente")
    private DadosPessoaisDTO dadosPessoaisDTO;

    @JsonProperty("endereco")
    private EnderecoDTO enderecoDTO;

    @JsonProperty("urlCpfFoto")
    private String urlCpfFoto;
}