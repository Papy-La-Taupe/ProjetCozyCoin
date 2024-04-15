<%@include file="../../jspFilesShared/A_head.jsp"%>
<title>Ajouter un article</title>
<%@include file="../../jspFilesShared/B_header.jsp"%>

    <div id="SuperCard">
        <form action="newSale" method="POST">
            <h2>Ajoutez un nouvel article !</h2>
            <div>
                <label>Nom de l'article : <input type="text" name="nomArticle" placeholder="Nom de l'article" title="Nom de l'article" required></label>
            </div>
            <div>
                <label>Description : <textarea name="description" placeholder="Description de l'article" title="Description de l'article" required></textarea></label>
            </div>
            <div>
                <label id="debutEnchere">Quand commenceront les encheres ?<input type="date" name="dateDebutEncheres" placeholder="Date de début des encheres" title="Date de début des enchères" required></label>
            </div>
            <div>
                <label id="finEnchere">Quand se termineront-elles ?<input type="date" name="dateFinEncheres" placeholder="Date de fin des encheres" title="Date de fin des enchères" required></label>
            </div>
            <div>
                <label>Prix initial : <input type="number" step="1" name="prixInitial" placeholder="Prix initial" title="Prix initial" required></label>
            </div>
            <div>
                <label>Numéro de la catégorie : <input type="number" name="noCategorie" placeholder="Numero de la categorie" title="Numéro de la catégorie" required></label>
            </div>
            <div id="Cancel">
                <a href="home"><img src="${pageContext.request.contextPath}/medias/cancel_to_rotate.png" alt="Cancel Button" title="Annuler la vente"></a>
                <button>Ajouter l'article</button>
            </div>

        </form>
    </div>
<%@include file="../../jspFilesShared/D_footer.jsp"%>
