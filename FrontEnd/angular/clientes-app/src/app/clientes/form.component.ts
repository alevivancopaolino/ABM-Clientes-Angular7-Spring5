import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { Region } from './region';
import { ClienteService } from './cliente.service';
import { Router , ActivatedRoute } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  public cliente :Cliente = new Cliente();
  titulo: string="crear cliente";
  errores :String [];
  regiones : Region[];

  constructor(private clienteService:ClienteService ,
              private router:Router ,
              private activatedRoute:ActivatedRoute) { }
  ngOnInit() {
    this.cargarCliente();
  }

  cargarCliente():void{
    this.activatedRoute.params.subscribe(params => {
      let id = params['id'];
      if(id){
        this.clienteService.getCliente(id).subscribe((cliente) => this.cliente = cliente)
      }
    });

    this.clienteService.getRegiones().subscribe(regiones => this.regiones = regiones);

  }

  create() :void{
    this.clienteService.create(this.cliente)
    .subscribe(cliente => {
         this.router.navigate(['/clientes'])
         Swal.fire('Nuevo cliente' , `El cliente ${cliente.nombre} ha sido creado con èxito` , 'success')
       },
       err => {
         this.errores = err.error.errors as String [];
         console.log('Codigo de error dede el backend: '+err.status);
         console.log(err.error.errors);
       }
     )
  }

  update():void {
    this.cliente.facturas = null;
    this.clienteService.update(this.cliente)
    .subscribe((response) => {
      this.router.navigate(['/clientes']);
      Swal.fire('Cliente Actulizado' , `${response.mensaje} : ${response.cliente.nombre}` , 'success');
    },
    err=> {
      this.errores = err.error.errors as String [];
      console.log('Codigo de error dede el backend: '+err.status);
      console.log(err.error.errors);
    }
    )
  }

  compararRegion(o1:Region , o2:Region):boolean {
    if(o1==null && o2==null){
      return true;
    }

    return o1==null || o2==null? false : o1.id===o2.id;
  }

}
