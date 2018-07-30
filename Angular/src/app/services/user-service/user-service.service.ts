import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../../objects/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  // const httpOptions = {
  //   headers: new HttpHeaders({
  //     'Content-Type':  'application/json',
  //     'Authorization': 'my-auth-token'
  //   })
  // };

  getUser(){
      return this.http.get<User[]>("http://localhost:8081/LoginServlet");
  }

  checkCredentials(username: string, password: string): Observable<any>{
      console.log("Posting:");
      let user = new User();
      user.username = username;
      user.password = password;
      console.log(user);
      // return this.http.post<User>("http://localhost:8081/LoginServlet", username, this.httpOptions);
      return this.http.post<User>("http://localhost:8081/LoginServlet", {username: user.username, password: user.password});
  }
}
