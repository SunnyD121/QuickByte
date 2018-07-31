import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { HttpHeaders } from '@angular/common/http';
import { UserService } from '../../services/user-service/user-service.service';
import { User } from '../../objects/User';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginPageComponent implements OnInit {

    username = "";
    password = "";
    credentialCheck = false;

  constructor( private router: Router, private userService: UserService) { }

  ngOnInit() {
  }

  public validateCredentials(){
      this.userService.checkCredentials(this.username, this.password).subscribe(
          loginBoolean => {
              this.credentialCheck = loginBoolean;
              if (loginBoolean) this.router.navigate(['/homepage']);
              else {console.log("Invalid Credentials.")}
          },
          error =>{console.log(error)}
      );
  }

}
