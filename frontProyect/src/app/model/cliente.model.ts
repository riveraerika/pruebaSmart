export  class ClienteModel{
  constructor(
    public id_cliente: number,
    public nombre: string,
    public apellido: string,
    public direccion: string,
    public fecha_nacimiento: string,
    public telefono: string,
    public email: string
  ) {
  }
}
