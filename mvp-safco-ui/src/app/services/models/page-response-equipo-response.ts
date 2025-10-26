/* tslint:disable */
/* eslint-disable */
import { EquipoResponse } from '../models/equipo-response';
export interface PageResponseEquipoResponse {
  content?: Array<EquipoResponse>;
  first?: boolean;
  last?: boolean;
  number?: number;
  size?: number;
  totalElements?: number;
  totalPages?: number;
}
