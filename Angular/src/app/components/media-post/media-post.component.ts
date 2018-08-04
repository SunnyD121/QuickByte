import { Component, OnInit, Input } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { UserPostService } from '../../services/post-service/user-post.service';
import { Comment } from '../../objects/Comment'

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    @Input() postId: number;
    @Input() postPic: string;
    @Input() postComments: Comment[];
    @Input() postRecipe: string;

    commentBody = "";
    createCommentDisplay: boolean;
    originalComment: Comment;

    //TODO: initialize with values from the database
    likeCounter = 0;
    dislikeCounter = 0;

    img1Path: string;

  constructor(private cookie: CookieService, private postService: UserPostService) {
      //TODO: Delete, these pictures are for testing only
      this.img1Path = 'assets/images/img_avatar1.png';
      // this.testImage = 'assets/images/testImage.png';
      // this.postPic = 'assets/images/main_pic.jpg';
  }

  public favoriteClicked(){
      alert("TODO: favoriteClicked() not implemented yet.");
  }
  public likeClicked(){
      this.likeCounter++;
  }
  public dislikeClicked(){
      this.dislikeCounter++;
  }
  public commentClicked(){
      this.createCommentDisplay = !this.createCommentDisplay;
  }

  public submitComment(){
      this.postService.createComment(this.postId, this.cookie.get('Username'), this.commentBody).subscribe(
          returnValue => {
              this.postComments.push(new Comment(this.cookie.get('Username'), returnValue, this.commentBody));
              this.createCommentDisplay = false;
              console.log("I hate you.");
              console.log(this.postComments);
          }, error => {
              console.log("ERROR");
              console.log(error);}
      );
  }

  ngOnInit() {
      this.createCommentDisplay = false;
      this.originalComment = this.postComments.shift();

  }

}
