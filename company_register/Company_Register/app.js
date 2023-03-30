require("dotenv").config();
const express= require("express");
const app=express();
const userRouter= require("./api/users/user.router");
app.use(express.json())
app.use("/api",userRouter)
app.listen(3020, () => {
    console.log("server is up on port : 3020")
})