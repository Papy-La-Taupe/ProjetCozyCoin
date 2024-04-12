<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Accueil</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

<form action="home" method="POST">
    <fieldset id="HomeFilterLeftField">
        <legend>Filtres specifiques</legend>
        <section>
            <div>
                <label><input type="radio" id="OpenBidsMenu">Achats</label>
                <label><input type="checkbox" id="OpenBids">Encheres ouvertes</label>
                <label><input type="checkbox" id="MyBids">Mes encheres en cours</label>
                <label><input type="checkbox" id="WonBids">Mes encheres remportees</label>
            </div>
            <div>
                <label><input type="radio" id="MyBidsMenu">Mes ventes</label>
                <label><input type="checkbox" id="MyOpenBids">Mes ventes en cours</label>
                <label><input type="checkbox" id="MyWaitingBids">Mes ventes non debutees</label>
                <label><input type="checkbox" id="MyFinishedBids">Mes ventes terminees</label>
            </div>
        </section>

    </fieldset>
    <fieldset id="HomeFilterRightField">
        <legend>Filtres generaux</legend>
        <section>
            <label><input type="search" id="BidsByName" placeholder="Le nom de l'article contient..."></label>
            <label>Categories<select id="BidsCategories">
                //DOM generated
            </select></label>
            <button id="SearchButton" >Rechercher</button>
        </section>

    </fieldset>
</form>

<div>
    <h2>here will come the cards</h2>
</div>

<%@include file="../jspFilesShared/D_footer.jsp"%>