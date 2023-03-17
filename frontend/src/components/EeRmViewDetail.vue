<template>

    <v-card outlined>
        <v-card-title>
            EeRm # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Fileid" v-model="item.fileid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filesize" v-model="item.filesize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filename" v-model="item.filename" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Userid" v-model="item.userid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsFileUpload" v-model="item.isFileUpload" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsFileIndexed" v-model="item.isFileIndexed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileUrl" v-model="item.fileUrl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'EeRmViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/eeRms/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

