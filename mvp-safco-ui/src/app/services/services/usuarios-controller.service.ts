/* tslint:disable */
/* eslint-disable */
import { HttpClient, HttpContext } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { BaseService } from '../base-service';
import { ApiConfiguration } from '../api-configuration';
import { StrictHttpResponse } from '../strict-http-response';

import { createUsuario } from '../fn/usuarios-controller/create-usuario';
import { CreateUsuario$Params } from '../fn/usuarios-controller/create-usuario';
import { deleteUsuario } from '../fn/usuarios-controller/delete-usuario';
import { DeleteUsuario$Params } from '../fn/usuarios-controller/delete-usuario';
import { findAllUsuarios } from '../fn/usuarios-controller/find-all-usuarios';
import { FindAllUsuarios$Params } from '../fn/usuarios-controller/find-all-usuarios';
import { PageResponseUsuarioResponse } from '../models/page-response-usuario-response';

@Injectable({ providedIn: 'root' })
export class UsuariosControllerService extends BaseService {
  constructor(config: ApiConfiguration, http: HttpClient) {
    super(config, http);
  }

  /** Path part for operation `findAllUsuarios()` */
  static readonly FindAllUsuariosPath = '/users';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findAllUsuarios()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllUsuarios$Response(params?: FindAllUsuarios$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseUsuarioResponse>> {
    return findAllUsuarios(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findAllUsuarios$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllUsuarios(params?: FindAllUsuarios$Params, context?: HttpContext): Observable<PageResponseUsuarioResponse> {
    return this.findAllUsuarios$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseUsuarioResponse>): PageResponseUsuarioResponse => r.body)
    );
  }

  /** Path part for operation `createUsuario()` */
  static readonly CreateUsuarioPath = '/users';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `createUsuario()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  createUsuario$Response(params: CreateUsuario$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return createUsuario(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `createUsuario$Response()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  createUsuario(params: CreateUsuario$Params, context?: HttpContext): Observable<number> {
    return this.createUsuario$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `deleteUsuario()` */
  static readonly DeleteUsuarioPath = '/users/{idUsuariop}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `deleteUsuario()` instead.
   *
   * This method doesn't expect any request body.
   */
  deleteUsuario$Response(params?: DeleteUsuario$Params, context?: HttpContext): Observable<StrictHttpResponse<void>> {
    return deleteUsuario(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `deleteUsuario$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  deleteUsuario(params?: DeleteUsuario$Params, context?: HttpContext): Observable<void> {
    return this.deleteUsuario$Response(params, context).pipe(
      map((r: StrictHttpResponse<void>): void => r.body)
    );
  }

}
