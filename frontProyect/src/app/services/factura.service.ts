import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment";
import HttpUtils from "../shared/http-utils";
import {ClienteModel} from "../model/cliente.model";
import {FacturaModel} from "../model/factura.model";

@Injectable({
  providedIn: 'root'
})
export class FacturaService {
  url = environment.apiUrl + '/facturas';

  constructor(private http: HttpUtils) {
  }

  get(from?: any, limit?: any): Promise<any> {
    let auxUrl = '';
    if (from || limit) {
      auxUrl += '?from=' + from + '&limit=' + limit;
    }
    return this.http.get(this.url + auxUrl);
  }

  getById(id: number): Promise<FacturaModel> {
    return this.http.get(this.url + id);
  }

  post(facturaModel: ClienteModel): Promise<FacturaModel> {
    return this.http.post(this.url + 'register', facturaModel);
  }

  put(facturaModel: ClienteModel): Promise<FacturaModel> {
    return this.http.put(this.url, facturaModel);
  }
}
