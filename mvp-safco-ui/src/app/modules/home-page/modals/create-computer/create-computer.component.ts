import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';

@Component({
  selector: 'app-create-computer',
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatButtonModule,
    MatDialogModule,
    MatInputModule
  ],
  templateUrl: './create-computer.component.html',
  styleUrl: './create-computer.component.css'
})
export class CreateComputerComponent implements OnInit {

  equipoForm!: FormGroup;

  constructor(
    private fb: FormBuilder,
    private dialogRef: MatDialogRef<CreateComputerComponent>
  ) {}

  ngOnInit() {
    this.equipoForm = this.fb.group({
      codInterno: ['', Validators.required],
      empresaCompra: ['', Validators.required],
      linea: ['', Validators.required],
      marca: ['', Validators.required],
      modelo: ['', Validators.required],
      serie: ['', Validators.required],
      fechaCompra: ['', Validators.required],
      estadoEquipo: ['', Validators.required],
      tipoEquipo: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.equipoForm.valid) {
      this.dialogRef.close(this.equipoForm.value);
    }
  }

  onCancel() {
    this.dialogRef.close();
  }
}
