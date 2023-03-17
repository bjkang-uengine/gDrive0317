<template>

    <v-data-table
        :headers="headers"
        :items="eeRm"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'EeRmView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileid", value: "fileid" },
                { text: "filesize", value: "filesize" },
                { text: "filename", value: "filename" },
                { text: "userid", value: "userid" },
                { text: "isFileUpload", value: "isFileUpload" },
                { text: "isFileIndexed", value: "isFileIndexed" },
                { text: "fileUrl", value: "fileUrl" },
            ],
            eeRm : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/eeRms'))

            temp.data._embedded.eeRms.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.eeRm = temp.data._embedded.eeRms;
        },
        methods: {
        }
    }
</script>

