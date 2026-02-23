package com.mx.sura_afore.af00X.microservicio.application.usecase;

import com.mx.sura_afore.af00X.microservicio.domain.model.SaludosResponse;
import com.mx.sura_afore.af00X.microservicio.infrastructure.output.client.HelloWorldClient;
import com.mx.sura_afore.af00X.microservicio.infrastructure.output.client.CreaSaludoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaludosUseCase {

    private final HelloWorldClient helloWorldClient;
    private final CreaSaludoClient creaSaludoClient;

    public SaludosResponse orchestrateSaludos(String name) {
        HelloWorldClient.HelloWorldResponse hwResponse = helloWorldClient.getHelloWorld();
        CreaSaludoClient.SaludoResponse csResponse = creaSaludoClient.getSaludo(name);

        SaludosResponse response = new SaludosResponse();
        response.setSaludoPersonalizado(csResponse.getSaludo());

        if (hwResponse != null && hwResponse.getData() != null) {
            response.setMensajeSistema(hwResponse.getData().getMessage());
            response.setEstadoSistema(hwResponse.getData().getStatus());
        }

        return response;
    }
}
