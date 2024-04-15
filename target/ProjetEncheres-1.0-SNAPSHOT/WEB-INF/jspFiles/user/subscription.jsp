<%@include file="../../jspFilesShared/A_head.jsp"%>
<title>Inscription</title>
<%@include file="../../jspFilesShared/B_header.jsp"%>
<div id="SuperCard">
    <form action="subscription" method="POST">
        <h2>Rejoignez le mouvement !</h2>
        <div>
            <label>Pseudo : <input type="text" name="pseudo" placeholder="Votre pseudo" title="Votre identifiant sur le site" required></label>
        </div>
        <div>
            <label>Nom : <input type="text" name="nom" placeholder="Votre Nom" title="Votre nom de famille complet" required></label>
        </div>
        <div>
            <label>Prenom : <input type="text" name="prenom" placeholder="Votre Prenom" title="Votre prenom" required></label>
        </div>
        <div>
            <label>Email : <input type="email" name="email" placeholder="Votre adresse email" title="L'adresse email permettant de vous contacter" required></label>
        </div>
        <div>
            <label>Telephone : <input type="text" name="telephone" placeholder="Votre Numero de telephone" title="Le numero de telephone permettant de vous joindre (commence par 0, pas d'indicatif, pas d'espaces)" pattern="^0[0-9]{9}$" required></label>
        </div>
        <div>
            <label>Rue : <input type="text" name="rue" placeholder="Votre adresse" title="L'adresse de facturation des produits acquis" required></label>
        </div>
        <div>
            <label>Code Postal : <input type="text" name="codePostal" placeholder="Votre code postal" title="Simplement les 5 chiffres de votre Code Postal, sans espaces" pattern="^[0-9]{5}$" required></label>
        </div>
        <div>
            <label>Ville : <input type="text" name="ville" placeholder="Votre ville" title="Complément d'adresse, nom de ville complet" required></label>
        </div>
        <div>
            <label>Mot de Passe : <input type="password" name="motDePasse" placeholder="Mot de passe" title="Votre mot de passe. il doit faire plus de 8 caractères, et inclure au moins 1 minuscule, 1 majuscule, et un symbole parmis les suivants : [!/?@-_]" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[!/?@-_])(?=\S{8,}$)\S+$" required></label>
        </div>
        <button>Devenir membre</button>
    </form>
</div>
<%@include file="../../jspFilesShared/D_footer.jsp"%>