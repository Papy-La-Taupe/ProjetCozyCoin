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


    <form action="connexion" method="POST">
        <h2>Rejoindre votre espace</h2>
        <div>
            <label>Identifiant : <input type="text" name="identifiant" title="Veuillez saisir votre adresse email ou votre pseudonyme"></label>
        </div>
        <div>
            <label>Mot de Passe : <input type="password" name="motDePasse" title="Veuillez saisir votre mot de passe"></label>
        </div>
        <button>Se connecter</button>
        <div>
            <%
                String error = (String) request.getAttribute("error");
                if (error != null && error.equals("error")){
            %>
            <p><em>ce mix identifiant/mot de passe ne fonctionne pas</em></p>
            <% } %>
        </div>
        <div>
            <label>Se souvenir de moi : <input type="checkbox" ></label>
            <a href="#">Mot de passe perdu ?</a>
        </div>
        <div>
            <a href="#">Devenir membre</a>
        </div>
    </form>



<%@include file="../jspFilesShared/D_footer.jsp"%>
