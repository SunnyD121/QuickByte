import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../../objects/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

    constructor(private http: HttpClient) { }

    httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
        'Authorization': 'my-auth-token'
      })
    };

      registerUser(username: string, password: string, creditCardNum: number): Observable<any>{
        let user = new User();
        user.username = username;
        user.password = password;
        return this.http.post("http://localhost:8081/LoginServlet",
        {username: username, password: password, creditCardNumber: creditCardNum});
    }
}
