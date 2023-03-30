const {Company_register}=require('./user.controller')
const router =require("express").Router();
router.post("/Company_register",Company_register);
module.exports =router;