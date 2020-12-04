$(function () {
    var msg = [{"userid": "1", "username": "xxx", "address": "x", "mobile": "111"},
        {"userid": "2", "username": "sss", "address": "s", "mobile": "222"},
        {"userid": "3", "username": "ttt", "address": "t", "mobile": "333"},
        {"userid": "4", "username": "hhh", "address": "h", "mobile": "444"},
    ]
    var re= "";
    $.each(msg, function (i, ele) {
        $("#this").append("<tr>" + "<td>" + ele.userid + "</td>" + "<td>" + ele.username + "</td>" + "<td>" + ele.address + "</td>" + "<td>" + ele.mobile + "</td>" + "</tr>>");
    })
})