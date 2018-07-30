import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../../objects/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'Authorization': 'my-auth-token'
    })
  };

  getUser(){
      return this.http.get<User[]>("http://localhost:8081/LoginServlet");
  }

  checkCredentials(username: string, password: string): Observable<any>{
      console.log("Posting:");
      // return this.http.post<User>("http://localhost:8081/LoginServlet", username, this.httpOptions);
      return this.http.post("http://localhost:8081/LoginServlet", username);
  }
}
