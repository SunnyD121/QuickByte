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
      return this.http.get<User[]>("http://18.206.54.186:8085/LoginServlet");
  }

    checkCredentials(username: string, password: string): Observable<any>{
      let user = new User();
      user.username = username;
      user.password = password;
      return this.http.post("http://18.206.54.186:8085/LoginServlet", user);
  }

  getAllUsers(): Observable<any>{
      return this.http.get("http://18.206.54.186:8085/GetAllUsersServlet");
  }

  banUser(username): Observable<any> {
      return this.http.post("http://18.206.54.186:8085/BanUserServlet", username);
  }




}
