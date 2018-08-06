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
        return this.http.post("http://18.206.54.186:8085//RegisterServlet",
            {username: username, password: password, creditCardNumber: creditCardNum.toString()});
    }

    checkUniqueUsername(username: string): Observable<any>{
        return this.http.post("http://18.206.54.186:8085//UniqueUsernameServlet", {username: username});
    }

    checkValidCardNumber(cardNum: number): Observable<any>{
        return this.http.post("http://18.206.54.186:8085//CreditCardVerificationServlet", {creditCardNumber: cardNum.toString()})
    }
}
