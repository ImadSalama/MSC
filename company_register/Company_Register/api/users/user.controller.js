const {company_register}=require('./user.server')
const {hashSync}=require("bcrypt")
const salt='$2b$10$t4WgKBhUl6fApe3RLglxP.'
module.exports ={
  Company_register: (req,res) => {
const body=req.body; 
body.password=hashSync(body.password,salt)
company_register(body, (err) =>
{
    if (err){
        console.log(err)
        return res.status(500).json({
            status:500,
            massage:"database connection error "}
        );

    }
    return res.status(200).json({
        status:200,
        massage:'Sign up successflly'}
    );

})
    },

}

