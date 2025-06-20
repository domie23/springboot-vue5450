import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import jiangkangchangshi from '@/views/modules/jiangkangchangshi/list'
    import jibingyufang from '@/views/modules/jibingyufang/list'
    import singleSeach from '@/views/modules/singleSeach/list'
    import tijiantixing from '@/views/modules/tijiantixing/list'
    import tijianxiangmu from '@/views/modules/tijianxiangmu/list'
    import tijianxiangmuyuyye from '@/views/modules/tijianxiangmuyuyye/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryJiangkangchangshi from '@/views/modules/dictionaryJiangkangchangshi/list'
    import dictionaryJibingyufang from '@/views/modules/dictionaryJibingyufang/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionarySingleSeach from '@/views/modules/dictionarySingleSeach/list'
    import dictionaryTijiantixing from '@/views/modules/dictionaryTijiantixing/list'
    import dictionaryTijianxiangmu from '@/views/modules/dictionaryTijianxiangmu/list'
    import dictionaryTijianxiangmuyuyyeYesno from '@/views/modules/dictionaryTijianxiangmuyuyyeYesno/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'
	 import addTijiantixing from '@/views/modules/tijiantixing/add-or-update'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryJiangkangchangshi',
        name: '健康常识类型',
        component: dictionaryJiangkangchangshi
    }
    ,{
        path: '/dictionaryJibingyufang',
        name: '科普类型',
        component: dictionaryJibingyufang
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionarySingleSeach',
        name: '单页数据类型',
        component: dictionarySingleSeach
    }
    ,{
        path: '/dictionaryTijiantixing',
        name: '体检状态',
        component: dictionaryTijiantixing
    }
	,{
	    path: '/addTijiantixing',
	    name: '添加体检提醒',
	    component: addTijiantixing
	}
	
    ,{
        path: '/dictionaryTijianxiangmu',
        name: '体检项目类型',
        component: dictionaryTijianxiangmu
    }
    ,{
        path: '/dictionaryTijianxiangmuyuyyeYesno',
        name: '审核状态',
        component: dictionaryTijianxiangmuyuyyeYesno
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '在线咨询',
        component: chat
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/jiangkangchangshi',
        name: '健康常识',
        component: jiangkangchangshi
      }
    ,{
        path: '/jibingyufang',
        name: '疾病预防',
        component: jibingyufang
      }
    ,{
        path: '/singleSeach',
        name: '单页数据',
        component: singleSeach
      }
    ,{
        path: '/tijiantixing',
        name: '体检提醒',
        component: tijiantixing
      }
    ,{
        path: '/tijianxiangmu',
        name: '体检项目',
        component: tijianxiangmu
      }
    ,{
        path: '/tijianxiangmuyuyye',
        name: '体检项目预约',
        component: tijianxiangmuyuyye
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
