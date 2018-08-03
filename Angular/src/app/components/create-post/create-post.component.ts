import { Component, OnInit } from '@angular/core';
import { RequestOptions } from '@angular/http';
import { HttpClient } from '@angular/common/http';
import { UserPostService } from '../../services/post-service/user-post.service';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-post',
  templateUrl: './create-post.component.html',
  styleUrls: ['./create-post.component.css']
})
export class CreatePostComponent implements OnInit {

  constructor(private router: Router, private http: HttpClient, private postService: UserPostService, private cookie: CookieService) { }

  ngOnInit() {
      this.displayModal = "none";
  }

    rejectRequest = false;
    validCriteria = ["American", "British", "Carribean", "Chinese", "French", "German", "Greek", "Indian", "Italian", "Japanese", "Korean", "Mexican", "Portuguese", "Spanish", "Thai"];
    postName:string;
    recipe:string;
    comment:string
    tag:string;
    displayModal:string;
    image:File;
    imgSrc = "";

    public showModal(){
        this.displayModal = "block";
    }

    public closeModal(){
        this.displayModal = "none";
    }

    onSelectFile(event) {
        if (event.target.files && event.target.files[0]) {
            this.image = <File>event.target.files[0];

            var reader = new FileReader();
            reader.readAsDataURL(event.target.files[0]); // read file as data url
            reader.onload = (event) => { // called once readAsDataURL is completed
            // console.log(event.srcElement);
            this.imgSrc = event.srcElement["result"];
            }
        }
    }

    onSelectTag(event){
        this.tag = event.target.value;
    }




    public onSubmitClicked(){

        let formData = new FormData();
        formData.append('file', this.image);
        formData.append('username', this.cookie.get('Username'));
        formData.append('postName', this.postName);
        formData.append('recipe', this.recipe);
        formData.append('comment', this.comment);
        formData.append('tag', this.tag);
        this.postService.createPost(formData).subscribe(
            returnValue =>{
                console.log(returnValue);

                this.router.navigate(['/homepage']);
            }, error => {console.log(error)}
        )
    }
}
