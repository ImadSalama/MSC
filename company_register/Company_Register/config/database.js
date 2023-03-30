const {createPool}=require('mysql')

const pool=createPool(
    {
        port:3306,
        host:"localhost",
        user:"root",
        password:"",
        database:"Waslni"
    }
)

module.exports=pool;
