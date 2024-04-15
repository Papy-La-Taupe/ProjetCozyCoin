<%@ page import="fr.eni.cozycoin.bo.User" %>

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

<script defer src="${pageContext.request.contextPath}/jsFiles/jquery.min.js"></script>
<script defer src="${pageContext.request.contextPath}/jsFiles/home.js"></script>
<script defer src="${pageContext.request.contextPath}/jsFiles/profile.js"></script>
</head>
<body>

    <!-- Va servir a auto-rediriger vers la page de connexion si pas connecté. -->
    <%
        String requestURI = request.getRequestURI();
        User user = (User) session.getAttribute("connectedUser");
        if (user == null
        && !requestURI.endsWith("connexion.jsp")
        && !requestURI.endsWith("subscription.jsp")) {
            response.sendRedirect("connexion");
            return;
        }
    %>
    <header>

        <nav>
            <ul>
                <a href="home"><img src="${pageContext.request.contextPath}/medias/logo_test_cozycoin.png" alt="Logo du site"></a>
                <li><a href="#" id="Nav_Enchères">Encheres</a></li>
                <li><a href="newSale" id="Nav_Vendre">Vendre</a></li>
                <li><a href="profil" id="Nav_Profil">Mon profil</a></li>
                <li><a href="logout" id="Nav_Deconnexion">Se deconnecter</a></li>
            </ul>
        </nav>

    </header>
    <main>