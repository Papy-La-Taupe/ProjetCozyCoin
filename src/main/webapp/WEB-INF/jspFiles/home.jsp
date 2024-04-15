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

    <h2>here will come the cards</h2>

    <%
        List<Article> articles = (List<Article>) request.getAttribute("articles");
        if (articles != null && !articles.isEmpty()) {
            for (Article article : articles) {
    %>
    <div class="article-card">
        <h2><%= article.getNom() %></h2>
        <p><%= article.getDescription() %></p>
    </div>
    <%
            }
        } else {
            out.println("<p>No articles available.</p>");
        }
    %>

</div>

<%@include file="../jspFilesShared/D_footer.jsp"%>