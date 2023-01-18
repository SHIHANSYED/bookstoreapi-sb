const express =require('express')
const app=express()
const port =7000;


const MongoClient = require('mongodb').MongoClient
 let db;
MongoClient.connect('mongodb://localhost:27017/store', (err, client) => {
  if (err) throw err
 db = client.db('store')
})

app.get('/',(req,res)=>{
db.collection('product').find().toArray((err, result) => {
    if (err) throw err
res.send(result)
    console.log(result)
  })

})


app.listen(port,()=>{console.log(`server is running on ${port}`);})


