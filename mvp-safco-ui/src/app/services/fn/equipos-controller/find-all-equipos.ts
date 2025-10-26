/* tslint:disable */
/* eslint-disable */
import { HttpClient, HttpContext, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { StrictHttpResponse } from '../../strict-http-response';
import { RequestBuilder } from '../../request-builder';

import { PageResponseEquipoResponse } from '../../models/page-response-equipo-response';

export interface FindAllEquipos$Params {
  page?: number;
  size?: number;
}

export function findAllEquipos(http: HttpClient, rootUrl: string, params?: FindAllEquipos$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseEquipoResponse>> {
  const rb = new RequestBuilder(rootUrl, findAllEquipos.PATH, 'get');
  if (params) {
    rb.query('page', params.page, {});
    rb.query('size', params.size, {});
  }

  return http.request(
    rb.build({ responseType: 'json', accept: 'application/json', context })
  ).pipe(
    filter((r: any): r is HttpResponse<any> => r instanceof HttpResponse),
    map((r: HttpResponse<any>) => {
      return r as StrictHttpResponse<PageResponseEquipoResponse>;
    })
  );
}

findAllEquipos.PATH = '/equipos';
