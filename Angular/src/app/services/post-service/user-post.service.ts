import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UserPost } from '../../objects/UserPost';

@Injectable({
  providedIn: 'root'
})
export class UserPostService {

  constructor(private http: HttpClient) { }

  getPost(){
      
  }

  public createComment(id, username, commentBody){
      return this.http.post("http://18.206.54.186:8085/CreateCommentServlet", {postId: id, username: username, text: commentBody}); //user NAME, Text
  }


  httpOptions = {headers: new HttpHeaders({'Content-Type':  'multipart/form-data stream'})};


  public createPost(formData){
      return this.http.post("http://18.206.54.186:8085/CreatePostServlet", formData);
  }

  public getPostsByTag(tagName){
      return this.http.post("http://18.206.54.186:8085/SearchPostServlet", tagName);
  }

}
