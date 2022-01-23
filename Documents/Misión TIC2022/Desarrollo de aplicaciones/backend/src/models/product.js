const {Schema, model} = require('mongoose');

const productSchema = Schema({
    name: {
        type: String
    },
    price:{
        type: Number
    },
    user_email:{
        type: String
    }
},{
    collection: 'products'
});

module.exports = model('Product', productSchema);