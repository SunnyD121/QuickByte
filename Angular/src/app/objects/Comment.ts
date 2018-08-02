export class Comment{
    public username:string;
    public date:Object;
    public message:string;

    constructor(un, dt, msg){
        this.username = un;
        this.date = dt;
        this.message = msg;
    }
}
