import { DatePipe } from '@angular/common';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatDialog, MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { EquipoResponse } from '../../../../services/models';
import { EquiposControllerService } from '../../../../services/services/equipos-controller.service';
import Swal from 'sweetalert2';
import { CreateComputerComponent } from '../../modals/create-computer/create-computer.component';
import { TechnicalDetailComponent } from '../../modals/technical-detail/technical-detail.component';

@Component({
  selector: 'app-computers',
  imports: [
    MatTableModule,
    MatPaginatorModule,
    MatIconModule,
    DatePipe,
    MatDialogModule,
  ],
  templateUrl: './computers.component.html',
  styleUrl: './computers.component.css'
})
export class ComputersComponent implements OnInit {

  displayedColumns: string[] = ['CodInterno', 'Marca', 'Modelo', 'Serie', 'FechaCompra','Especificaciones','EstadoEquipo', 'TipoEquipo','Acciones'];
  dataSource = new MatTableDataSource<EquipoResponse>();
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  totalElements = 0;
  pageSize = 10;
  pageIndex = 0;

  constructor(private equiposService:EquiposControllerService,
    private dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.loadEquipos();
  }

  loadEquipos(): void {
    this.equiposService.findAllEquipos({ page: this.pageIndex, size: this.pageSize }).subscribe({
      next: (res) => {
        if (res.content) {
          this.dataSource.data = res.content;
        }
        this.totalElements = res.totalElements ?? 0;
      },
      error: (err) => console.error('Error al cargar equipos', err)
    });
  }


  onPageChange(equipos: any): void {
    this.pageIndex = equipos.pageIndex;
    this.pageSize = equipos.pageSize;
    this.loadEquipos();
  }


  openAddComputerModal() {
    const dialogRef = this.dialog.open(CreateComputerComponent, {
      width: '600px',

    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        console.log('Enviando al backend:', result);
        this.equiposService.createEquipo({ body: result }).subscribe({
          next: (newComputer) => {
            console.log('Computer creado:', newComputer);
            this.loadEquipos();
            Swal.fire({
              icon: 'success',
              title: '¡Equipo guardado!',
              text: 'El equipo ha sido creado exitosamente.',
              confirmButtonText: 'OK'
            });
          },
          error: (error) => {
            console.error('Error al crear equipo:', error);
            Swal.fire({
              icon: 'error',
              title: 'Error',
              text: error.error?.mensaje || 'No se pudo guardar el equipo.'
            });
          }
        });
      }
    });
  }

   openDetailsModal(idEquipo: number): void {
    const dialogRef = this.dialog.open(TechnicalDetailComponent, {
      panelClass: 'custom-modal',
      width: '60vw',
      data: { idEquipo },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result === 'updated') {
        this.loadEquipos();
      }
    });
  }


}
