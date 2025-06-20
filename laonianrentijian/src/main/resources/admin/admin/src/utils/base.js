const base = {
    get() {
        return {
            url : "http://localhost:8080/laonianrentijian/",
            name: "laonianrentijian",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/laonianrentijian/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "老年人体检管理系统"
        } 
    }
}
export default base
