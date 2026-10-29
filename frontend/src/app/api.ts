
import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private http = inject(HttpClient);

  getProducts(): Observable<any[]> {
    return this.http.get<any[]>('/api/products');
  }

  getOrders(): Observable<any[]> {
    return this.http.get<any[]>('/api/orders');
  }

  getInventory(): Observable<any[]> {
    return this.http.get<any[]>('/api/inventory');
  }
}
