//FILTERS

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





//ITEMCARDS
    const itemCards = $('#ItemCards');

    // Choose one of the following approaches:

    // 1. Passing Data from Server-side to JavaScript (assuming articlesJson is set in JSP):
    const articles = JSON.parse('<%= request.getAttribute("articles") %>');

    articles.forEach(article => {
        const card = $('<div class="item-card"></div>');

        const title = $('<h3></h3>').text(article.nom_article);
        const description = $('<p></p>').text(article.description);
        // ... Add more elements and content using jQuery selectors

        card.append(title, description); // Append elements to the card
        itemCards.append(card); // Append the card to the container
    });
});


