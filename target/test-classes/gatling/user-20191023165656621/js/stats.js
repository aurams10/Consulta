var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "28545",
        "ok": "1361",
        "ko": "27184"
    },
    "minResponseTime": {
        "total": "306",
        "ok": "306",
        "ko": "9570"
    },
    "maxResponseTime": {
        "total": "59430",
        "ok": "58177",
        "ko": "59430"
    },
    "meanResponseTime": {
        "total": "34903",
        "ok": "52714",
        "ko": "34011"
    },
    "standardDeviation": {
        "total": "18372",
        "ok": "6224",
        "ko": "18325"
    },
    "percentiles1": {
        "total": "44842",
        "ok": "53804",
        "ko": "44379"
    },
    "percentiles2": {
        "total": "52171",
        "ok": "55036",
        "ko": "51442"
    },
    "percentiles3": {
        "total": "55706",
        "ok": "56011",
        "ko": "55694"
    },
    "percentiles4": {
        "total": "58462",
        "ok": "56294",
        "ko": "58469"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 17,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 1344,
        "percentage": 5
    },
    "group4": {
        "name": "failed",
        "count": 27184,
        "percentage": 95
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "4.016",
        "ok": "0.192",
        "ko": "3.825"
    }
},
contents: {
"req_smoketest-ebeac": {
        type: "REQUEST",
        name: "SmokeTest",
path: "SmokeTest",
pathFormatted: "req_smoketest-ebeac",
stats: {
    "name": "SmokeTest",
    "numberOfRequests": {
        "total": "28545",
        "ok": "1361",
        "ko": "27184"
    },
    "minResponseTime": {
        "total": "306",
        "ok": "306",
        "ko": "9570"
    },
    "maxResponseTime": {
        "total": "59430",
        "ok": "58177",
        "ko": "59430"
    },
    "meanResponseTime": {
        "total": "34903",
        "ok": "52714",
        "ko": "34011"
    },
    "standardDeviation": {
        "total": "18372",
        "ok": "6224",
        "ko": "18325"
    },
    "percentiles1": {
        "total": "44839",
        "ok": "53804",
        "ko": "44386"
    },
    "percentiles2": {
        "total": "52171",
        "ok": "55036",
        "ko": "51443"
    },
    "percentiles3": {
        "total": "55706",
        "ok": "56011",
        "ko": "55694"
    },
    "percentiles4": {
        "total": "58462",
        "ok": "56294",
        "ko": "58469"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 17,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 1344,
        "percentage": 5
    },
    "group4": {
        "name": "failed",
        "count": 27184,
        "percentage": 95
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "4.016",
        "ok": "0.192",
        "ko": "3.825"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
