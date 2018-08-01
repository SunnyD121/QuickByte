import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../../objects/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

    constructor(private http: HttpClient) { }

      registerUser(username: string, password: string, creditCardNum: number): Observable<any>{
        return this.http.post("http://localhost:8081/LoginServlet",
            {username: username, password: password, creditCardNumber: creditCardNum});
    }
}
