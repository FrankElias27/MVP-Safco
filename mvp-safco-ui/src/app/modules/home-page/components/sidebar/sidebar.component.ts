import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  imports: [],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.css'
})
export class SidebarComponent {

  constructor(
    private router: Router,){}

  goToHome() {
  const isMobile = window.innerWidth <= 768;
  this.router.navigate(['/home']).then(() => {
    if (isMobile) {
      this.closeSidebar();
    }
  });
  }

  goToCategories() {
  const isMobile = window.innerWidth <= 768;
  this.router.navigate(['/home/categories']).then(() => {
    if (isMobile) {
      this.closeSidebar();
    }
  });
  }

  closeSidebar() {
  const sidebar = document.getElementById('default-sidebar');
  if (sidebar) {
    sidebar.classList.add('-translate-x-full');
  }

  const overlay = document.querySelector('[drawer-backdrop]') as HTMLElement;
  if (overlay) {
    overlay.remove();
  }
}

}
