
import { Component, OnInit, inject, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from './api';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {
  private api = inject(ApiService);

  products = signal<any[]>([]);
  orders = signal<any[]>([]);
  inventory = signal<any[]>([]);

  productError = signal('');
  orderError = signal('');
  inventoryError = signal('');

  ngOnInit(): void {
    this.api.getProducts().subscribe({
      next: data => this.products.set(data),
      error: err => {
        console.error('Products API failed:', err);
        this.productError.set('Unable to load products.');
      }
    });

    this.api.getOrders().subscribe({
      next: data => this.orders.set(data),
      error: err => {
        console.error('Orders API failed:', err);
        this.orderError.set('Unable to load orders.');
      }
    });

    this.api.getInventory().subscribe({
      next: data => this.inventory.set(data),
      error: err => {
        console.error('Inventory API failed:', err);
        this.inventoryError.set('Unable to load inventory.');
      }
    });
  }
}
