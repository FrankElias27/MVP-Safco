import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',

    loadComponent: () =>
      import('./pages/main/main.component').then(m => m.MainComponent),
    children: [
      {
        path: '',

        loadComponent: () =>
          import('./pages/home/home.component').then(m => m.HomeComponent),
      },
       {
        path: 'categories',
        loadComponent: () =>
          import('./pages/categories/categories.component').then(m => m.CategoriesComponent),
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomePageRoutingModule { }
