<%@include file="../jspFilesShared/A_head.jsp"%>
<title>Supprimer mon Profil</title>
<%@include file="../jspFilesShared/B_header.jsp"%>

<div id="SuperCard">

    <form action="delete" method="post">
        <h2>Souhaitez-vous vraiment nous quitter ?</h2>
        <button>Oui, supprimer mon compte</button>
        <a href="profil">Non, annuler</a>
    </form>
</div>

<%@include file="../jspFilesShared/D_footer.jsp"%>