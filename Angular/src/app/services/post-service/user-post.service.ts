import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UserPost } from '../../objects/UserPost';

@Injectable({
  providedIn: 'root'
})
export class UserPostService {

  constructor(private http: HttpClient) { }

  getPost(){
      //return this.http.get("http://localhost:8081/", {});
  }

  public createComment(username, commentBody){
      return this.http.post("http://localhost:8081/CreateCommentServlet", {username: username, text: commentBody}); //user NAME, Text
  }


  httpOptions = {headers: new HttpHeaders({'Content-Type':  'multipart/form-data stream'})};

  public createPost(formData){
      return this.http.post("http://localhost:8081/CreatePostServlet", formData);
  }

}
