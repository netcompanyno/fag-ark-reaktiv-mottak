package no.mesan.reaktiv.fengsel.mottak.rest;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * REST-service for å registrere fange.
 *
 * @author Christian Ihle
 */
public interface MottakRestService {

    @POST("/mottak/")
    Response startFangemottak(@Body FangeDto fange);
}