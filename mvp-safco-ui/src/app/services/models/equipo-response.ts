/* tslint:disable */
/* eslint-disable */
export interface EquipoResponse {
  capacidadDiscoD?: string;
  caracDiscoD?: string;
  caracRAM?: string;
  codInterno?: string;
  descripcionProce?: string;
  empresaCompra?: string;
  estadoEquipo?: 'RENOVADA' | 'DEVUELTA' | 'OPERATIVA' | 'ROBADA';
  fechaCompra?: string;
  idEquipo?: number;
  licenciaAntivirus?: string;
  licenciaOffice?: string;
  linea?: string;
  macWifi?: string;
  marca?: string;
  memoriaRam?: string;
  modelo?: string;
  modeloCargador?: string;
  procesador?: string;
  serie?: string;
  serieCargador?: string;
  tipoEquipo?: 'ALQUILADA' | 'SAFCO';
}
