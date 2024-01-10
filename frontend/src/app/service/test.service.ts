import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Fakepost } from '../fakepost'; //first check with Angular 17 and its HTTP requests

@Injectable({
  providedIn: 'root'
})
export class TestService {

  apiUrl:string = "https://jsonplaceholder.typicode.com/posts";

  constructor(private http: HttpClient) { }

  getAllPost(): Observable<Fakepost[]> {
    return this.http.get<Fakepost[]>(this.apiUrl);
  }
}
