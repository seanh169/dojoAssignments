import express from 'express';

const app = express();

app.get('/', (req, res) => {

    res.send('hi Sean!!!!!');

});


app.listen(8080, () => {
    console.log(`Listening on PORT 8080`);
})