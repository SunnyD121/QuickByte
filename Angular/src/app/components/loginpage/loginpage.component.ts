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
    usernameCheck = false;
    passwordCheck = false;

  constructor( private router: Router, private userService: UserService) { }

  ngOnInit() {
  }


  public checkIfValidUsername(){
      alert("TODO: checkIfValidUsername() NOT IMPLEMENTED YET.");
      this.usernameCheck = true;
  }

  public checkIfValidPassword(){
      alert("TODO: checkIfValidPassword() NOT IMPLEMENTED YET.");
      this.passwordCheck = true;
  }
  public validateCredentials(){
      this.checkIfValidUsername();
      this.checkIfValidPassword();
      this.testFunction2();
      if (this.usernameCheck && this.passwordCheck){
          this.router.navigate(['/homepage']);
      }
      else {}
  }

  testFunction(){
      this.userService.getUser().subscribe(
          data => {
              console.log(data);
          },
          error => {
              console.log("ERROR");
              console.log(error);
          }
      );
      console.log("clicked!");
  }

  userList: Array<User>;    /*Not sure why I need this, but it was on Angular.io*/
  testFunction2(){
      console.log("commented out.");
      // this.userService.checkCredentials(this.username, this.password).subscribe(
      //     user => this.userList.push(this.username));
  }

}
