import React from 'react';

const Formulario = () => {
    return (
        <div>
            <form>
                <input type="text" placeholder="Nome" />
                <input type="text" placeholder="Marca" />

                <input type="button" value="Cadastrar" />
                <input type="button" value="Alterar" />
                <input type="button" value="Remover" />
                <input type="button" value="Cancelar" />
            </form>
        </div>
    );
};

export default Formulario;
