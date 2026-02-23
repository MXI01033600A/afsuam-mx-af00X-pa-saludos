package com.mx.sura_afore.af00X.microservicio.infrastructure.input.rest;

import com.mx.sura_afore.af00X.microservicio.application.usecase.SaludosUseCase;
import com.mx.sura_afore.af00X.microservicio.domain.model.SaludoRequest;
import com.mx.sura_afore.af00X.microservicio.domain.model.SaludosResponse;
import com.mx.sura_afore.af00X.microservicio.interfaces.controller.SaludosApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SaludosController implements SaludosApi {

    private final SaludosUseCase saludosUseCase;

    @Override
    public ResponseEntity<SaludosResponse> createSaludos(SaludoRequest saludoRequest) {
        return ResponseEntity.ok(saludosUseCase.orchestrateSaludos(saludoRequest.getName()));
    }
}
