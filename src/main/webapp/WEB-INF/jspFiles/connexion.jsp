<%--
  Created by IntelliJ IDEA.
  User: Proprietaire
  Date: 15/03/2024
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Se connecter</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

<div class="form">
    <form class="connexionForm" action="connexion" method="POST">
        <h2>Rejoindre votre espace</h2>
        <div class="connexionContainer">
            <label>Identifiant : <input type="text" title="Veuillez saisir votre adresse email ou votre pseudonyme"></label>
        </div>
        <div class="connexionContainer">
            <label>Mot de Passe : <input type="password" title="Veuillez saisir votre mot de passe"></label>
        </div>
        <div class="buttonBox">
            <label>Se souvenir de moi : <input type="checkbox" ></label>
            <a href="#">Mot de passe perdu ?</a>
            <button>Se connecter</button>
        </div>
    </form>
    <div class="creationCompte">
        <a href="#">Devenir membre</a>
    </div>
</div>


<%@include file="../jspFilesShared/D_footer.jsp"%>
