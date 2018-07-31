import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserPost } from '../../objects/UserPost';

@Injectable({
  providedIn: 'root'
})
export class UserPostService {

  constructor(private http: HttpClient) { }

  getPost(){
      // return this.http.get<Post[]>("http://localhost:8085/" /* fill in the rest here with the servlet stuff*/);
  }
}
