<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Mon Profil</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

    <form action="profil" method="POST">
        <h2>Mon profil</h2>
        <div>
            <a><img id="UpdatePseudo" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Pseudo"></a>
            <label id="PseudoLabel">Pseudo : <input id="PseudoInput" type="text" name="pseudo" value="${connectedUser.pseudo}" readonly title="Votre identifiant sur le site" ></label>
        </div>
        <div>
            <a><img id="UpdateNom" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Nom"></a>
            <label id="NomLabel">Nom : <input id="NomInput" type="text" name="nom" value="${connectedUser.nom}" readonly title="Votre nom de famille complet" ></label>
        </div>
        <div>
            <a><img id="UpdatePrenom" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Prenom"></a>
            <label id="PrenomLabel">Prenom : <input id="PrenomInput" type="text" name="prenom" value="${connectedUser.prenom}" readonly title="Votre prenom" ></label>
        </div>
        <div>
            <a><img id="UpdateEmail" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Email"></a>
            <label id="EmailLabel">Email : <input id="EmailInput" type="email" name="email" value="${connectedUser.email}" readonly title="L'adresse email permettant de vous contacter" ></label>
        </div>
        <div>
            <a><img id="UpdateTelephone" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Telephone"></a>
            <label id="TelephoneLabel">Telephone : <input id="TelephoneInput" type="text" name="telephone" value="${connectedUser.telephone}" readonly title="Le numero de telephone permettant de vous joindre (commence par 0, pas d'indicatif, pas d'espaces)" pattern="^0[0-9]{9}$" ></label>
        </div>
        <div>
            <a><img id="UpdateRue" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Rue"></a>
            <label id="RueLabel">Rue : <input id="RueInput" type="text" name="rue" value="${connectedUser.rue}" readonly title="L'adresse de facturation des produits acquis" ></label>
        </div>
        <div>
            <a><img id="UpdateCodePostal" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Code Postal"></a>
            <label id="CodePostalLabel">Code Postal : <input id="CodePostalInput" type="text" name="codePostal" value="${connectedUser.codePostal}" readonly title="Simplement les 5 chiffres de votre Code Postal, sans espaces" pattern="^[0-9]{5}$" ></label>
        </div>
        <div>
            <a><img id="UpdateVille" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Ville"></a>
            <label id="VilleLabel">Ville : <input id="VilleInput" type="text" name="ville" value="${connectedUser.ville}" readonly title="Complément d'adresse, nom de ville complet" ></label>
        </div>
        <div>
            <a><img id="UpdateMotDePasse" src="${pageContext.request.contextPath}/medias/update_profile2.png" alt="Update Mot de Passe"></a>
            <label id="MotDePasseLabel">Mot de Passe : <input id="MotDePasseInput" type="password" name="motDePasse" value="${connectedUser.motDePasse}" readonly title="Votre mot de passe. il doit faire plus de 8 caractères, et inclure au moins 1 minuscule, 1 majuscule, et un symbole parmis les suivants : [!/?@-_]" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!/?@-_])(?=\S{8,}$)\S+$" ></label>
        </div>
        <div>
            <a href="delete"><img src="${pageContext.request.contextPath}/medias/delete_button.png" alt="Delete Button"></a>
            <button disabled>Actualiser le profil</button>
        </div>
    </form>

<%@include file="../jspFilesShared/D_footer.jsp"%>
