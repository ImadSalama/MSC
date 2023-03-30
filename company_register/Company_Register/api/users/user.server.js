const pool = require('../../config/database')
module.exports ={
    company_register: (data,callBack) =>{
pool.query(
    `INSERT INTO company(ID, name, password, email,phone_number) VALUES (?,?,?,?,?)`,
    [data.ID,
    data.name,
    data.password,
    data.email,
    data.phone_number,
     ],
    (error,results) => {
        if(error){
      return  callBack(error)}
        return callBack(null,results)
    }
);
    },

}