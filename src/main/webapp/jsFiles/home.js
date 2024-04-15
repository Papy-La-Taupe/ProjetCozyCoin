$(document).ready(() => {
    const openBidsMenu = $('#OpenBidsMenu');
    const myBidsMenu = $('#MyBidsMenu');

    const openBids = $('#OpenBids');
    const myBids = $('#MyBids');
    const wonBids = $('#WonBids');

    const myOpenBids = $('#MyOpenBids');
    const myWaitingBids = $('#MyWaitingBids');
    const myFinishedBids = $('#MyFinishedBids');

    openBidsMenu.on('click', () => {
        myOpenBids.prop('disabled', true);
        myWaitingBids.prop('disabled', true);
        myFinishedBids.prop('disabled', true);

        openBids.prop('disabled', false);
        myBids.prop('disabled', false);
        wonBids.prop('disabled', false);

        myBidsMenu.prop('checked', false);
    });

    myBidsMenu.on('click', () => {
        openBids.prop('disabled', true);
        myBids.prop('disabled', true);
        wonBids.prop('disabled', true);

        myOpenBids.prop('disabled', false);
        myWaitingBids.prop('disabled', false);
        myFinishedBids.prop('disabled', false);

        openBidsMenu.prop('checked', false);
    });
});


