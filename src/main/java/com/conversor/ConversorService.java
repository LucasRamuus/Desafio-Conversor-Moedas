package com.conversor;

import java.util.Map;

public class ConversorService {
    private ExchangeRateApi api = new ExchangeRateApi();

    public double converter(String origem, String destino, double valor) {
        try {
            Map<String, Double> taxas = api.buscarTaxas(origem);
            if (!taxas.containsKey(destino)) {
                throw new ErroConversaoException("Moeda de destino inválida: " + destino);
            }
            double taxa = taxas.get(destino);
            return valor * taxa;
        } catch (Exception e) {
            throw new ErroConversaoException("Erro ao converter de " + origem + " para " + destino, e);
        }
    }
}
