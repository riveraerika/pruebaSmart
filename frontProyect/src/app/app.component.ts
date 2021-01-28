import { Component } from '@angular/core';
import {ClienteService} from "./services/cliente.service";
import {FacturaService} from "./services/factura.service";
import {FormBuilder, FormGroup} from '@angular/forms';
import {ClienteModel} from "./model/cliente.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  paradaForm: FormGroup;
  submitted = false;
  clientes: ClienteModel[];


  constructor(public ClienteService: ClienteService,
              public FacturaService: FacturaService,
              private formBuilder: FormBuilder,
              ) {
  }


  onSubmit() {

  }
}
