$(function () {
    var msg =  [{"userid":"01","username":"奥特曼","address":"M-78星云","mobile":"110"},
        {"userid":"02","username":"花园宝宝","address":"花园","mobile":"233"},
        {"userid":"03","username":"天线宝宝","address":"忘了","mobile":"666"},
        {"userid":"04","username":"奥斯卡","address":"影帝诚","mobile":"555"},
    ]
    var re = "";
    $.each(msg,function (i, ele) {
        // re += ele.userid +""+ele.username+""+ele.address+""+ele.mobile;
        $("#this").append("<option value="+ele+">"+ele.userid+"-"+ele.username+"-"+ele.address+ele.mobile+"</option>");
    })

    var re0 = "";
    $.each(msg,function (i, ele) {
        $("#this2").append("<tr>"+"<td>"+ele.userid+"</td>"+"<td>"+ele.username+"</td>"+"<td>"+ele.address+"</td>"+"<td>"+ele.mobile+"</td>"+"</tr>>");
    })
})