const base = {
    get() {
        return {
            url : "http://localhost:8080/yinhangzhanghuzhanghu/",
            name: "yinhangzhanghuzhanghu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yinhangzhanghuzhanghu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "银行账目账户管理系统"
        } 
    }
}
export default base
