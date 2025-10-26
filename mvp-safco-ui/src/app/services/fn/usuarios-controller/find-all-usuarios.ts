/* tslint:disable */
/* eslint-disable */
import { HttpClient, HttpContext, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { StrictHttpResponse } from '../../strict-http-response';
import { RequestBuilder } from '../../request-builder';

import { PageResponseUsuarioResponse } from '../../models/page-response-usuario-response';

export interface FindAllUsuarios$Params {
  page?: number;
  size?: number;
}

export function findAllUsuarios(http: HttpClient, rootUrl: string, params?: FindAllUsuarios$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseUsuarioResponse>> {
  const rb = new RequestBuilder(rootUrl, findAllUsuarios.PATH, 'get');
  if (params) {
    rb.query('page', params.page, {});
    rb.query('size', params.size, {});
  }

  return http.request(
    rb.build({ responseType: 'json', accept: 'application/json', context })
  ).pipe(
    filter((r: any): r is HttpResponse<any> => r instanceof HttpResponse),
    map((r: HttpResponse<any>) => {
      return r as StrictHttpResponse<PageResponseUsuarioResponse>;
    })
  );
}

findAllUsuarios.PATH = '/users';
