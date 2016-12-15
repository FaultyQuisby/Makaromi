/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    // Initialize numeric spinner input boxes
    //$(".numeric-spinner").spinedit();
    // Initialize modal dialog
    // attach modal-container bootstrap attributes to links with .modal-link class.
    // when a link is clicked with these attributes, bootstrap will display the href content in a modal dialog.


    $('body').on('click', '.modal-link', function (e) {
        //alert("boy");
        e.preventDefault();
        $(this).attr('data-target', '#modal-container');
        $(this).attr('data-toggle', 'modal');
    });

    // ce qu'il faut faire avec le lien special ID : viewCartButton
    $('body').on('click', '#viewCartButton', function (e) {
        e.preventDefault();
        $("#modal-container").on("show.bs.modal", function (e) {
            $(this).find(".modal-content").load(e.relatedTarget.toString() + "IndexController?section=ModalController&modalAction=viewcart");
        });
    });





    // Attach listener to .modal-close-btn's so that when the button is pressed the modal dialog disappears
    $('body').on('click', '.modal-close-btn', function () {
        $('#modal-container').modal('hide');
    });


    //clear modal cache, so that new content can be loaded
    $('#modal-container').on('hidden.bs.modal', function () {
        $(this).removeData('bs.modal');
    });
    $('#CancelModal').on('click', function () {
        return false;
    });
});
