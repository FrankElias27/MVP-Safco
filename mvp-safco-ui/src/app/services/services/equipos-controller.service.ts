/* tslint:disable */
/* eslint-disable */
import { HttpClient, HttpContext } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { BaseService } from '../base-service';
import { ApiConfiguration } from '../api-configuration';
import { StrictHttpResponse } from '../strict-http-response';

import { createEquipo } from '../fn/equipos-controller/create-equipo';
import { CreateEquipo$Params } from '../fn/equipos-controller/create-equipo';
import { deleteEquipo } from '../fn/equipos-controller/delete-equipo';
import { DeleteEquipo$Params } from '../fn/equipos-controller/delete-equipo';
import { findAllEquipos } from '../fn/equipos-controller/find-all-equipos';
import { FindAllEquipos$Params } from '../fn/equipos-controller/find-all-equipos';
import { PageResponseEquipoResponse } from '../models/page-response-equipo-response';

@Injectable({ providedIn: 'root' })
export class EquiposControllerService extends BaseService {
  constructor(config: ApiConfiguration, http: HttpClient) {
    super(config, http);
  }

  /** Path part for operation `findAllEquipos()` */
  static readonly FindAllEquiposPath = '/equipos';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findAllEquipos()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllEquipos$Response(params?: FindAllEquipos$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseEquipoResponse>> {
    return findAllEquipos(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findAllEquipos$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllEquipos(params?: FindAllEquipos$Params, context?: HttpContext): Observable<PageResponseEquipoResponse> {
    return this.findAllEquipos$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseEquipoResponse>): PageResponseEquipoResponse => r.body)
    );
  }

  /** Path part for operation `createEquipo()` */
  static readonly CreateEquipoPath = '/equipos';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `createEquipo()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  createEquipo$Response(params: CreateEquipo$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return createEquipo(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `createEquipo$Response()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  createEquipo(params: CreateEquipo$Params, context?: HttpContext): Observable<number> {
    return this.createEquipo$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `deleteEquipo()` */
  static readonly DeleteEquipoPath = '/equipos/{idEquipo}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `deleteEquipo()` instead.
   *
   * This method doesn't expect any request body.
   */
  deleteEquipo$Response(params: DeleteEquipo$Params, context?: HttpContext): Observable<StrictHttpResponse<void>> {
    return deleteEquipo(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `deleteEquipo$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  deleteEquipo(params: DeleteEquipo$Params, context?: HttpContext): Observable<void> {
    return this.deleteEquipo$Response(params, context).pipe(
      map((r: StrictHttpResponse<void>): void => r.body)
    );
  }

}
