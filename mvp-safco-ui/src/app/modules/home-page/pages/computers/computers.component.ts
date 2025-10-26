import { DatePipe } from '@angular/common';
import { Component, ViewChild } from '@angular/core';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';

@Component({
  selector: 'app-computers',
  imports: [
    MatTableModule,
    MatPaginatorModule,
    MatIconModule,
    DatePipe,
    MatDialogModule
  ],
  templateUrl: './computers.component.html',
  styleUrl: './computers.component.css'
})
export class ComputersComponent {

  displayedColumns: string[] = ['Titulo', 'Acciones'];
  dataSource = new MatTableDataSource<any>();
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  totalElements = 0;
  pageSize = 10;
  pageIndex = 0;

  onPageChange(event: any): void {
    this.pageIndex = event.pageIndex;
    this.pageSize = event.pageSize;

  }

}
