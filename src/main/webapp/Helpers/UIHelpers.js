var UIHelpers = function () {
   
    return {

        BeginServiceCall: function() {
            UIHelpers.DisplayAjax();
        },

        EndServiceCall: function () {
            UIHelpers.HideAjax();
        },

        PostAjax: function (action, data, callback) {

            var jqxhr = $.post(action, data, function (returnedViewModel) {
                callback(returnedViewModel.ViewModel);
            })
            .done(function () { })
            .fail(function () { alert("error"); })
            .always(function () { })

        },

        PostAjaxPartialView: function (action, data, callback) {

            var jqxhr = $.post(action, data, function (returnedView) {
                callback(returnedView);
            })
            .done(function () { })
            .fail(function () { alert("error"); })
            .always(function () { })

        },

        RenderValidationErrors: function (validationErrors) {

            for (var val in validationErrors) {
                var obj = document.getElementById(val);
                if (obj != null) {
                    document.getElementById(val).setAttribute("class", "validation-error");
                }
            }
        },

        ClearValidationErrors: function () {
            $(':input').removeClass('validation-error');

        },

        FormatCurrency: function (num) {
            num = isNaN(num) || num === '' || num === null ? 0.00 : num;
            return parseFloat(num).toFixed(2);
        },

        FormatDate: function (jsonDate) {

            if (jsonDate == null) return "";
            if (jsonDate.length == 0) return "";

            var date = new Date(parseInt(jsonDate.substr(6)));

            var monthOfYear = parseInt(date.getMonth() + 1);
            var dayOfMonth = parseInt(date.getDate());

            if (monthOfYear < 10)
                monthOfYear = "0" + monthOfYear;

            if (dayOfMonth < 10)
                dayOfMonth = "0" + dayOfMonth;

            var output = monthOfYear + "/" + dayOfMonth + "/" + date.getFullYear();
            return output;
        },


        FormatJsonDate: function (jsonDate) {

            if (jsonDate == null) return "";
            if (jsonDate.length == 0) return "";

            var year = jsonDate.substr(0, 4);
            var month = jsonDate.substr(5, 2);
            var day = jsonDate.substr(8, 2);

            var tempDate = month + "/" + day + "/" + year;
            var date = new Date(tempDate);

            var monthOfYear = parseInt(date.getMonth() + 1);
            var dayOfMonth = parseInt(date.getDate());

            if (monthOfYear < 10)
                monthOfYear = "0" + monthOfYear;

            if (dayOfMonth < 10)
                dayOfMonth = "0" + dayOfMonth;

            var output = monthOfYear + "/" + dayOfMonth + "/" + date.getFullYear();
            return output;
        },


        FormatDateTime: function (jsonDate) {

            if (jsonDate == null) return "";
            if (jsonDate.length == 0) return "";

            var d = new Date(parseInt(jsonDate.substr(6)));
            var year = d.getFullYear();
            var month = MVC5WebApplication.Pad(d.getMonth() + 1);
            var day = MVC5WebApplication.Pad(d.getDate());
            var hour = MVC5WebApplication.Pad(d.getHours());
            var minutes = MVC5WebApplication.Pad(d.getMinutes());

            var dd = "AM";
            var h = hour;
            if (h >= 12) {
                h = hour - 12;
                dd = "PM";
            }
            if (h == 0) {
                h = 12;
            }

            var output = month + "/" + day + "/" + year + " " + h + ":" + minutes + " " + dd;

            return output;
        },

        Pad: function (num) {
            num = "0" + num;
            return num.slice(-2);
        },

        FormatDateMMDDYYYY: function (date) {

            var date = new Date(date);

            var monthOfYear = parseInt(date.getMonth() + 1);
            var dayOfMonth = parseInt(date.getDate());

            if (monthOfYear < 10)
                monthOfYear = "0" + monthOfYear;

            if (dayOfMonth < 10)
                dayOfMonth = "0" + dayOfMonth;

            var output = monthOfYear + "/" + dayOfMonth + "/" + date.getFullYear();
            return output;
        },


        DisplayTransactionStatus: function (statusNumber) {
            if (statusNumber == "1")
                return "Draft";
            if (statusNumber == "2")
                return "Approved";
            if (statusNumber == "3")
                return "Paid";
        },

        DisplayAjax: function () {

            $("#AjaxIndicator").dialog({
                resizable: false,
                position: 'center',
                height: 120,
                width: 300,
                modal: true,
                dialogClass: 'ajax-modal'
            });

        },

        HideAjax: function () {
            $("#AjaxIndicator").dialog('close');
        },

        RenderErrorMessage: function (errorMessage) {

            var returnMessage = "";
            for (var i = 0; i < errorMessage.length; i++) {
                returnMessage = returnMessage + errorMessage[i] + "<br/>";
            }

            var title = "Error Information";

            var html = "<div class='alert alert-block alert-error'>";
            html = html + "<button type='button' class='close' data-dismiss='alert'>&times;</button>";
            html = html + "<h4>" + title + "</h4>";
            html = html + returnMessage;
            html = html + "</div>";
            return html;

        },

        IsGuidEmpty: function (guid) {
            var emptyGuid = "00000000-0000-0000-0000-000000000000";
            if (guid == emptyGuid)
                return true;
            else
                return false;
        },

        SetEmptyGuid: function () {
            var emptyGuid = "00000000-0000-0000-0000-000000000000";
            return emptyGuid;
        },

        RenderInformationalMessage: function (informationalMessage) {

            toastr.info(informationalMessage);

            var title = "Informational Message";

            var html = "<div class='alert alert-block alert-info'>";
            html = html + "<button type='button' class='close' data-dismiss='alert'>&times;</button>";
            html = html + "<h4>" + title + "</h4>";
            html = html + informationalMessage;
            html = html + "</div>";
            return html;

        },

        DisplayAjax: function () {

            $.blockUI.defaults.css.border = '2px solid black';
            $.blockUI.defaults.overlayCSS.backgroundColor = 'white';
            $.blockUI.defaults.overlayCSS.opacity = .3;
            $.blockUI({ message: '<h3><img src="/img/ajax-loader-1.gif" /> Executing request...</h3>' });
            
        },

        HideAjax: function () {
            $.unblockUI();
        }

    };

}();