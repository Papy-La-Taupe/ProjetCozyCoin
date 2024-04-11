$(document).ready(() => {
    const updateElements = [
        { id: 'UpdateNom', labelId: 'NomLabel', inputId: 'NomInput' },
        { id: 'UpdatePrenom', labelId: 'PrenomLabel', inputId: 'PrenomInput' },
        { id: 'UpdateEmail', labelId: 'EmailLabel', inputId: 'EmailInput' },
        { id: 'UpdateTelephone', labelId: 'TelephoneLabel', inputId: 'TelephoneInput' },
        { id: 'UpdateRue', labelId: 'RueLabel', inputId: 'RueInput' },
        { id: 'UpdateCodePostal', labelId: 'CodePostalLabel', inputId: 'CodePostalInput' },
        { id: 'UpdateVille', labelId: 'VilleLabel', inputId: 'VilleInput' },
        { id: 'UpdateMotDePasse', labelId: 'MotDePasseLabel', inputId: 'MotDePasseInput' }
    ];
    const update = $('button');

    updateElements.forEach(({ id, labelId, inputId }) => {
        const updateElement = $(`#${id}`);
        const labelElement = $(`#${labelId}`);
        const inputElement = $(`#${inputId}`);

        updateElement.on('click', () => {
            labelElement.css('pointer-events', 'auto');
            inputElement.attr('readonly', false);
            inputElement.css('background', 'rgba(230,171,150,0.4)');

            if(update.prop('disabled') && update.css('pointer-events', 'none')){
                update.prop('disabled', false);
                update.css('pointer-events', 'auto')
            }
        });
    });
});