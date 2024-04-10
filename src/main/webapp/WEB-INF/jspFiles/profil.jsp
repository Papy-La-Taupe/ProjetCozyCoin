<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Mon Profil</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

    <form action="profil" method="POST">
        <h2>Mon profil</h2>
        <div>
            <label>Pseudo : <input type="text" name="pseudo" value="${connectedUser.pseudo}" readonly title="Votre identifiant sur le site" ></label>
            <img id="UpdatePseudo" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Nom : <input type="text" name="nom" value="${connectedUser.nom}" readonly title="Votre nom de famille complet" ></label>
            <img id="UpdateNom" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Prenom : <input type="text" name="prenom" value="${connectedUser.prenom}" readonly title="Votre prenom" ></label>
            <img id="UpdatePrenom" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Email : <input type="email" name="email" value="${connectedUser.email}" readonly title="L'adresse email permettant de vous contacter" ></label>
            <img id="UpdateEmail" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Telephone : <input type="text" name="telephone" value="${connectedUser.telephone}" readonly title="Le numero de telephone permettant de vous joindre (commence par 0, pas d'indicatif, pas d'espaces)" pattern="^0[0-9]{9}$" ></label>
            <img id="UpdateTelephone" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Rue : <input type="text" name="rue" value="${connectedUser.rue}" readonly title="L'adresse de facturation des produits acquis" ></label>
            <img id="UpdateRue" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Code Postal : <input type="text" name="codePostal" value="${connectedUser.codePostal}" readonly title="Simplement les 5 chiffres de votre Code Postal, sans espaces" pattern="^[0-9]{5}$" ></label>
            <img id="UpdateCodePostal" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Ville : <input type="text" name="ville" value="${connectedUser.ville}" readonly title="Complément d'adresse, nom de ville complet" ></label>
            <img id="UpdateVille" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <div>
            <label>Mot de Passe : <input type="password" name="motDePasse" value="${connectedUser.motDePasse}" readonly title="Votre mot de passe. il doit faire plus de 8 caractères, et inclure au moins 1 minuscule, 1 majuscule, et un symbole parmis les suivants : [!/?@-_]" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!/?@-_])(?=\S{8,}$)\S+$" ></label>
            <img id="UpdateMotDePasse" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="">
        </div>
        <button disabled>Actualiser le profil</button>
    </form>

<%@include file="../jspFilesShared/D_footer.jsp"%>
