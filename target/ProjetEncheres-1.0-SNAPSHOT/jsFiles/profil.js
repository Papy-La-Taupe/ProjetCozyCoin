const pseudoUpdate = $('#UpdatePseudo');
const pseudoLabel = $('#PseudoLabel');
const pseudoInput = $('#PseudoInput');
const
pseudoUpdate.on('click',()=>{
    pseudoLabel.css('pointer-events', 'auto');
    pseudoInput.attr('readonly', false);
})



const UpdateNom = $('#UpdateNom');
const UpdatePrenom = $('#UpdatePrenom');
const UpdateEmail = $('#UpdateEmail');
const UpdateTelephone = $('#UpdateTelephone');
const UpdateRue = $('#UpdateRue');
const UpdateCodePostal = $('#UpdateCodePostal');
const UpdateVille = $('#UpdateVille');
const UpdateMotDePasse = $('#UpdateMotDePasse');


const nomInput = $('input[name="nom"]');
const prenomInput = $('input[name="prenom"]');
const emailInput = $('input[name="email"]');
const telephoneInput = $('input[name="telephone"]');
const rueInput = $('input[name="rue"]');
const codePostalInput = $('input[name="codePostal"]');
const villeInput = $('input[name="ville"]');
const motDePasseInput = $('input[name="motDePasse"]');

