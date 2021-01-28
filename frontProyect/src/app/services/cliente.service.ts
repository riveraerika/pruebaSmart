import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment";
import HttpUtils from "../shared/http-utils";
import {ClienteModel} from "../model/cliente.model";

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  url = environment.apiUrl + '/clientes';

  constructor(private http: HttpUtils) {
  }

  get(from?: any, limit?: any): Promise<any> {
    let auxUrl = '';
    if (from || limit) {
      auxUrl += '?from=' + from + '&limit=' + limit;
    }
    return this.http.get(this.url + auxUrl);
  }

  getById(id: number): Promise<ClienteModel> {
    return this.http.get(this.url + id);
  }

  post(clienteModel: ClienteModel): Promise<ClienteModel> {
    return this.http.post(this.url + 'register', clienteModel);
  }

  put(clienteModel: ClienteModel): Promise<ClienteModel> {
    return this.http.put(this.url, clienteModel);
  }

}
