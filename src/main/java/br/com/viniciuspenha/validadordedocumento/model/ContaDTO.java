package br.com.viniciuspenha.validadordedocumento.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContaDTO {

    @JsonProperty("clienteId")
    private Long clienteId;

    @JsonProperty("agencia")
    private String agencia;

    @JsonProperty("conta")
    private String conta;

    @JsonProperty("codigoBanco")
    private String codigoBanco;

    @JsonProperty("saldo")
    private BigDecimal saldo;
}