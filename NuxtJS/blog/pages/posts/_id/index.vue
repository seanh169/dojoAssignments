<template>
    <div class="single-post-page">
        <section class="post">
            <h1>{{loadedPost.title}}</h1>
            <div class="post-details">
                <div class="post-detail">
                    Last Updated On {{loadedPost.updatedDate | date}}
                </div>
                <div class="post-detail">
                    Written By {{loadedPost.author}}
                </div>

            </div>
            <p>{{loadedPost.content}}</p>
            <img :src="loadedPost.thumbnail">
        </section>
        <section class="post-feedback">
            <p>Let me know what you think about the post, send email <a href="mailto: tesT@domain.com"> here</a></p>
        </section>

    </div>
</template>

<script>
export default {
  async asyncData(context) {
     try{
       const singlePost = await context.app.$axios.$get('/posts/' + context.params.id + '.json')
       return { loadedPost: singlePost };
     }catch(e){
       console.log(e);
       context.error(e);
     }
     
  }
}
</script>

<style scoped>
.single-post-page {
  padding: 30px;
  text-align: center;
  box-sizing: border-box;
}

.post {
  width: 100%;
}

@media (min-width: 768px) {
  .post {
    width: 600px;
    margin: auto;
  }
}

.post-title {
  margin: 0;
}

.post-details {
  padding: 10px;
  box-sizing: border-box;
  border-bottom: 3px solid #ccc;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

@media (min-width: 768px) {
  .post-details {
    flex-direction: row;
  }
}

.post-detail {
  color: rgb(88, 88, 88);
  margin: 0 10px;
}

.post-feedback a {
  color: red;
  text-decoration: none;
}

.post-feedback a:hover,
.post-feedback a:active {
  color: salmon;
}

</style>