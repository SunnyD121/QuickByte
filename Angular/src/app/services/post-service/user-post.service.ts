import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserPost } from '../../objects/UserPost';

@Injectable({
  providedIn: 'root'
})
export class UserPostService {

  constructor(private http: HttpClient) { }

  getPost(){
      //return this.http.get("http://localhost:8085/", {});
  }

  createComment(username, commentBody){
      return this.http.get("http://localhost:8085/createCommentServlet", {username: username, text: commentBody}); //user NAME, Text
  }
}
