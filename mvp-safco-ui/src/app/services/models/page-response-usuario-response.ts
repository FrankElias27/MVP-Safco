/* tslint:disable */
/* eslint-disable */
import { UsuarioResponse } from '../models/usuario-response';
export interface PageResponseUsuarioResponse {
  content?: Array<UsuarioResponse>;
  first?: boolean;
  last?: boolean;
  number?: number;
  size?: number;
  totalElements?: number;
  totalPages?: number;
}
