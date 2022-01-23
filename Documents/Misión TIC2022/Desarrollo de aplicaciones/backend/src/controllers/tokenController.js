const PRIVATE_KEY = process.env.JWT_PRIVATE_KEY;
const jwt = require('jsonwebtoken');

class TokenController {
    constructor() {
    }

    getToken(req) {
        let token = null;
        let authorization = req.headers.authorization;
        if(authorization != null && authorization != undefined){
            token = authorization.split(" ")[1];
        }
        return token;
    }

    verify = (token)=>{
        let decode =  jwt.decode(token, PRIVATE_KEY);
        return decode;
    }
}

module.exports = { TokenController, PRIVATE_KEY };