package com.example.kafkademo.util;

import org.apache.kafka.common.errors.TimeoutException;

public final class KafkaErrorHandlerUtils {

    private KafkaErrorHandlerUtils() {
        // Impede a instância da classe utilitária
    }

    /**
     * Verifica se uma exceção é considerada recuperável e elegível para reprocessamento.
     *
     * @param exception a exceção a ser verificada
     * @return true se a exceção é considerada recuperável, false caso contrário
     */
    public static boolean isRetryable(Exception exception) {
        return !(exception instanceof TimeoutException);
    }

    /**
     * Verifica se uma exceção é uma exceção de tempo limite.
     *
     * @param exception a exceção a ser verificada
     * @return true se a exceção é uma exceção de tempo limite, false caso contrário
     */
    public static boolean isTimeoutException(Exception exception) {
        return exception instanceof TimeoutException;
    }
}
