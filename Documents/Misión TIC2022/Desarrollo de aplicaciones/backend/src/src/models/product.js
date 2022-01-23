const {Schema, model} = require('mongoose');

const productSchema = Schema({
    name: {
        type: String
    },
    price:{
        type: Number
    }
},{
    collection: 'products'
});

module.exports = model('Product', productSchema);