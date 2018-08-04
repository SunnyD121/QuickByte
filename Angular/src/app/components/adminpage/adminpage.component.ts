import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user-service/user-service.service';


@Component({
  selector: 'app-adminpage',
  templateUrl: './adminpage.component.html',
  styleUrls: ['./adminpage.component.css']
})
export class AdminPageComponent implements OnInit {

    users: Array<Object>;

    public banUser(name){
        this.userService.banUser(name).subscribe(
            returnValue => {
                console.log(returnValue);
                if (returnValue){
                    this.findUserByName(name)["userStatus"] = 0;
                }
                else console.log("error occured banning the user");
            }, error => {console.log(error)}
        );
    }



    constructor(private userService: UserService) { }

    ngOnInit() {
        this.users = new Array;
        this.userService.getAllUsers().subscribe(
            returnValue => {
                console.log(returnValue);
                this.users = returnValue;
            }, error => {console.log(error)}
        );
    }

    private findUserByName(name): Object{
        for (let user of this.users){
            if (user["username"] == name) return user;
        }
    }

}
