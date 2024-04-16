<%@ page import="fr.eni.cozycoin.bo.Article" %>
<%@ page import="java.util.List" %>
<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Accueil</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

<form action="home" method="POST">
        <section id="specialFilter">
            <div>
                <label><input type="radio" id="OpenBidsMenu" checked>Achats</label>
                <label><input type="checkbox" id="OpenBids">Encheres ouvertes</label>
                <label><input type="checkbox" id="MyBids">Mes encheres en cours</label>
                <label><input type="checkbox" id="WonBids">Mes encheres remportees</label>
            </div>
            <div>
                <label><input type="radio" id="MyBidsMenu">Mes ventes</label>
                <label><input type="checkbox" id="MyOpenBids" disabled>Mes ventes en cours</label>
                <label><input type="checkbox" id="MyWaitingBids"disabled>Mes ventes non debutees</label>
                <label><input type="checkbox" id="MyFinishedBids" disabled>Mes ventes terminees</label>
            </div>
        </section>
        <section id="generalFilter">
            <div id="generalFilterId">
                <label><input type="search" id="BidsByName" placeholder="Le nom de l'article contient..."></label>
                <label>Categories<select id="BidsCategories">
                    //DOM generated
                </select></label>
                <button id="SearchButton" >Rechercher</button>
            </div>

        </section>
</form>

<div id="ItemCards">
    <c:forEach var="article" items="${articles}">
        <div class="card">
            <h3>${article.nom}</h3>
            <p id="Description">${article.description}</p>
            <p class="date">Mise en vente le: </p>
            <p class="date">${article.debut}</p>
            <p class="date">Fin des encheres le: </p>
            <p class="date">${article.fin}</p>
            <p class="price">Prix initial: ${article.prixInitial}</p>
            <p class="price">Encheres actuelles: ${article.prixVente}</p>
            <a href="#" class="btn btn-primary">Voir plus</a>
        </div>
    </c:forEach>
</div>

<%@include file="../jspFilesShared/D_footer.jsp"%>