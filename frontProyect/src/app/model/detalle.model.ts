export class DetalleModel{
  constructor(
    public num_detalle: number,
    public id_factura: number,
    public id_producto: number,
    public precio: number,
    public cantidad: number
  ) {
  }
}
