$(document).ready(function () {
    $('#btn-add').click(function () {
        $.ajax({
            method: 'post',
            url: "/",
            success: function (response) {
                $("#employee-info-table").html(response)
                console.log(response)
            },
            error: function () {
                console.log('error')
            }
        })
    })

    $('#delete-btn').click(function () {
        let deleteContent = `<form action="#" th:action="@{/greeting}">
        <label for="employee-id" class="control-field-label">
            ID of employee to delete
            <input type="text" name="employee-id" id="id-input">
            <button type="button" class="btn btn-primary" id="delete-employee">Delete</button>

        </label>
        </form>`

        $('.control-fields').empty().append(deleteContent).toggle()
    });

    $('#delete-employee').click(function() {
        let id = $('#id-input').val()

        $.ajax({
            url: '/',
            method: 'delete',
            success: function () {

            },
            error: function () {

            }
        })
    })
})
