<template>
  <div id="app">
    <Headers/>
    <router-view/>
  </div>
</template>
<script>
import headeres from "../components/headers.vue"

export default {
    name: 'app',
    data: ()=>({

    }),
    components: {
      Headers,
    }
};
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

</style>
