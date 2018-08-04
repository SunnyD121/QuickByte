export class Comment{
    public commentName:string;
    public date:Object;
    public commentText:string;

    constructor(un, dt, msg){
        this.commentName = un;
        this.date = dt;
        this.commentText = msg;
    }
}
