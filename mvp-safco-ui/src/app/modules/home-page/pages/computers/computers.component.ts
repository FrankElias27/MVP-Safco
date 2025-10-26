import { DatePipe } from '@angular/common';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatDialog, MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { EquipoResponse } from '../../../../services/models';
import { EquiposControllerService } from '../../../../services/services/equipos-controller.service';
import { HttpClientModule } from '@angular/common/http';

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

  /*
  openAddEventModal() {
    const dialogRef = this.dialog.open(CreateEventComponent, {
      width: '600px',
    });

    dialogRef.afterClosed().subscribe(result => {
      if (!result) return; // Si no hay resultado, salimos

      if (result.defaultLayout) {
        // Caso defaultLayout = true
        this.eventsService.saveEventDefault({ body: result }).subscribe({
          next: (response: EventResponse) => {
            console.log('Evento creado con ID:', response.eventId);
            this.loadEvents();
            Swal.fire({
              icon: 'success',
              title: '¡Evento guardado!',
              text: 'El evento ha sido creado exitosamente.',
              confirmButtonText: 'OK',
            });
          },
          error: (error: any) => {
            console.error('Error al crear evento:', error);
            Swal.fire({
              icon: 'error',
              title: 'Error',
              text: 'No se pudo crear el evento.',
            });
          }
        });
      } else {
        // Caso defaultLayout = false
        this.eventsService.saveEvent({ body: result }).subscribe({
          next: (newEventId: number) => {
            console.log('Evento creado con ID:', newEventId);
            this.loadEvents();
            Swal.fire({
              icon: 'success',
              title: '¡Evento guardado!',
              text: 'El evento ha sido creado exitosamente.',
              confirmButtonText: 'OK',
            });
          },
          error: (error: any) => {
            console.error('Error al crear evento:', error);
            Swal.fire({
              icon: 'error',
              title: 'Error',
              text: 'No se pudo crear el evento.',
            });
          }
        });
      }
    });
  } */

}
