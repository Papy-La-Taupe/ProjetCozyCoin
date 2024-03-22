<%--
  Created by IntelliJ IDEA.
  User: papy-la-taupe
  Date: 06/03/2024
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/cssFilesShared/A_BaseStyle.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/cssFilesShared/B_HeaderStyle.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/cssFilesShared/C_MainStyle.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/cssFilesShared/D_FooterStyle.css">
</head>
<body>
    <header>

        <nav>
            <ul id="Nav_Ul" >
                <a id="Nav_Image_container" href="${pageContext.request.contextPath}/index.jsp"><img id="Nav_Image" src="${pageContext.request.contextPath}/medias/happycat.png" alt="Logo du site"></a>
                <li class="nav_Li"><a href="connexion" id="Nav_Connexion" class="nav_Button">S'inscrire | Se connecter</a></li>
                <li class="nav_Li"><a href="#" id="Nav_Enchères" class="nav_Button">Encheres</a></li>
                <li class="nav_Li"><a href="#" id="Nav_Vendre" class="nav_Button">Vendre</a></li>
                <li class="nav_Li"><a href="#" id="Nav_Profil" class="nav_Button">Mon profil</a></li>
                <li class="nav_Li"><a href="#" id="Nav_Deconnexion" class="nav_Button">Se deconnecter</a></li>
            </ul>
        </nav>

    </header>
    <main>