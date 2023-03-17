
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import AaAgregateManager from "./components/listers/AaAgregateCards"
import AaAgregateDetail from "./components/listers/AaAgregateDetail"

import BbAgregateManager from "./components/listers/BbAgregateCards"
import BbAgregateDetail from "./components/listers/BbAgregateDetail"

import CcAgregateManager from "./components/listers/CcAgregateCards"
import CcAgregateDetail from "./components/listers/CcAgregateDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/aaAgregates',
                name: 'AaAgregateManager',
                component: AaAgregateManager
            },
            {
                path: '/aaAgregates/:id',
                name: 'AaAgregateDetail',
                component: AaAgregateDetail
            },

            {
                path: '/bbAgregates',
                name: 'BbAgregateManager',
                component: BbAgregateManager
            },
            {
                path: '/bbAgregates/:id',
                name: 'BbAgregateDetail',
                component: BbAgregateDetail
            },

            {
                path: '/ccAgregates',
                name: 'CcAgregateManager',
                component: CcAgregateManager
            },
            {
                path: '/ccAgregates/:id',
                name: 'CcAgregateDetail',
                component: CcAgregateDetail
            },




    ]
})
